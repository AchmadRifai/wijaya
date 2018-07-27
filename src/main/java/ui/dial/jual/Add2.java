/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dial.jual;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ashura
 */
public class Add2 extends javax.swing.JDialog {
private util.Db d;
private entity.Jual j;
private java.awt.Frame p;
private float maxBeli,curbeli;
    /**
     * Creates new form Add2
     * @param parent
     * @param modal
     */
    public Add2(java.awt.Frame parent, boolean modal,util.Db db,entity.Jual ju) {
        super(parent, modal);
        d=db;
        p=parent;
        j=ju;
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
        cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        qty = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cari Barang");

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        jLabel2.setText("Jumlah");

        qty.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 0.1f));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(this::muat).start();
        this.setTitle("Penjualan "+j.getNota());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    try {
        java.sql.PreparedStatement p=d.getPS("delete from jual where nota=?");
        p.setString(1, j.getNota());
        p.execute();
        p.close();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        muat();
    }//GEN-LAST:event_cariKeyReleased

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        int s=tblBarang.getSelectedRow();
    if(tblBarang.isRowSelected(s))try {
        entity.Barang b=new entity.Barang(""+tblBarang.getModel().getValueAt(s, 0), d);
        maxBeli=b.getStok();
        getCurBeli(s);
        qty.setModel(new javax.swing.SpinnerNumberModel(curbeli, 0, maxBeli, 0.1));
    } catch (SQLException ex) {
        Logger.getLogger(Add2.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_tblBarangMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner qty;
    private javax.swing.JTable tblBarang;
    // End of variables declaration//GEN-END:variables

    private void muat() {
    if(cari.getText().isEmpty())try {
        javax.swing.table.DefaultTableModel m=new javax.swing.table.DefaultTableModel(new String[]{"Kode","Nama","Stok","Harga"}, 0);
        tblBarang.setModel(m);
        entity.dao.DAOBarang dao=new entity.dao.DAOBarang(d);
        for(entity.Barang b:dao.getDatae()){
            m.addRow(new Object[]{b.getKode(),b.getNm(),""+b.getStok()+" "+b.getSatuan(),b.getHrg()});
        }
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }else golekBarang();
    }

    private void golekBarang() {
    try {
        javax.swing.table.DefaultTableModel m=new javax.swing.table.DefaultTableModel(new String[]{"Kode","Nama","Stok","Harga"}, 0);
        tblBarang.setModel(m);
        java.sql.ResultSet r=d.keluar("select*from barang where not deleted and nm like \"%"+cari.getText()+"%\"");
        while(r.next()){
            m.addRow(new Object[]{r.getString("kode"),r.getString("nm"),""+r.getFloat("stok")+" "+r.getString("satuan"),
            org.joda.money.Money.of(CurrencyUnit.of("IDR"), r.getLong("hrg"))});
        } r.close();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }

    private void getCurBeli(int s) throws SQLException {
        java.sql.PreparedStatement p=d.getPS("select jum from detjual where nota=? and brg=?");
        p.setString(1, j.getNota());
        p.setString(2, ""+tblBarang.getModel().getValueAt(s, 0));
        java.sql.ResultSet r=p.executeQuery();
        if(r.next())curbeli=r.getFloat("jum");
        else curbeli=0;
        r.close();
        p.close();
    }
}
