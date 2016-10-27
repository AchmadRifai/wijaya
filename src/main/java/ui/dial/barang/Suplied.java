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
public class Suplied extends javax.swing.JDialog {
private util.Db d;
    /**
     * Creates new form Suplied
     */
    public Suplied(java.awt.Frame parent, boolean modal,util.Db db) {
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
        brg = new javax.swing.JComboBox<>();
        sup = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        hrg = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jum = new javax.swing.JFormattedTextField();
        s = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Suplier");

        jLabel2.setText("Kode Barang");

        brg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Satu :" }));
        brg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brgItemStateChanged(evt);
            }
        });

        sup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Satu :" }));
        sup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                supItemStateChanged(evt);
            }
        });

        jLabel3.setText("Harga Beli");

        hrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        hrg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hrg.setText("0");
        hrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hrgKeyReleased(evt);
            }
        });

        jLabel4.setText("Jumlah Barang");

        jum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jum.setText("0.0");
        jum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumKeyReleased(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brg, 0, 225, Short.MAX_VALUE)
                            .addComponent(sup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hrg)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jum)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(brg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void brgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brgItemStateChanged
        if("Pilih Satu :"!=brg.getItemAt(brg.getSelectedIndex()))try {
            entity.Barang b=new entity.Barang(brg.getItemAt(brg.getSelectedIndex()), d);
            brg.setToolTipText(b.getNm());
        } catch (SQLException ex) {
            util.Db.hindar(ex);
        }else brg.setToolTipText("");
        refresh();
    }//GEN-LAST:event_brgItemStateChanged

    private void supItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supItemStateChanged
        if("Pilih Satu :"!=sup.getItemAt(sup.getSelectedIndex()))try {
            entity.Suplier s=new entity.Suplier(sup.getItemAt(sup.getSelectedIndex()), d);
            sup.setToolTipText(s.getNm());
            if(s.isBlocked()){
                JOptionPane.showMessageDialog(rootPane, "Penyuplai ini dicekal!");
                sup.setSelectedIndex(0);
                return;
            }
        } catch (SQLException ex) {
            util.Db.hindar(ex);
        }else sup.setToolTipText("");
        refresh();
    }//GEN-LAST:event_supItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try {
        for(entity.Barang b:new entity.dao.DAOBarang(d).getDatae())
            brg.addItem(b.getKode());
        for(entity.Suplier s:new entity.dao.DAOSuplier(d).getDatae())
            sup.addItem(s.getId());
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.Db.hindar(ex);
    }
    }//GEN-LAST:event_formWindowOpened

    private void hrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hrgKeyReleased
        if(hrg.isValid()&&!hrg.getText().isEmpty()){
            long l=Long.parseLong(hrg.getText());
            if(l>0)hrg.setForeground(Color.BLACK);
            else hrg.setForeground(Color.red);
        }refresh();
    }//GEN-LAST:event_hrgKeyReleased

    private void jumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumKeyReleased
        if(jum.isValid()&&!jum.getText().isEmpty()){
            float f=Float.parseFloat(jum.getText());
            if(0<f)jum.setForeground(Color.BLACK);
            else jum.setForeground(Color.red);
        }refresh();
    }//GEN-LAST:event_jumKeyReleased

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        long l=getSatuan();
    try {
        new entity.dao.DAOMemasok(d).insert(new entity.Memasok(brg.getItemAt(brg.getSelectedIndex()), sup.getItemAt(sup.getSelectedIndex()),
                org.joda.money.Money.of(CurrencyUnit.of("IDR"), l), Float.parseFloat(jum.getText())));
        normalkan();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setVisible(false);
    }//GEN-LAST:event_sActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brg;
    private javax.swing.JFormattedTextField hrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField jum;
    private javax.swing.JButton s;
    private javax.swing.JComboBox<String> sup;
    // End of variables declaration//GEN-END:variables

    private void refresh() {
        s.setEnabled(!brg.getToolTipText().isEmpty()&&!sup.getToolTipText().isEmpty()&&hrg.isValid()&&!hrg.getText().isEmpty()&&jum.isValid()&&!jum.getText().isEmpty()&&
        Color.BLACK==jum.getForeground()&&Color.BLACK==hrg.getForeground());
    }

    private long getSatuan() {
        return (long) (Long.parseLong(hrg.getText())/Float.parseFloat(jum.getText()));
    }

    private void normalkan() throws SQLException {
        entity.Barang a=new entity.Barang(brg.getItemAt(brg.getSelectedIndex()), d),b=new entity.Barang(brg.getItemAt(brg.getSelectedIndex()), d);
        b.setStok(a.getStok()+Float.parseFloat(jum.getText()));
        new entity.dao.DAOBarang(d).update(a, b);
    }
}
