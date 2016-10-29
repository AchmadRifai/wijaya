/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.SQLException;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class DetJual {
    private String nota,brg;
    private float jum;
    private org.joda.money.Money byr;

    public DetJual(String nota, String brg,util.Db d) throws SQLException {
        this.nota = nota;
        this.brg = brg;
        java.sql.PreparedStatement ps=d.getPS("select*from detjual where nota=? and brg=?");
        ps.setString(1, nota);
        ps.setString(2, brg);
        java.sql.ResultSet rs=ps.executeQuery();
        if(rs.next()){
            jum=rs.getFloat("jum");
            byr=org.joda.money.Money.of(CurrencyUnit.of("IDR"), rs.getLong("byr"));
        }rs.close();
        ps.close();
    }

    public DetJual(String nota, String brg, float jum,org.joda.money.Money byr) {
        this.nota = nota;
        this.brg = brg;
        this.jum = jum;
        this.byr=byr;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getBrg() {
        return brg;
    }

    public void setBrg(String brg) {
        this.brg = brg;
    }

    public float getJum() {
        return jum;
    }

    public void setJum(float jum) {
        this.jum = jum;
    }

    public org.joda.money.Money getByr() {
        return byr;
    }

    public void setByr(org.joda.money.Money byr) {
        this.byr = byr;
    }
}