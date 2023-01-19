/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.dao;

import entity.Pelanggan;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ai
 */
public class DAOPelanggan implements DAO<Pelanggan>{
    private util.Db d;

    public DAOPelanggan(util.Db db){
        d=db;
    }

    @Override
    public void createTable() throws SQLException {
        d.masuk("create table if not exists pelanggan("
                + "kode varchar(25)primary key,"
                + "nm varchar(20)not null,"
                + "almt text not null,"
                + "tlp char(15)not null,"
                + "deleted boolean not null,"
                + "blocked boolean not null"
                + ")");
    }

    @Override
    public void insert(Pelanggan v) throws SQLException {
        try (java.sql.PreparedStatement ps = d.getPS("select*from pelanggan where kode=?")) {
            ps.setString(1, v.getKode());
            try (java.sql.ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return;
            }
        }
        java.sql.PreparedStatement ps=d.getPS("insert into pelanggan values(?,?,?,?,?,?)");
        ps.setString(1, v.getKode());
        ps.setString(2, v.getNm());
        ps.setString(3, v.getAlmt());
        ps.setString(4, v.getTlp());
        ps.setBoolean(5, v.isDeleted());
        ps.setBoolean(6, v.isBlocked());
        ps.execute();
        ps.close();
    }

    @Override
    public void delete(Pelanggan w) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update pelanggan set deleted=? where kode=?");
        ps.setBoolean(1, true);
        ps.setString(2, w.getKode());
        ps.execute();
        ps.close();
    }

    @Override
    public void update(Pelanggan a, Pelanggan b) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update pelanggan set nm=?,almt=?,tlp=?,blocked=? where kode=?");
        ps.setString(1, b.getNm());
        ps.setString(2, b.getAlmt());
        ps.setString(3, b.getTlp());
        ps.setBoolean(4, b.isBlocked());
        ps.setString(5, a.getKode());
        ps.execute();
        ps.close();
    }

    @Override
    public ArrayList<Pelanggan> getDatae() throws SQLException {
        ArrayList<Pelanggan>a=new ArrayList<Pelanggan>();
        java.sql.ResultSet rs=d.keluar("select kode from pelanggan where not deleted");
        while(rs.next())a.add(new entity.Pelanggan(rs.getString("kode"), d));
        rs.close();
        return a;
    }
}