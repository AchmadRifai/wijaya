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
                + "total bigint not null"
                + ")");
        d.masuk("alter table jual add foreign key(pel)references pelanggan(kode)on update cascade on delete cascade");
    }

    @Override
    public void insert(Jual v) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("insert into jual values(?,?,?,?)");
        ps.setString(1, v.getNota());
        ps.setString(2, v.getPel());
        ps.setDate(3, v.getTgl());
        ps.setLong(4, v.getTotal().getAmount().longValue());
        ps.execute();
        ps.close();
    }

    @Override
    public void delete(Jual w) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("delete from jual where nota=?");
        ps.setString(1, w.getNota());
        ps.execute();
        ps.close();
    }

    @Override
    public void update(Jual a, Jual b) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update jual set pel=?,tgl=?,total=? where nota=?");
        ps.setString(1, b.getPel());
        ps.setDate(2, b.getTgl());
        ps.setLong(3, b.getTotal().getAmount().longValue());
        ps.setString(4, a.getNota());
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