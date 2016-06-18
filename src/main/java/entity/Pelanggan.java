/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.SQLException;

/**
 *
 * @author ai
 */
public class Pelanggan {
    private String kode,nm,almt,tlp;
    private boolean deleted,blocked;

    public Pelanggan(String kode,util.Db d) throws SQLException {
        this.kode = kode;
        java.sql.PreparedStatement ps=d.getPS("select*from pelanggan where kode=?");
        ps.setString(1,kode);
        java.sql.ResultSet rs=ps.executeQuery();
        if(rs.next()){
            nm=rs.getString("nm");
            almt=rs.getString("almt");
            tlp=rs.getString("tlp");
            deleted=rs.getBoolean("deleted");
            blocked=rs.getBoolean("blocked");
        }rs.close();
        ps.close();
    }

    public Pelanggan(String kode, String nm, String almt, String tlp) {
        this.kode = kode;
        this.nm = nm;
        this.almt = almt;
        this.tlp = tlp;
        blocked=false;
        deleted=false;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getAlmt() {
        return almt;
    }

    public void setAlmt(String almt) {
        this.almt = almt;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}