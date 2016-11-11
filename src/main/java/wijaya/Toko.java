/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wijaya;

import java.awt.AWTException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ai
 */
public class Toko {
    public static void main(String[]args){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            util.Db.hindar(ex);
        }java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                java.io.File f=new java.io.File(System.getProperty("user.home")+"/.wijaya/conn/");
                if(!f.exists())new ui.Start().setVisible(true);
                else try {
                    ui.Dash d=new ui.Dash(util.Work.currentDB());
                    d.setVisible(true);
                    util.Work.startTray();
                } catch (GeneralSecurityException | IOException | ClassNotFoundException | SQLException | AWTException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    util.Db.hindar(ex);
                }
            }
        });
    }
}