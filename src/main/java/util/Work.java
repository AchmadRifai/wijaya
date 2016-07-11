/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

/**
 *
 * @author ai
 */
public class Work {
    public static void createDB(String text, int port, String name, String user, String pass) throws SQLException {
        util.Db d=new util.Db(pass, "mysql", user, pass, port);
        d.masuk("create database "+name);
        d.setName(name);
        new entity.dao.DAOSuplier(d).createTable();
        new entity.dao.DAOBarang(d).createTable();
        new entity.dao.DAOMemasok(d).createTable();
        new entity.dao.DAOPelanggan(d).createTable();
        new entity.dao.DAOJual(d).createTable();
        new entity.dao.DADetJual(d).createTable();
        d.close();
    }

    public static void createKey(String host, int port, String name, String user, String pass) throws GeneralSecurityException, IOException, ClassNotFoundException {
        saveKey("host",host);
        saveKey("port",""+port);
        saveKey("name",name);
        saveKey("user",user);
        saveKey("pass",pass);
    }

    private static void saveKey(String mode, String host) throws GeneralSecurityException, IOException, ClassNotFoundException {
        java.io.File f=new java.io.File(System.getProperty("user.home")+"/.wijaya/conn/"+mode);
        if(!f.getParentFile().exists())f.getParentFile().mkdirs();
        RSA r=loadRSA();
        java.io.ObjectOutputStream o=new java.io.ObjectOutputStream(new java.io.FileOutputStream(f));
        o.writeObject(r.encrypt(host));
        o.close();
    }

    private static RSA loadRSA() throws GeneralSecurityException, IOException {
        return new util.RSA(new java.io.File(System.getProperty("user.home")+"/.wijaya/key/pri"),new java.io.File(System.getProperty("user.home")+"/.wijaya/key/pub"));
    }
}