/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.dao;

import entity.Memasok;
import java.sql.SQLException;
import java.util.ArrayList;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class DAOMemasok implements DAO<Memasok>{
    private util.Db d;

    public DAOMemasok(util.Db db){
        d=db;
    }

    @Override
    public void createTable() throws SQLException {
        d.masuk("create table memasok("
                + "brg varchar(25)not null,"
                + "sup varchar(20)not null,"
                + "sat bigint not null,"
                + "jum float unsigned not null,"
                + "tgl date not null"
                + ")");
        d.masuk("alter table memasok add foreign key(brg)references barang(kode)on update cascade on delete cascade");
        d.masuk("alter table memasok add foreign key(sup)references suplier(id)on update cascade on delete cascade");
    }

    @Override
    public void insert(Memasok v) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("insert into memasok values(?,?,?,?,?)");
        ps.setString(1, v.getBrg());
        ps.setString(2, v.getSup());
        ps.setLong(3, v.getSat().getAmount().longValue());
        ps.setFloat(4, v.getJum());
        ps.setDate(5, v.getTgl());
        ps.execute();
        ps.close();
    }

    @Override
    public void delete(Memasok w) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("delete from memasok where brg=? and sup=? and sat=? and jum=? and tgl=?");
        ps.setString(1, w.getBrg());
        ps.setString(2, w.getSup());
        ps.setLong(3, w.getSat().getAmount().longValue());
        ps.setFloat(4, w.getJum());
        ps.setDate(5, w.getTgl());
        ps.execute();
        ps.close();
    }

    @Override
    public void update(Memasok a, Memasok b) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update memasok set brg=?,sup=?,sat=?,jum=?,tgl=? where brg=? and sup=? and sat=? and jum=? and tgl=?");
        ps.setString(1, b.getBrg());
        ps.setString(2, b.getSup());
        ps.setLong(3, b.getSat().getAmount().longValue());
        ps.setFloat(4, b.getJum());
        ps.setDate(5, b.getTgl());
        ps.setString(6, a.getBrg());
        ps.setString(7, a.getSup());
        ps.setLong(8, a.getSat().getAmount().longValue());
        ps.setFloat(9, a.getJum());
        ps.setDate(10, a.getTgl());
        ps.execute();
        ps.close();
    }

    @Override
    public ArrayList<Memasok> getDatae() throws SQLException {
        ArrayList<Memasok>a=new ArrayList<Memasok>();
        java.sql.ResultSet rs=d.keluar("select*from memasok order by tgl desc");
        while(rs.next()){
            entity.Memasok m=new entity.Memasok(rs.getString("brg"), rs.getString("sup"), org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), rs.getBigDecimal("hrg"))
            ,rs.getFloat("jum"));
            m.setTgl(rs.getDate("tgl"));
            a.add(m);
        }rs.close();
        return a;
    }
}