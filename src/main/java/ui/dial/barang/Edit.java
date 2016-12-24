/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.dial.barang;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class Edit extends javax.swing.JDialog {
private util.Db d;
private entity.Barang b;
    /** Creates new form Edit */
    public Edit(java.awt.Frame parent, boolean modal,entity.Barang ba,util.Db db) {
        super(parent, modal);
        d=db;
        b=ba;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        satu = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        hrg = new javax.swing.JFormattedTextField();
        s = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENGUBAH DATA BARANG");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("Satuan");

        jLabel3.setText("Harga");

        satu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                satuKeyReleased(evt);
            }
        });

        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaKeyReleased(evt);
            }
        });

        hrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        hrg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hrg.setText("0");
        hrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hrgKeyReleased(evt);
            }
        });

        s.setText("SIMPAN");
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
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(satu, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(nama)
                            .addComponent(hrg))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(s)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyReleased
        s.setEnabled(!nama.getText().isEmpty()&&!satu.getText().isEmpty()&&Color.BLACK==hrg.getForeground()&&!hrg.getText().isEmpty()&&
        hrg.isValid());
    }//GEN-LAST:event_namaKeyReleased

    private void satuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_satuKeyReleased
        s.setEnabled(!nama.getText().isEmpty()&&!satu.getText().isEmpty()&&Color.BLACK==hrg.getForeground()&&!hrg.getText().isEmpty()&&
        hrg.isValid());
    }//GEN-LAST:event_satuKeyReleased

    private void hrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hrgKeyReleased
        if(!hrg.getText().isEmpty()&&hrg.isValid()){
            long l=Long.parseLong(hrg.getText());
            if(l>0)hrg.setForeground(Color.BLACK);
            else hrg.setForeground(Color.red);
        }s.setEnabled(!nama.getText().isEmpty()&&!satu.getText().isEmpty()&&Color.BLACK==hrg.getForeground()&&!hrg.getText().isEmpty()&&
        hrg.isValid());
    }//GEN-LAST:event_hrgKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hrg.setText(""+b.getHrg().getAmount().longValueExact());
        nama.setText(b.getNm());
        this.setTitle(this.getTitle()+" "+b.getKode());
        satu.setText(b.getSatuan());
    }//GEN-LAST:event_formWindowOpened

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
    try {
        entity.Barang n=new entity.Barang(b.getKode(), d);
        n.setNm(nama.getText());
        n.setSatuan(satu.getText());
        n.setHrg(org.joda.money.Money.of(CurrencyUnit.of("IDR"), Long.parseLong(hrg.getText())));
        new entity.dao.DAOBarang(d).update(b, n);
        this.setVisible(false);
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }//GEN-LAST:event_sActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField hrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nama;
    private javax.swing.JButton s;
    private javax.swing.JTextField satu;
    // End of variables declaration//GEN-END:variables

}