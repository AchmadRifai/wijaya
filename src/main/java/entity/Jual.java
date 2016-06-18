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
    private org.joda.money.Money total;

    public Jual(String nota,util.Db d) throws SQLException {
        this.nota = nota;
        java.sql.PreparedStatement ps=d.getPS("select*from jual where nota=?");
        ps.setString(1, nota);
        java.sql.ResultSet rs=ps.executeQuery();
        if(rs.next()){
            pel=rs.getString("pel");
            tgl=rs.getDate("tgl");
            total=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), rs.getBigDecimal("total"));
        }rs.close();
        ps.close();
    }

    public Jual(String pel,int i) {
        this.pel = pel;
        tgl=java.sql.Date.valueOf(LocalDate.now());
        total=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), 0);
        nota="wijaya"+tgl.getYear()+tgl.getMonth()+tgl.getDate()+i+pel;
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
}