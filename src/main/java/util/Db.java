/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 *
 * @author ai
 */
public class Db {
    public static void hindar(Exception ex) {
        java.util.Date d=new java.util.Date();
        java.io.File f=new java.io.File(System.getProperty("user.home")+"/.toko/error/"+d.getDate()+"-"+d.getMonth()+"-"+d.getYear()+"_"+d.getHours()+"-"+d.getMinutes()+"-"+
        d.getSeconds()+".log");
        if(!f.getParentFile().exists())f.getParentFile().mkdirs();
        try {
            java.io.PrintStream o=new java.io.PrintStream(f);
            ex.printStackTrace(o);
            o.close();
        } catch (FileNotFoundException ex1) {
            Db.hindar(ex1);
        }
    }

    private java.sql.Connection c;
    private java.sql.Statement s;
    private String host,name,user,pass;
    private int port;

    public void close() throws SQLException{
        s.close();
        c.close();
    }

    public void masuk(String sql) throws SQLException{
        s.executeUpdate(sql);
    }

    public java.sql.ResultSet keluar(String sql) throws SQLException{
        return s.executeQuery(sql);
    }

    public java.sql.PreparedStatement getPS(String sql) throws SQLException{
        return c.prepareStatement(sql);
    }

    public Db(String host, String name, String user, String pass, int port) throws SQLException {
        this.host = host;
        this.name = name;
        this.user = user;
        this.pass = pass;
        this.port = port;
        try {
            com.mysql.jdbc.Driver.class.newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Db.hindar(ex);
        }start();
    }

    private void start() throws SQLException {
        c=java.sql.DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+name, user, pass);
        s=c.createStatement();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) throws SQLException {
        close();
        this.host = host;
        start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws SQLException {
        close();
        this.name = name;
        start();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) throws SQLException {
        close();
        this.user = user;
        start();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) throws SQLException {
        close();
        this.pass = pass;
        start();
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) throws SQLException {
        close();
        this.port = port;
        start();
    }
}