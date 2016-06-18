/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.dao;

import entity.Suplier;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ai
 */
public class DAOSuplier implements DAO<Suplier>{
    private util.Db d;

    public DAOSuplier(util.Db db){
        d=db;
    }

    @Override
    public void createTable() throws SQLException {
        d.masuk("create table suplier("
                + "id varchar(20)primary key,"
                + "pass varchar(20)not null,"
                + "nm varchar(40)not null,"
                + "almt text not null,"
                + "jns varchar(10)not null,"
                + "tlp char(15)not null,"
                + "deleted boolean not null,"
                + "blocked boolean not null,"
                + "logon boolean not null"
                + ")");
    }

    @Override
    public void insert(Suplier v) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("insert into suplier values(?,?,?,?,?,?,?,?,?)");
        ps.setString(1, v.getId());
        ps.setString(2, v.getPass());
        ps.setString(3, v.getNm());
        ps.setString(4, v.getAlmt());
        ps.setString(5, v.getJns());
        ps.setString(6, v.getTlp());
        ps.setBoolean(7, v.isDeleted());
        ps.setBoolean(8, v.isBlocked());
        ps.setBoolean(9, v.isLogon());
        ps.execute();
        ps.close();
    }

    @Override
    public void delete(Suplier w) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update suplier set deleted=? where id=?");
        ps.setBoolean(1, true);
        ps.setString(2, w.getId());
        ps.execute();
        ps.close();
    }

    @Override
    public void update(Suplier a, Suplier b) throws SQLException {
        java.sql.PreparedStatement ps=d.getPS("update suplier set pass=?,nm=?,almt=?,jns=?,tlp=?,blocked=?,logon=? where id=?");
        ps.setString(1, b.getPass());
        ps.setString(2, b.getNm());
        ps.setString(3, b.getAlmt());
        ps.setString(4, b.getJns());
        ps.setString(5, b.getTlp());
        ps.setBoolean(6, b.isBlocked());
        ps.setBoolean(7, b.isLogon());
        ps.setString(8, a.getId());
        ps.execute();
        ps.close();
    }

    @Override
    public ArrayList<Suplier> getDatae() throws SQLException {
        ArrayList<Suplier>a=new ArrayList<Suplier>();
        java.sql.ResultSet rs=d.keluar("select id from suplier where not deleted");
        while(rs.next())a.add(new entity.Suplier(rs.getString("id"), d));
        rs.close();
        return a;
    }
}