/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.SQLException;

/**
 *
 * @author ai
 */
public class Trash extends javax.swing.JDialog {
private util.Db d;
private entity.Barang sb;
private entity.Jual sj;
private entity.Pelanggan sp;
private entity.Suplier ss;
    /**
     * Creates new form Trash
     */
    public Trash(java.awt.Frame parent, boolean modal,util.Db db) {
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

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        rb = new javax.swing.JButton();
        rj = new javax.swing.JButton();
        rp = new javax.swing.JButton();
        rs = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        barang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jual = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        pelanggan = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        suplier = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TEMPAT SAMPAH");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton1.setText("Kosongkan");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        rb.setText("Kembalikan Barang");
        rb.setEnabled(false);
        rb.setFocusable(false);
        rb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rb.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActionPerformed(evt);
            }
        });
        jToolBar1.add(rb);

        rj.setText("Kembalikan Penjualan");
        rj.setEnabled(false);
        rj.setFocusable(false);
        rj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rj.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rjActionPerformed(evt);
            }
        });
        jToolBar1.add(rj);

        rp.setText("Kembalikan Pelanggan");
        rp.setEnabled(false);
        rp.setFocusable(false);
        rp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpActionPerformed(evt);
            }
        });
        jToolBar1.add(rp);

        rs.setText("Kembalikan Suplier");
        rs.setEnabled(false);
        rs.setFocusable(false);
        rs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsActionPerformed(evt);
            }
        });
        jToolBar1.add(rs);

        barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "NAMA", "Harga", "STOK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(barang);
        if (barang.getColumnModel().getColumnCount() > 0) {
            barang.getColumnModel().getColumn(2).setResizable(false);
        }

        jTabbedPane1.addTab("BARANG", jScrollPane1);

        jual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nota", "Kode Pelanggan", "Tanggal", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jualMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jual);

        jTabbedPane1.addTab("PENJUALAN", jScrollPane2);

        pelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "Nama", "Alamat", "Telp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelangganMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(pelanggan);

        jTabbedPane1.addTab("PELANGGAN", jScrollPane3);

        suplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "Nama Perusahaan", "Alamat", "Telp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        suplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suplierMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(suplier);

        jTabbedPane1.addTab("SUPLIER", jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        barang();
        jual();
        pelanggan();
        suplier();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int c=javax.swing.JOptionPane.YES_NO_OPTION;
        int x=javax.swing.JOptionPane.showConfirmDialog(rootPane, "Apa anda ingin menghapus semua data disini?", "Hapus?", c);
        if(x==javax.swing.JOptionPane.YES_OPTION)try {
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            bersihBarang();
            bersihJual();
            bersihPelanggan();
            bersihSuplier();
        } catch (SQLException ex) {
            util.Db.hindar(ex);
        }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangMouseClicked
        int s=barang.getSelectedRow();
        boolean b=barang.isRowSelected(s);
        if(b)try {
            sb=new entity.Barang(""+barang.getValueAt(s, 0), d);
            rb.setEnabled(b);
        } catch (SQLException ex) {
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_barangMouseClicked

    private void jualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jualMouseClicked
        int s=jual.getSelectedRow();
        boolean b=jual.isRowSelected(s);
        if(b)try {
            sj=new entity.Jual(""+jual.getValueAt(s, 0), d);
            rj.setEnabled(b);
        } catch (SQLException ex) {
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_jualMouseClicked

    private void pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelangganMouseClicked
        int s=pelanggan.getSelectedRow();
        boolean b=pelanggan.isRowSelected(s);
        if(b)try {
            sp=new entity.Pelanggan(""+pelanggan.getValueAt(s, 0), d);
            rp.setEnabled(b);
        } catch (SQLException ex) {
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_pelangganMouseClicked

    private void suplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suplierMouseClicked
        int s=suplier.getSelectedRow();
        boolean b=suplier.isRowSelected(s);
        if(b)try {
            ss=new entity.Suplier(""+suplier.getValueAt(s, 0), d);
            rs.setEnabled(b);
        } catch (SQLException ex) {
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_suplierMouseClicked

    private void rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActionPerformed
    try {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        java.sql.PreparedStatement p=d.getPS("update barang set deleted=? where kode=?");
        p.setBoolean(1, false);
        p.setString(2, sb.getKode());
        p.execute();
        p.close();
        barang();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_rbActionPerformed

    private void rjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rjActionPerformed
    try {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        java.sql.PreparedStatement p=d.getPS("update jual set deleted=? where nota=?");
        p.setBoolean(1, false);
        p.setString(2, sj.getNota());
        p.execute();
        p.close();
        jual();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_rjActionPerformed

    private void rpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpActionPerformed
    try {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        java.sql.PreparedStatement p=d.getPS("update pelanggan set deleted=? where kode=?");
        p.setBoolean(1, false);
        p.setString(2, sp.getKode());
        p.execute();
        p.close();
        pelanggan();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_rpActionPerformed

    private void rsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsActionPerformed
    try {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        java.sql.PreparedStatement p=d.getPS("update suplier set deleted where id=?");
        p.setBoolean(1, false);
        p.setString(2, ss.getId());
        p.execute();
        p.close();
        suplier();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_rsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable barang;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jual;
    private javax.swing.JTable pelanggan;
    private javax.swing.JButton rb;
    private javax.swing.JButton rj;
    private javax.swing.JButton rp;
    private javax.swing.JButton rs;
    private javax.swing.JTable suplier;
    // End of variables declaration//GEN-END:variables

    private void bersihBarang() throws SQLException {
        d.masuk("delete from barang where deleted");
        barang();
    }

    private void barang() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) barang.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        for(entity.Barang b:util.Sampah.getSampahBarang(d))
            m.addRow(new Object[]{b.getKode(),b.getNm(),b.getHrg(),""+b.getStok()+" "+b.getSatuan()});
    }

    private void jual() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) jual.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        for(entity.Jual j:util.Sampah.getSampahJual(d))
            m.addRow(new Object[]{j.getNota(),j.getPel(),j.getTgl(),j.getTotal()});
    }

    private void pelanggan() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) pelanggan.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        for(entity.Pelanggan p:util.Sampah.getSampahPelanggan(d))
            m.addRow(new Object[]{p.getKode(),p.getNm(),p.getAlmt(),p.getTlp()});
    }

    private void suplier() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) suplier.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        for(entity.Suplier s:util.Sampah.getSampahSuplier(d))
            m.addRow(new Object[]{s.getId(),s.getNm(),s.getAlmt(),s.getTlp()});
    }

    private void bersihJual() throws SQLException {
        d.masuk("delete from jual where deleted");
        jual();
    }

    private void bersihPelanggan() throws SQLException {
        d.masuk("delete from pelanggan where deleted");
        pelanggan();
    }

    private void bersihSuplier() throws SQLException {
        d.masuk("delete from suplier where deleted");
        suplier();
    }
}
