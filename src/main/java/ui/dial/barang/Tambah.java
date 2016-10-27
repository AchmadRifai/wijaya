/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dial.barang;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class Tambah extends javax.swing.JDialog {
private util.Db d;
    /**
     * Creates new form Tambah
     */
    public Tambah(java.awt.Frame parent, boolean modal,util.Db db) {
        super(parent, modal);
        d=db;
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
        nm = new javax.swing.JTextField();
        kode = new javax.swing.JTextField();
        satuan = new javax.swing.JTextField();
        hrg = new javax.swing.JFormattedTextField();
        s = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Satuan");

        jLabel4.setText("Harga");

        nm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nmKeyReleased(evt);
            }
        });

        kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kodeKeyReleased(evt);
            }
        });

        satuan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                satuanKeyReleased(evt);
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

        s.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wijaya/sd-card.png"))); // NOI18N
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
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nm)
                    .addComponent(kode)
                    .addComponent(satuan)
                    .addComponent(hrg, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(s, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(s)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(rootPane, "Nothing to do!");
    }//GEN-LAST:event_formWindowClosing

    private void kodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeKeyReleased
    try {
        entity.Barang b=new entity.Barang(kode.getText(), d);
        if(null==b.getHrg())kode.setForeground(Color.BLACK);
        else kode.setForeground(Color.red);
    } catch (SQLException ex) {
        util.Db.hindar(ex);
        kode.setForeground(Color.red);
    }refresh();
    }//GEN-LAST:event_kodeKeyReleased

    private void nmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nmKeyReleased
        refresh();
    }//GEN-LAST:event_nmKeyReleased

    private void satuanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_satuanKeyReleased
        refresh();
    }//GEN-LAST:event_satuanKeyReleased

    private void hrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hrgKeyReleased
        if(hrg.isValid()&&!hrg.getText().isEmpty()){
            int i=Integer.parseInt(hrg.getText());
            if(i>0)hrg.setForeground(Color.BLACK);
            else hrg.setForeground(Color.red);
        }refresh();
    }//GEN-LAST:event_hrgKeyReleased

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
    try { 
        entity.Barang b=new entity.Barang(kode.getText(), nm.getText(), satuan.getText(), org.joda.money.Money.of(CurrencyUnit.of("IDR"),
                Long.parseLong(hrg.getText())), 0);
        new entity.dao.DAOBarang(d).insert(b);
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setVisible(false);
    }//GEN-LAST:event_sActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField hrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nm;
    private javax.swing.JButton s;
    private javax.swing.JTextField satuan;
    // End of variables declaration//GEN-END:variables

    private void refresh() {
        s.setEnabled(hrg.isValid()&&!hrg.getText().isEmpty()&&Color.BLACK==hrg.getForeground()&&Color.BLACK==kode.getForeground()&&!kode.getText().isEmpty()&&
        !nm.getText().isEmpty()&&!satuan.getText().isEmpty());
    }
}