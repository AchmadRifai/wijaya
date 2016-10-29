/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dial.jual;

import java.math.RoundingMode;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class Add extends javax.swing.JDialog {
private util.Db d;
private entity.Jual j;
    /**
     * Creates new form Add
     */
    public Add(java.awt.Frame parent, boolean modal,util.Db db,entity.Jual ju) {
        super(parent, modal);
        d=db;
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

        jPanel1 = new javax.swing.JPanel();
        brg = new javax.swing.JComboBox<>();
        nmBrg = new javax.swing.JLabel();
        hrgBrg = new javax.swing.JLabel();
        jum = new javax.swing.JSpinner();
        satuan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        item = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PEMILIHAN BARANG"));

        brg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Satu :" }));
        brg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brgItemStateChanged(evt);
            }
        });

        nmBrg.setText("Nama BRG : ???");

        hrgBrg.setText("Harga BRG : ???");

        jum.setEnabled(false);
        jum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jumStateChanged(evt);
            }
        });

        satuan.setText("???");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jum)
                    .addComponent(brg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(satuan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nmBrg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                        .addComponent(hrgBrg)
                        .addGap(197, 197, 197))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nmBrg)
                    .addComponent(hrgBrg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuan))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE BRG", "NAMA BRG", "SATUAN", "QTY", "HRG SATUAN", "BAYAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(item);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(rootPane, "Nothing to do!");
        hapus();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setTitle("PENJUALAN FAKTUR "+j.getNota());
        muat();
    }//GEN-LAST:event_formWindowOpened

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    }//GEN-LAST:event_formMouseMoved

    private void brgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brgItemStateChanged
        if(0<brg.getSelectedIndex())try {
            entity.Barang b=new entity.Barang(brg.getItemAt(brg.getSelectedIndex()), d);
            entity.DetJual dj=new entity.DetJual(j.getNota(), b.getKode(), d);
            if(null==dj.getByr())jum.setModel(new javax.swing.SpinnerNumberModel(0, 0, b.getStok(), 0.1));
            else jum.setModel(new javax.swing.SpinnerNumberModel(dj.getJum(), 0, b.getStok(), 0.1));
            jum.setEnabled(true);
            nmBrg.setText("Nama BRG : "+b.getNm());
            satuan.setText(b.getSatuan());
            hrgBrg.setText("Harga BRG : "+b.getHrg());
        } catch (SQLException ex) {
            util.Db.hindar(ex);
        }else{
            jum.setEnabled(false);
            nmBrg.setText("Nama BRG : ???");
            hrgBrg.setText("Harga BRG : ???");
            satuan.setText("???");
        }
    }//GEN-LAST:event_brgItemStateChanged

    private void jumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumStateChanged
        float f=Float.parseFloat(jum.getValue().toString());
        if(f>0)masuk();
        else tokno();
    }//GEN-LAST:event_jumStateChanged

    private void hapus() {
    try {
        java.sql.PreparedStatement ps=d.getPS("delete from jual where nota=?");
        ps.setString(1, j.getNota());
        ps.execute();
        ps.close();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }

    private void muat() {
    try {
        for(entity.Barang b:new entity.dao.DAOBarang(d).getDatae())if(0<b.getStok())brg.addItem(b.getKode());
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brg;
    private javax.swing.JLabel hrgBrg;
    private javax.swing.JTable item;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jum;
    private javax.swing.JLabel nmBrg;
    private javax.swing.JLabel satuan;
    // End of variables declaration//GEN-END:variables

    private void masuk() {
    try {
        entity.DetJual a=new entity.DetJual(j.getNota(), brg.getItemAt(brg.getSelectedIndex()), d);
        if(null==a.getByr()){
            entity.Barang bar=new entity.Barang(brg.getItemAt(brg.getSelectedIndex()), d);
            double byrd=bar.getHrg().getAmount().doubleValue()*Float.parseFloat(jum.getValue().toString());
            org.joda.money.Money m=org.joda.money.Money.of(CurrencyUnit.of("IDR"), Math.round(byrd));
            new entity.dao.DADetJual(d).insert(new entity.DetJual(j.getNota(), bar.getKode(), Float.parseFloat(jum.getValue().toString()), m));
        }else{
            entity.Barang bar=new entity.Barang(brg.getItemAt(brg.getSelectedIndex()), d);
            double byrd=bar.getHrg().getAmount().doubleValue()*Float.parseFloat(jum.getValue().toString());
            org.joda.money.Money m=org.joda.money.Money.of(CurrencyUnit.of("IDR"), Math.round(byrd));
            entity.DetJual b=new entity.DetJual(a.getNota(), a.getNota(), Float.parseFloat(jum.getValue().toString()),m);
            new entity.dao.DADetJual(d).update(a, b);
        }refresh();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }

    private void tokno() {
    try {
        entity.DetJual dj=new entity.DetJual(j.getNota(), brg.getItemAt(brg.getSelectedIndex()), d);
        new entity.dao.DADetJual(d).delete(dj);
        refresh();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }

    private void refresh() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) item.getModel();
        for(int x=m.getRowCount()-1;x>=0;x--)m.removeRow(x);
        java.sql.PreparedStatement ps=d.getPS("select*from detjual where nota=?");
        ps.setString(1, j.getNota());
        java.sql.ResultSet rs=ps.executeQuery();
        while(rs.next()){
            entity.Barang b=new entity.Barang(rs.getString("brg"), d);
            entity.DetJual dj=new entity.DetJual(j.getNota(), rs.getString("brg"), d);
            m.addRow(new Object[]{b.getKode(),b.getNm(),b.getSatuan(),dj.getJum(),b.getHrg(),dj.getByr()});
        }rs.close();
        ps.close();
    }

}
