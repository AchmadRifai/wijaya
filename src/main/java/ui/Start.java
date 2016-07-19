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

/**
 *
 * @author ai
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        port = new javax.swing.JSpinner();
        host = new javax.swing.JTextField();
        s = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database Connector");

        jLabel1.setText("Host");

        jLabel2.setText("Port");

        jLabel3.setText("DBName");

        jLabel4.setText("User");

        jLabel5.setText("Password");

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        port.setModel(new javax.swing.SpinnerNumberModel(1000, 1000, null, 1));
        port.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                portStateChanged(evt);
            }
        });

        host.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hostKeyReleased(evt);
            }
        });

        s.setText("SAVE and Connect");
        s.setEnabled(false);
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass)
                            .addComponent(user)
                            .addComponent(name)
                            .addComponent(host, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(s)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hostKeyReleased
        s.setEnabled(!host.getText().isEmpty()&&!name.getText().isEmpty()&&!user.getText().isEmpty());
    }//GEN-LAST:event_hostKeyReleased

    private void portStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_portStateChanged
        this.hostKeyReleased(null);
    }//GEN-LAST:event_portStateChanged

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        this.hostKeyReleased(evt);
    }//GEN-LAST:event_nameKeyReleased

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
        this.hostKeyReleased(evt);
    }//GEN-LAST:event_userKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        this.hostKeyReleased(evt);
    }//GEN-LAST:event_passKeyReleased

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        buatDB();
        buatKunci();
        disableAll();
    }//GEN-LAST:event_sActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField host;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JSpinner port;
    private javax.swing.JButton s;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    private void buatDB() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    util.Work.createDB(host.getText(),Integer.parseInt(""+port.getValue()),name.getText(),user.getText(),pass.getText());
                    JOptionPane.showMessageDialog(rootPane, "Database created!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    ennableAll();
                    util.Db.hindar(ex);
                }
            }
        }).start();
    }

    private void buatKunci() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    util.Work.createKey(host.getText(), Integer.parseInt(""+port.getValue()), name.getText(), user.getText(), pass.getText());
                } catch (GeneralSecurityException | IOException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    util.Db.hindar(ex);
                }
            }
        }).start();
    }

    private void disableAll() {
        host.setEnabled(false);
        port.setEnabled(false);
        s.setEnabled(false);
        name.setEnabled(false);
        user.setEnabled(false);
        pass.setEnabled(false);
    }

    private void ennableAll() {
        name.setEnabled(true);
        user.setEnabled(true);
        pass.setEnabled(true);
        host.setEnabled(true);
        port.setEnabled(true);
        util.Work.hapusKey();
    }
}
