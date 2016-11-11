/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.AWTException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

/**
 *
 * @author ai
 */
public class Work {
    public static void createDB(String host, int port, String name, String user, String pass) throws SQLException {
        util.Db d=new util.Db(host, "mysql", user, pass, port);
        d.masuk("create database "+name);
        d.setName(name);
        new entity.dao.DAOSuplier(d).createTable();
        new entity.dao.DAOBarang(d).createTable();
        new entity.dao.DAOMemasok(d).createTable();
        entity.dao.DAOPelanggan dao=new entity.dao.DAOPelanggan(d);
        dao.createTable();
        dao.insert(new entity.Pelanggan("anonym", "Tak dikenal", "-", "-"));
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
        return new RSA(new java.io.File(System.getProperty("user.home")+"/.wijaya/key/pri"),new java.io.File(System.getProperty("user.home")+"/.wijaya/key/pub"));
    }

    public static Db currentDB() throws GeneralSecurityException, IOException, ClassNotFoundException, SQLException {
        String host=loadKey("host"),name=loadKey("name"),user=loadKey("user"),pass=loadKey("pass");
        int port=loadPort();
        return new Db(host, name, user, pass, port);
    }

    private static String loadKey(String mode) throws GeneralSecurityException, IOException, ClassNotFoundException {
        java.io.File f=new java.io.File(System.getProperty("user.home")+"/.wijaya/conn/"+mode);
        RSA r=loadRSA();
        java.io.ObjectInputStream i=new java.io.ObjectInputStream(new java.io.FileInputStream(f));
        String s=r.decrypt((byte[]) i.readObject());
        i.close();
        return s;
    }

    private static int loadPort() throws GeneralSecurityException, IOException, ClassNotFoundException {
        java.io.File f=new java.io.File(System.getProperty("user.home")+"/.wijaya/conn/port");
        RSA r=loadRSA();
        java.io.ObjectInputStream i=new java.io.ObjectInputStream(new java.io.FileInputStream(f));
        String s=r.decrypt((byte[]) i.readObject());
        i.close();
        return Integer.parseInt(s);
    }

    public static void hapusKey() {
        dleDir(System.getProperty("user.home")+"/.wijaya/key");
        dleDir(System.getProperty("user.home")+"/.wijaya/conn");
    }

    private static void dleDir(String dir) {
        java.io.File d=new java.io.File(dir);
        for(java.io.File f:d.listFiles()){
            if(f.isDirectory())dleDir(f.getAbsolutePath());
            else f.delete();
        }d.delete();
    }

    public static void startTray() throws AWTException {
        if(java.awt.SystemTray.isSupported()){
            java.awt.TrayIcon t=new java.awt.TrayIcon(getIcon());
            java.awt.SystemTray.getSystemTray().add(t);
            java.awt.PopupMenu p=new java.awt.PopupMenu("Wijaya");
            t.setPopupMenu(p);
            fillPopup(p);
        }else javax.swing.JOptionPane.showMessageDialog(null, "Sistem Tray tidak didukung!");
    }

    private static java.awt.Image getIcon() {
        return new javax.swing.ImageIcon(Work.class.getResource("/wijaya/ikonwin.png")).getImage();
    }

    private static void fillPopup(java.awt.PopupMenu p) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}