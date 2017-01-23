/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.SQLException;
import java.time.LocalDate;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class Jual {
    private String nota,pel;
    private java.sql.Date tgl;
    private org.joda.money.Money total,kembali,byr;
    private boolean deleted;
    private java.util.List<DetJual>det;

    public Jual(String nota,util.Db d) throws SQLException {
        this.nota = nota;
        java.sql.PreparedStatement ps=d.getPS("select*from jual where nota=?");
        ps.setString(1, nota);
        java.sql.ResultSet rs=ps.executeQuery();
        if(rs.next()){
            pel=rs.getString("pel");
            tgl=rs.getDate("tgl");
            total=org.joda.money.Money.parse(rs.getString("total"));
            deleted=rs.getBoolean("deleted");
            kembali=org.joda.money.Money.parse(rs.getString("kembali"));
            byr=org.joda.money.Money.parse(rs.getString("byr"));
        }rs.close();
        ps.close();
        detaile(d);
    }

    public Jual(String pel,int i) {
        this.pel = pel;
        tgl=java.sql.Date.valueOf(LocalDate.now());
        total=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), 0);
        kembali=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), 0);
        byr=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), 0);
        nota="wijaya"+tgl.getYear()+tgl.getMonth()+tgl.getDate()+i+pel;
        deleted=false;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getPel() {
        return pel;
    }

    public void setPel(String pel) {
        this.pel = pel;
    }

    public java.sql.Date getTgl() {
        return tgl;
    }

    public void setTgl(java.sql.Date tgl) {
        this.tgl = tgl;
    }

    public org.joda.money.Money getTotal() {
        return total;
    }

    public void setTotal(org.joda.money.Money total) {
        this.total = total;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    private void detaile(util.Db d) throws SQLException {
        det=new java.util.LinkedList<DetJual>();
        java.sql.PreparedStatement ps=d.getPS("select brg from detjual where nota=?");
        ps.setString(1, nota);
        java.sql.ResultSet rs=ps.executeQuery();
        while(rs.next())det.add(new entity.DetJual(nota, rs.getString("brg"), d));
        rs.close();
        ps.close();
    }

    public java.util.List<DetJual> getDet() {
        return det;
    }

    public void setDet(java.util.List<DetJual> det) {
        this.det = det;
    }

    public org.joda.money.Money getKembali() {
        return kembali;
    }

    public void setKembali(org.joda.money.Money kembali) {
        this.kembali = kembali;
    }

    public org.joda.money.Money getByr() {
        return byr;
    }

    public void setByr(org.joda.money.Money byr) {
        this.byr = byr;
    }
}