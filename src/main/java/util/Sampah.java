/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.SQLException;

/**
 *
 * @author ai
 */
public class Sampah {
    public static java.util.List<entity.Barang>getSampahBarang(Db d) throws SQLException{
        java.util.List<entity.Barang>l=new java.util.LinkedList<entity.Barang>();
        java.sql.ResultSet r=d.keluar("select kode from barang where deleted");
        while(r.next())l.add(new entity.Barang(r.getString("kode"), d));
        r.close();
        return l;
    }

    public static java.util.List<entity.Jual>getSampahJual(Db d) throws SQLException{
        java.util.List<entity.Jual>l=new java.util.LinkedList<entity.Jual>();
        java.sql.ResultSet r=d.keluar("select nota from jual where deleted");
        while(r.next())l.add(new entity.Jual(r.getString("nota"), d));
        r.close();
        return l;
    }

    public static java.util.List<entity.Pelanggan>getSampahPelanggan(Db d) throws SQLException{
        java.util.List<entity.Pelanggan>l=new java.util.LinkedList<entity.Pelanggan>();
        java.sql.ResultSet r=d.keluar("select kode from pelanggan where deleted");
        while(r.next())l.add(new entity.Pelanggan(r.getString("kode"), d));
        r.close();
        return l;
    }

    public static java.util.List<entity.Suplier>getSampahSuplier(Db d) throws SQLException{
        java.util.List<entity.Suplier>l=new java.util.LinkedList<entity.Suplier>();
        java.sql.ResultSet r=d.keluar("select id from suplier where deleted");
        while(r.next())l.add(new entity.Suplier(r.getString("id"), d));
        r.close();
        return l;
    }
}