/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.dao;

import entity.Jual;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ai
 */
public class DAOJual implements DAO<entity.Jual>{
    private util.Db d;

    public DAOJual(util.Db db){
        d=db;
    }

    @Override
    public void createTable() throws SQLException {
        d.masuk("create table jual("
                + "nota varchar(37)primary key,"
                + "pel varchar(25)not null,"
                + "tgl date not null,"
                + "total text not null,"
                + "kembali text not null,"
                + "byr text not null,"
                + "deleted boolean not null"
                + ")");
        d.masuk("alter table jual add foreign key(pel)references pelanggan(kode)on update cascade on delete cascade");
    }

    @Override
    public void insert(Jual v) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("insert into jual values(?,?,?,?,?,?,?)");
        ps.setString(1, v.getNota());
        ps.setString(2, v.getPel());
        ps.setDate(3, v.getTgl());
        ps.setString(4, v.getTotal().toString());
        ps.setString(5, v.getKembali().toString());
        ps.setString(6, v.getByr().toString());
        ps.setBoolean(7, v.isDeleted());
        ps.execute();
        ps.close();
    }

    @Override
    public void delete(Jual w) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update jual set deleted=? where nota=?");
        ps.setBoolean(1, true);
        ps.setString(2, w.getNota());
        ps.execute();
        ps.close();
    }

    @Override
    public void update(Jual a, Jual b) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update jual set pel=?,tgl=?,total=?,kembali=?,byr=? where nota=?");
        ps.setString(1, b.getPel());
        ps.setDate(2, b.getTgl());
        ps.setString(3, b.getTotal().toString());
        ps.setString(4, b.getKembali().toString());
        ps.setString(5, b.getByr().toString());
        ps.setString(6, a.getNota());
        ps.execute();
        ps.close();
    }

    @Override
    public ArrayList<Jual> getDatae() throws SQLException {
        ArrayList<Jual>a=new ArrayList<Jual>();
        java.sql.ResultSet rs=d.keluar("select nota from jual order by tgl desc");
        while(rs.next())a.add(new entity.Jual(rs.getString("nota"), d));
        rs.close();
        return a;
    }
}