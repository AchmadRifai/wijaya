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
public class Suplier {
    private String id,pass,nm,almt,jns,tlp;
    private boolean deleted,blocked,logon;

    public Suplier(String id,util.Db d) throws SQLException {
        this.id = id;
        java.sql.PreparedStatement ps=d.getPS("select*from suplier where id=?");
        ps.setString(1, id);
        java.sql.ResultSet rs=ps.executeQuery();
        if(rs.next()){
            pass=rs.getString("pass");
            nm=rs.getString("nm");
            almt=rs.getString("almt");
            jns=rs.getString("jns");
            tlp=rs.getString("tlp");
            deleted=rs.getBoolean("deleted");
            blocked=rs.getBoolean("blocked");
            logon=rs.getBoolean("logon");
        }rs.close();
        ps.close();
    }

    public Suplier(String id, String pass, String nm, String almt, String jns, String tlp) {
        this.id = id;
        this.pass = pass;
        this.nm = nm;
        this.almt = almt;
        this.jns = jns;
        this.tlp = tlp;
        deleted=false;
        blocked=false;
        logon=false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public String getJns() {
        return jns;
    }

    public void setJns(String jns) {
        this.jns = jns;
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

    public boolean isLogon() {
        return logon;
    }

    public void setLogon(boolean logon) {
        this.logon = logon;
    }
}