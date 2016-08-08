/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.dao;

import entity.DetJual;
import java.sql.SQLException;
import java.util.ArrayList;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class DADetJual implements DAO<DetJual>{
    private util.Db d;

    public DADetJual(util.Db db){
        d=db;
    }

    @Override
    public void createTable() throws SQLException {
        d.masuk("create table detjual("
                + "nota varchar(37)not null,"
                + "brg varchar(25)not null,"
                + "jum int not null,"
                + "byr bigint not null"
                + ")");
        d.masuk("alter table detjual add foreign key(nota)references jual(nota)on update cascade on delete cascade");
        d.masuk("alter table detjual add foreign key(brg)references barang(kode)on update cascade on delete cascade");
    }

    @Override
    public void insert(DetJual v) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("insert into detjual values(?,?,?,?)");
        ps.setString(1, v.getNota());
        ps.setString(2, v.getBrg());
        ps.setInt(3, v.getJum());
        ps.setLong(4, v.getByr().getAmount().longValue());
        ps.execute();
        ps.close();
    }

    @Override
    public void delete(DetJual w) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("delete from detjual where nota=? and brg=? and jum=? and byr=?");
        ps.setString(1, w.getNota());
        ps.setString(2, w.getBrg());
        ps.setInt(3, w.getJum());
        ps.setLong(4, w.getByr().getAmount().longValue());
        ps.execute();
        ps.close();
    }

    @Override
    public void update(DetJual a, DetJual b) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update detjual set nota=?,pel=?,brg=?,byr=? where nota=? and brg=? and jum=? and byr=?");
        ps.setString(1, b.getNota());
        ps.setString(2, b.getBrg());
        ps.setInt(3, b.getJum());
        ps.setLong(4, b.getByr().getAmount().longValue());
        ps.setString(5, a.getNota());
        ps.setString(6, a.getBrg());
        ps.setInt(7, a.getJum());
        ps.setLong(8, a.getByr().getAmount().longValue());
        ps.execute();
        ps.close();
    }

    @Override
    public ArrayList<DetJual> getDatae() throws SQLException {
        ArrayList<DetJual>a=new ArrayList<DetJual>();
        java.sql.ResultSet rs=d.keluar("select*from detjual");
        while(rs.next())a.add(new entity.DetJual(rs.getString("nota"), rs.getString("brg"), rs.getInt("jum")
        ,org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), rs.getLong("byr"))));
        rs.close();
        return a;
    }
}