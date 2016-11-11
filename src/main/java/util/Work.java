/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.AWTException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;
import java.time.LocalDate;

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

    public static void startTray() throws AWTException, GeneralSecurityException, IOException, ClassNotFoundException, SQLException {
        if(java.awt.SystemTray.isSupported()){
            java.awt.TrayIcon t=new java.awt.TrayIcon(getIcon());
            java.awt.SystemTray.getSystemTray().add(t);
            java.awt.PopupMenu p=new java.awt.PopupMenu("Wijaya");
            t.setPopupMenu(p);
            fillPopup(p);
        }else javax.swing.JOptionPane.showMessageDialog(null, "Sistem Tray tidak didukung!");
    }

    private static java.awt.Image getIcon() {
        return new javax.swing.ImageIcon(Work.class.getResource("/wijaya/ikonwin.gif")).getImage();
    }

    private static void fillPopup(java.awt.PopupMenu p) throws GeneralSecurityException, IOException, ClassNotFoundException, SQLException {
        java.awt.MenuItem exit=new java.awt.MenuItem("EXIT"),show=new java.awt.MenuItem("Tayangkan Dashboard");
        show.addActionListener((ActionEvent e)->{
            try {
                new ui.Dash(currentDB()).setVisible(true);
            } catch (GeneralSecurityException | IOException | ClassNotFoundException | SQLException ex) {
                java.awt.TrayIcon t=(java.awt.TrayIcon) p.getParent();
                    t.displayMessage("SQL Error", ex.getMessage(), java.awt.TrayIcon.MessageType.ERROR);
                    util.Db.hindar(ex);
            }
        });p.add(show);
        java.awt.Menu trans=new java.awt.Menu("Transaksi Baru");
        initTrans(trans);
        p.add(trans);
        p.addSeparator();
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });p.add(exit);
    }

    private static void newTrans(String p) throws GeneralSecurityException, IOException, ClassNotFoundException, SQLException {
        Db d=Work.currentDB();
        int i=getTransNow(d);
        entity.Jual j=new entity.Jual(p, i);
        new entity.dao.DAOJual(d).insert(j);
        ui.dial.jual.Add a=new ui.dial.jual.Add(null, true, d, j);
        a.setVisible(true);
        while(a.isVisible()){}
        d.close();
    }

    private static void initTrans(java.awt.Menu trans) throws GeneralSecurityException, IOException, ClassNotFoundException, SQLException {
        Db d=currentDB();
        for(entity.Pelanggan p:new entity.dao.DAOPelanggan(d).getDatae()){
            java.awt.MenuItem i=new java.awt.MenuItem(p.getKode());
            i.addActionListener((ActionEvent e)->{
                try {
                    i.setEnabled(false);
                    newTrans(i.getLabel());
                    i.setEnabled(true);
                } catch (GeneralSecurityException | IOException | ClassNotFoundException | SQLException ex) {
                    java.awt.PopupMenu po=(java.awt.PopupMenu) trans.getParent();
                    java.awt.TrayIcon t=(java.awt.TrayIcon) po.getParent();
                    t.displayMessage("SQL Error", ex.getMessage(), java.awt.TrayIcon.MessageType.ERROR);
                    util.Db.hindar(ex);
                }
            });trans.add(i);
        }d.close();
    }

    private static int getTransNow(Db d) throws SQLException {
        int i=0;
        java.sql.PreparedStatement ps=d.getPS("select count(nota)as jum from jual where tgl=?");
        ps.setDate(1, java.sql.Date.valueOf(LocalDate.now()));
        java.sql.ResultSet rs=ps.executeQuery();
        if(rs.next())i=1+rs.getInt("jum");
        rs.close();
        ps.close();
        return i;
    }
}