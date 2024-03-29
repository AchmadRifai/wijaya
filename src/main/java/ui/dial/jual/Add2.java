/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dial.jual;

import java.math.RoundingMode;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ashura
 */
public class Add2 extends javax.swing.JDialog {
private util.Db d;
private entity.Jual j;
private java.awt.Frame p;
private entity.Barang b;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        lstBeli = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        byr = new javax.swing.JFormattedTextField();
        kembali = new javax.swing.JTextField();
        n = new javax.swing.JButton();
        satuanBrg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
        qty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qtyStateChanged(evt);
            }
        });

        lstBeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barang", "Qty", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(lstBeli);

        jLabel3.setText("Total");

        jLabel4.setText("Bayar");

        jLabel5.setText("Kembali");

        total.setEditable(false);
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        byr.setEditable(false);
        byr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        byr.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        byr.setText("0");
        byr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                byrKeyReleased(evt);
            }
        });

        kembali.setEditable(false);
        kembali.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        kembali.setText("0");

        n.setText("BELI");
        n.setEnabled(false);
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        satuanBrg.setText("-");

        jLabel6.setText(".00");

        jLabel7.setText("IDR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(n)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(satuanBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(byr, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6)))
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
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satuanBrg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(byr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        b=new entity.Barang(""+tblBarang.getModel().getValueAt(s, 0), d);
        satuanBrg.setText(b.getSatuan());
        maxBeli=b.getStok();
        getCurBeli(s);
        double op = 0.1;
        if(b.isBiji())op=1.0;
        double min=0.0;
        qty.setModel(new javax.swing.SpinnerNumberModel(curbeli, min, maxBeli, op));
        javax.swing.JSpinner.NumberEditor ne=(javax.swing.JSpinner.NumberEditor) qty.getEditor();
        ne.getFormat().setMinimumFractionDigits(1);
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }//GEN-LAST:event_tblBarangMouseClicked

    private void qtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qtyStateChanged
    if(b!=null)try {
        float f=Float.parseFloat(""+qty.getValue());
        if(f>0.0f){
            if(isAdaItem())ubahJumlah();
            else sisipBaru();
        }else delItem();
        fillItem();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }//GEN-LAST:event_qtyStateChanged

    private void byrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_byrKeyReleased
        if(!byr.getText().isEmpty()&&byr.isValid()){
            org.joda.money.Money m1=org.joda.money.Money.parse(total.getText()),
                    m2=org.joda.money.Money.of(CurrencyUnit.of("IDR"), Long.parseLong(byr.getText())),m3=m2.minus(m1);
            kembali.setText(""+m3);
            n.setEnabled(m3.isPositiveOrZero());
        }else n.setEnabled(false);
    }//GEN-LAST:event_byrKeyReleased

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        new Thread(()->{
            simpan();
            tayang();
            this.setVisible(false);
        }).start();
        stun();
    }//GEN-LAST:event_nActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField byr;
    private javax.swing.JTextField cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kembali;
    private javax.swing.JTable lstBeli;
    private javax.swing.JButton n;
    private javax.swing.JSpinner qty;
    private javax.swing.JLabel satuanBrg;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

    private void muat() {
    if(cari.getText().isEmpty())try {
        javax.swing.table.DefaultTableModel m=new javax.swing.table.DefaultTableModel(new String[]{"Kode","Nama","Stok","Harga"}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }; tblBarang.setModel(m);
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

    private boolean isAdaItem() throws SQLException {
        boolean bo;
        java.sql.PreparedStatement p=d.getPS("select jum from detjual where nota=? and brg=?");
        p.setString(1, j.getNota());
        p.setString(2, b.getKode());
        java.sql.ResultSet r=p.executeQuery();
        bo=r.next();
        r.close();
        p.close();
        return bo;
    }

    private void ubahJumlah() throws SQLException {
        java.sql.PreparedStatement p=d.getPS("update detjual set jum=?,byr=? where nota=? and brg=?");
        p.setFloat(1, Float.parseFloat(""+qty.getValue()));
        org.joda.money.Money m=b.getHrg().multipliedBy(Float.parseFloat(""+qty.getValue()), RoundingMode.CEILING);
        p.setString(2, ""+m);
        p.setString(3, j.getNota());
        p.setString(4, b.getKode());
        p.execute();
        p.close();
    }

    private void sisipBaru() throws SQLException {
        java.sql.PreparedStatement p=d.getPS("insert into detjual values(?,?,?,?)");
        p.setString(1, j.getNota());
        p.setString(2, b.getKode());
        p.setFloat(3, Float.parseFloat(""+qty.getValue()));
        org.joda.money.Money m=b.getHrg().multipliedBy(Float.parseFloat(""+qty.getValue()), RoundingMode.CEILING);
        p.setString(4, ""+m);
        p.execute();
        p.close();
    }

    private void fillItem() throws SQLException {
        javax.swing.table.DefaultTableModel m=new javax.swing.table.DefaultTableModel(new String[]{"Barang","Qty","Sub Total"}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }; lstBeli.setModel(m);
        java.sql.PreparedStatement p=d.getPS("select*from detjual where nota=?");
        p.setString(1, j.getNota());
        java.sql.ResultSet r=p.executeQuery();
        org.joda.money.Money mo=org.joda.money.Money.zero(CurrencyUnit.of("IDR"));
        while(r.next()){
            entity.Barang b=new entity.Barang(r.getString("brg"), d);
            m.addRow(new Object[]{b.getNm(),r.getFloat("jum"),r.getString("byr")});
            mo=mo.plus(org.joda.money.Money.parse(r.getString("byr")));
        } r.close();
        p.close();
        total.setText(""+mo);
        byr.setEditable(!mo.isZero());
    }

    private void delItem() throws SQLException {
        java.sql.PreparedStatement p=d.getPS("delete from detjual where nota=? and brg=?");
        p.setString(1, j.getNota());
        p.setString(2, b.getKode());
        p.execute();
        p.close();
    }

    private void simpan() {
    try {
        kurangiStok();
        java.sql.PreparedStatement p=d.getPS("update jual set total=?,kembali=?,byr=? where nota=?");
        p.setString(1, total.getText());
        p.setString(2, kembali.getText());
        p.setString(3, ""+org.joda.money.Money.of(CurrencyUnit.of("IDR"), Long.parseLong(byr.getText())));
        p.setString(4, j.getNota());
        p.execute();
        p.close();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }

    private void tayang() {
        int s=JOptionPane.showConfirmDialog(rootPane, "Apakah anda butuh struk?", "CETAK", JOptionPane.YES_NO_OPTION);
    if(s==JOptionPane.YES_OPTION)try {
        java.util.Map<String,Object>m=new java.util.HashMap<String,Object>();
        m.put("nota", j.getNota());
        ///new util.Laporan(p, true, JasperFillManager.fillReport(JasperCompileManager.compileReport(util.Struk.f.getAbsolutePath()), m, d.getC())).setVisible(true);
        java.io.File f=new java.io.File(System.getProperty("user.home")+"/Desktop/s.pdf");
        if(!f.getParentFile().exists())f.getParentFile().mkdirs();
        if(f.exists())f.delete();
        JasperPrint bahan=JasperFillManager.fillReport(JasperCompileManager.compileReport(util.Struk.f.getAbsolutePath()), m, d.getC());
        JasperPrintManager.printReport(bahan, false);
        JasperExportManager.exportReportToPdfFile(bahan, f.getAbsolutePath());
    } catch (JRException ex) {
        util.Db.hindar(ex);
    }
    }

    private void stun() {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        n.setEnabled(false);
        kembali.setEnabled(false);
        byr.setEnabled(false);
        total.setEnabled(false);
        qty.setEnabled(false);
        cari.setEnabled(false);
        lstBeli.setEnabled(false);
        tblBarang.setEnabled(false);
    }

    private void kurangiStok() throws SQLException {
        java.sql.PreparedStatement p=d.getPS("select brg,jum from detjual where nota=?");
        p.setString(1, j.getNota());
        java.sql.ResultSet r=p.executeQuery();
        while(r.next()){
            String brg=r.getString("brg");
            float jum=r.getFloat("jum");
            sudo(brg,jum);
        }r.close();
        p.close();
    }

    private void sudo(String brg, float jum) throws SQLException {
        entity.Barang b1=new entity.Barang(brg, d),b2=new entity.Barang(brg, d);
        b2.setStok(b2.getStok()-jum);
        new entity.dao.DAOBarang(d).update(b1, b2);
    }
}
