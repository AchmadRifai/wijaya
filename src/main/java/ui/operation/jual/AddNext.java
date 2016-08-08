/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.operation.jual;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class AddNext extends javax.swing.JFrame {
private util.Db d;
private entity.Jual j;
private java.util.ArrayList<entity.DetJual>ad;
    /**
     * Creates new form AddNext
     */
    public AddNext(util.Db db,entity.Jual ju,java.util.ArrayList<entity.DetJual>a) {
        ad=a;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        item = new javax.swing.JTable();
        t = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        uang = new javax.swing.JFormattedTextField();
        kembali = new javax.swing.JLabel();
        g = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE BARANG", "JUMLAH", "HARGA SATUAN", "HARGA SEMUA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(item);

        t.setText("Total : ???");

        jLabel1.setText("Masukan Jumlah Uang : ");

        uang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uangFocusLost(evt);
            }
        });

        kembali.setText("Kembali : ???");

        g.setText("MENUJU LAPORAN");
        g.setEnabled(false);
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addComponent(t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uang))
                    .addComponent(g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(g)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try {
        settTable();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.Db.hindar(ex);
    }setTotal();
    }//GEN-LAST:event_formWindowOpened

    private void uangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uangFocusLost
        try{
            int i=Integer.parseInt(uang.getText());
            org.joda.money.Money l=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), 0);
        for(int x=0;x<item.getRowCount();x++){
            org.joda.money.Money m=(org.joda.money.Money) item.getValueAt(x, 3);
            l=l.plus(m);
        }int kurang=i-l.getAmount().intValue();
        if(kurang>=0){
            if(kurang==0)kembali.setText("Uang anda pas");
            else kembali.setText("Kembali : "+org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), kurang));
            g.setEnabled(true);
        }else kembali.setText("Kurang : "+org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), kurang*-1));
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            util.Db.hindar(e);
        }
    }//GEN-LAST:event_uangFocusLost

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
    try {
        entity.Jual j2=new entity.Jual(j.getNota(), d);
        org.joda.money.Money l=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), 0);
        for(int x=0;x<item.getRowCount();x++){
            org.joda.money.Money m=(org.joda.money.Money) item.getValueAt(x, 3);
            l=l.plus(m);
        }j2.setTotal(l);
        new entity.dao.DAOJual(d).update(j, j2);
        for(entity.DetJual dj:ad)new entity.dao.DADetJual(d).insert(dj);
        setJumlahBarang();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        util.Db.hindar(ex);
    }new ui.operation.jual.LaporanJual(d, j).setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_gActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton g;
    private javax.swing.JTable item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kembali;
    private javax.swing.JLabel t;
    private javax.swing.JFormattedTextField uang;
    // End of variables declaration//GEN-END:variables

    private void settTable() throws SQLException {
        javax.swing.table.DefaultTableModel m=(javax.swing.table.DefaultTableModel) item.getModel();
        for(entity.DetJual dj:ad){
            entity.Barang b=new entity.Barang(dj.getBrg(), d);
            m.addRow(new Object[]{dj.getBrg(),dj.getJum(),b.getHrg(),dj.getByr()});
        }
    }

    private void setTotal() {
        org.joda.money.Money l=org.joda.money.Money.of(CurrencyUnit.getInstance("IDR"), 0);
        for(int x=0;x<item.getRowCount();x++){
            org.joda.money.Money m=(org.joda.money.Money) item.getValueAt(x, 3);
            l=l.plus(m);
        }t.setText("Total : "+l);
    }

    private void setJumlahBarang() throws SQLException {
        for(entity.DetJual dj:ad){
            entity.Barang a=new entity.Barang(dj.getBrg(), d),b=new entity.Barang(dj.getBrg(), d);
            b.setStok(a.getStok()-dj.getJum());
            new entity.dao.DAOBarang(d).update(a, b);
        }
    }
}
