/*
 * To change this li            @Override
            public int getWidth(ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getHeight(ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public ImageProducer getSource() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Graphics getGraphics() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }ense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class Dash extends javax.swing.JFrame {
private util.Db d;
private entity.Barang sb;
private entity.Suplier ss;
private entity.Pelanggan sp;
private entity.Jual sj;
    /**
     * Creates new form Dash
     */
    public Dash(util.Db db) {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        pb2 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        btnMemasok = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        pb1 = new javax.swing.JButton();
        ldPenj = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSuplier = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tglJual = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblJual = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPelanggan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/wijaya/ikonwin.png")).getImage());
        setIconImages(getIconImages());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton1.setText("EXIT");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        pb2.setText("PENJUALAN BARU");
        pb2.setEnabled(false);
        pb2.setFocusable(false);
        pb2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pb2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb2ActionPerformed(evt);
            }
        });
        jToolBar1.add(pb2);

        jTabbedPane1.addTab("HOME", new javax.swing.ImageIcon(getClass().getResource("/wijaya/ikon-home-tab.png")), jToolBar1);

        jToolBar2.setRollover(true);

        jButton3.setText("TAMBAH");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton3);

        btnMemasok.setText("DISUPLAY");
        btnMemasok.setFocusable(false);
        btnMemasok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMemasok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemasokActionPerformed(evt);
            }
        });
        jToolBar2.add(btnMemasok);

        jTabbedPane1.addTab("BARANG", jToolBar2);

        jToolBar3.setRollover(true);

        jButton2.setText("TAMBAH PEMASOK");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar3.add(jButton2);

        jTabbedPane1.addTab("SUPLIER", jToolBar3);

        jToolBar4.setRollover(true);

        pb1.setText("PENJUALAN BARU");
        pb1.setEnabled(false);
        pb1.setFocusable(false);
        pb1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pb1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb1ActionPerformed(evt);
            }
        });
        jToolBar4.add(pb1);

        ldPenj.setText("LIHAT DETAIL");
        ldPenj.setEnabled(false);
        ldPenj.setFocusable(false);
        ldPenj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ldPenj.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ldPenj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldPenjActionPerformed(evt);
            }
        });
        jToolBar4.add(ldPenj);

        jTabbedPane1.addTab("PENJUALAN", jToolBar4);

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "NAMA", "HARGA", "STOK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblBarangMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        jTabbedPane2.addTab("BARANG", new javax.swing.ImageIcon(getClass().getResource("/wijaya/ikon-barang-tab.png")), jScrollPane1);

        tblSuplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA", "ALAMAT", "JENIS", "DICEKAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSuplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSuplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSuplier);

        jTabbedPane2.addTab("SUPLIER", new javax.swing.ImageIcon(getClass().getResource("/wijaya/ikon-supplier-tab.png")), jScrollPane2);

        jLabel1.setText("Tanggal");

        tglJual.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tglJualItemStateChanged(evt);
            }
        });

        tblJual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOTA", "TOTAL", "PELANGGAN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJualMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblJual);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tglJual, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tglJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
        );

        jTabbedPane2.addTab("PENJUALAN", new javax.swing.ImageIcon(getClass().getResource("/wijaya/ikon-penjualan-tab.png")), jPanel1);

        tblPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "NAMA", "ALAMAT", "TELEPON", "CEKAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPelangganMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblPelanggan);

        jTabbedPane2.addTab("PELANGGAN", new javax.swing.ImageIcon(getClass().getResource("/wijaya/ikon-pelanggan-tab.png")), jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    try {
        d.close();
        System.exit(0);
    } catch (SQLException ex) {
        util.Db.hindar(ex);
        System.exit(0);
    }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.formWindowClosing(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblBarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseEntered
    try {
        for(entity.Barang b:new entity.dao.DAOBarang(d).getDatae())
            if(5>b.getStok())JOptionPane.showMessageDialog(rootPane, "Barang "+b.getKode()+" tinggal sedikit. Mohon untuk disuplay.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.Db.hindar(ex);
    }
    }//GEN-LAST:event_tblBarangMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(isVisible())try {
                    refresh();
                    } catch (InterruptedException | SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                        util.Db.hindar(ex);
                    }
            }
        }).start();sb=null;
    }//GEN-LAST:event_formWindowOpened

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        int s=tblBarang.getSelectedRow();
        boolean b=tblBarang.isRowSelected(s);
        if(b)try {
            sb=new entity.Barang(""+tblBarang.getValueAt(s, 0), d);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_tblBarangMouseClicked

    private void tglJualItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tglJualItemStateChanged
        if(null!=tglJual.getItemAt(tglJual.getSelectedIndex()))try {
            jualTbl();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_tglJualItemStateChanged

    private void tblJualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJualMouseClicked
        int s=tblJual.getSelectedRow();
        boolean b=tblJual.isRowSelected(s);
        if(b)try {
            sj=new entity.Jual(""+tblJual.getValueAt(s, 0), d);
            ldPenj.setEnabled(b);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_tblJualMouseClicked

    private void pb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb2ActionPerformed
        if(!sp.isBlocked())try {
            int i=getTransNow();
            entity.Jual j=new entity.Jual(sp.getKode(), i);
            new entity.dao.DAOJual(d).insert(j);
            new ui.operation.jual.Add(d, j).setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            util.Db.hindar(ex);
        }else JOptionPane.showMessageDialog(rootPane, "Pelanggan ini dicekal");
    }//GEN-LAST:event_pb2ActionPerformed

    private void pb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb1ActionPerformed
        this.pb2ActionPerformed(evt);
    }//GEN-LAST:event_pb1ActionPerformed

    private void tblPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPelangganMouseClicked
        int s=tblPelanggan.getSelectedRow();
        boolean b=tblPelanggan.isRowSelected(s);
        if(b)try {
            sp=new entity.Pelanggan(""+tblPelanggan.getValueAt(s, 0), d);
            pb1.setEnabled(b);
            pb2.setEnabled(b);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_tblPelangganMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ui.operation.suplier.Add(d).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ui.operation.barang.Add(d).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ldPenjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldPenjActionPerformed
        new ui.operation.jual.LaporanJual(d, sj).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ldPenjActionPerformed

    private void tblSuplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSuplierMouseClicked
        int s=tblSuplier.getSelectedRow();
        boolean b=tblSuplier.isRowSelected(s);
        if(b)try {
            ss=new entity.Suplier(""+tblSuplier.getValueAt(s, 0), d);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            util.Db.hindar(ex);
        }
    }//GEN-LAST:event_tblSuplierMouseClicked

    private void btnMemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemasokActionPerformed
        new ui.operation.suplier.Login(d, "memasok").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMemasokActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMemasok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JButton ldPenj;
    private javax.swing.JButton pb1;
    private javax.swing.JButton pb2;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTable tblJual;
    private javax.swing.JTable tblPelanggan;
    private javax.swing.JTable tblSuplier;
    private javax.swing.JComboBox<String> tglJual;
    // End of variables declaration//GEN-END:variables

    private void refresh() throws InterruptedException, SQLException {
        barang();
        suplier();
        jual();
        if(null!=tglJual.getItemAt(tglJual.getSelectedIndex()))jualTbl();
        pelanggan();
        Thread.sleep(5000);
    }

    private void barang() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) tblBarang.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        for(entity.Barang b:new entity.dao.DAOBarang(d).getDatae())
            m.addRow(new Object[]{b.getKode(),b.getNm(),b.getHrg(),""+b.getStok()+" "+b.getSatuan()});
    }

    private void suplier() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) tblSuplier.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        for(entity.Suplier s:new entity.dao.DAOSuplier(d).getDatae())
            m.addRow(new Object[]{s.getId(),s.getNm(),s.getAlmt(),s.getTlp(),s.getJns(),s.isBlocked()});
    }

    private void jual() throws SQLException {
        tglJual.removeAllItems();
        java.sql.ResultSet rs=d.keluar("select distinct tgl from jual");
        while(rs.next())tglJual.addItem(rs.getString("tgl"));
        rs.close();
    }

    private void jualTbl() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) tblJual.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        java.sql.PreparedStatement ps=d.getPS("select nota,total,pel from jual where tgl=?");
        ps.setDate(1, java.sql.Date.valueOf(tglJual.getItemAt(tglJual.getSelectedIndex())));
        java.sql.ResultSet rs=ps.executeQuery();
        while(rs.next()){
            entity.Pelanggan p=new entity.Pelanggan(rs.getString("pel"), d);
            m.addRow(new Object[]{rs.getString("nota"),org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), rs.getLong("total")),p.getNm()});
        }rs.close();
        ps.close();
    }

    private void pelanggan() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) tblPelanggan.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        for(entity.Pelanggan p:new entity.dao.DAOPelanggan(d).getDatae())
            m.addRow(new Object[]{p.getKode(),p.getNm(),p.getAlmt(),p.getTlp(),p.isBlocked()});
    }

    private int getTransNow() throws SQLException {
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
