/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.SQLException;
import org.joda.money.Money;

/**
 *
 * @author ai
 */
public class Barang {
    private String kode,nm,satuan;
    private Money hrg,beli;
    private float stok;
    private boolean deleted,biji;

    public Barang(String kode,util.Db d) throws SQLException {
        this.kode = kode;
        java.sql.PreparedStatement ps=d.getPS("select*from barang where kode=?");
        ps.setString(1, kode);
        java.sql.ResultSet rs=ps.executeQuery();
        if(rs.next()){
            nm=rs.getString("nm");
            satuan=rs.getString("satuan");
            hrg=Money.parse(rs.getString("hrg"));
            deleted=rs.getBoolean("deleted");
            stok=rs.getFloat("stok");
            biji=rs.getBoolean("biji");
        }rs.close();
        ps.close();
    }

    public Barang(String kode, String nm, String satuan, Money hrg, Money beli, float stok, boolean biji) {
        this.kode = kode;
        this.nm = nm;
        this.satuan = satuan;
        this.hrg = hrg;
        this.beli = beli;
        this.stok = stok;
        this.biji = biji;
        deleted = false;
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

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Money getHrg() {
        return hrg;
    }

    public void setHrg(Money hrg) {
        this.hrg = hrg;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public float getStok() {
        return stok;
    }

    public void setStok(float stok) {
        this.stok = stok;
    }

    public boolean isBiji() {
        return biji;
    }

    public void setBiji(boolean biji) {
        this.biji = biji;
    }

    public Money getBeli() {
        return beli;
    }

    public void setBeli(Money beli) {
        this.beli = beli;
    }
}