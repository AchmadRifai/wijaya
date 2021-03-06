/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dial.pelanggan;

import java.sql.SQLException;

/**
 *
 * @author ai
 */
public class Edit extends javax.swing.JDialog {
private util.Db d;
private entity.Pelanggan p;
    /**
     * Creates new form Edit
     */
    public Edit(java.awt.Frame parent, boolean modal,util.Db db,entity.Pelanggan sp) {
        super(parent, modal);
        p=sp;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        almt = new javax.swing.JTextArea();
        tlp = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        blocked = new javax.swing.JCheckBox();
        s = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Pelanggan ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("Telp");

        jLabel3.setText("Alamat");

        almt.setColumns(20);
        almt.setRows(5);
        almt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                almtKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(almt);

        tlp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tlpKeyReleased(evt);
            }
        });

        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaKeyReleased(evt);
            }
        });

        blocked.setText("Dicekal");
        blocked.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blockedStateChanged(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tlp)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(blocked)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(tlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blocked)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setTitle(this.getTitle()+p.getNm());
    }//GEN-LAST:event_formWindowOpened

    private void blockedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blockedStateChanged
        refresh();
    }//GEN-LAST:event_blockedStateChanged

    private void namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyReleased
        refresh();
    }//GEN-LAST:event_namaKeyReleased

    private void tlpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlpKeyReleased
        refresh();
    }//GEN-LAST:event_tlpKeyReleased

    private void almtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_almtKeyReleased
        refresh();
    }//GEN-LAST:event_almtKeyReleased

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));try {
        entity.Pelanggan b=new entity.Pelanggan(p.getKode(), d);
        b.setAlmt(almt.getText());
        b.setBlocked(blocked.isSelected());
        b.setNm(nama.getText());
        b.setTlp(tlp.getText());
        new entity.dao.DAOPelanggan(d).update(p, b);
        this.setVisible(false);
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_sActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea almt;
    private javax.swing.JCheckBox blocked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JButton s;
    private javax.swing.JTextField tlp;
    // End of variables declaration//GEN-END:variables

    private void refresh() {
        s.setEnabled(!almt.getText().isEmpty()&&!nama.getText().isEmpty()&&!tlp.getText().isEmpty());
    }
}
