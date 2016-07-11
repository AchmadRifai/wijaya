/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;

/**
 *
 * @author ai
 */
public class VR {
    public void show(){
        try {
            util.Db d=util.Work.currentDB();
            java.util.ArrayList<entity.Barang>a=new entity.dao.DAOBarang(d).getDatae();
            net.sf.jasperreports.engine.data.JRBeanCollectionDataSource data=new net.sf.jasperreports.engine.data.JRBeanCollectionDataSource(a);
            java.util.Map m=new java.util.HashMap<String,entity.Barang>();
            net.sf.jasperreports.engine.JasperReport r=JasperCompileManager.compileReport(System.getProperty("user.home")+"/.wijaya//report1.jrxml");
            net.sf.jasperreports.engine.JasperPrint p=JasperFillManager.fillReport(r, m, data);
            new net.sf.jasperreports.view.JasperViewer(p).setVisible(true);
            d.close();
        } catch (GeneralSecurityException | IOException | ClassNotFoundException | SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            util.Db.hindar(ex);
        }
    }
}