/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wijaya;

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
            }
        });
    }
}