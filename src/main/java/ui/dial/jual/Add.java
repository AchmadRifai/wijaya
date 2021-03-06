/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dial.jual;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class Add extends javax.swing.JDialog {
private util.Db d;
private entity.Jual j;
private java.awt.Frame p;
    /**
     * Creates new form Add
     */
    public Add(java.awt.Frame parent, boolean modal,util.Db db,entity.Jual ju) {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalBYR = new javax.swing.JTextField();
        byr = new javax.swing.JFormattedTextField();
        kembali = new javax.swing.JTextField();
        cs = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kabeh = new javax.swing.JDesktopPane();
        brgItem2 = new ui.dial.jual.BrgItem();
        brgItem3 = new ui.dial.jual.BrgItem();
        brgItem4 = new ui.dial.jual.BrgItem();

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

        jLabel1.setText("TOTAL PEMBAYARAN :");

        jLabel2.setText("DIBAYAR :");

        jLabel3.setText("KEMBALIAN :");

        totalBYR.setEditable(false);
        totalBYR.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalBYR.setText("IDR 0.00");

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

        cs.setText("LANJUTKAN");
        cs.setEnabled(false);
        cs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csActionPerformed(evt);
            }
        });

        kabeh.setLayout(new java.awt.GridBagLayout());

        brgItem2.setVisible(true);
        kabeh.add(brgItem2, new java.awt.GridBagConstraints());

        brgItem3.setVisible(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        kabeh.add(brgItem3, gridBagConstraints);

        brgItem4.setVisible(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        kabeh.add(brgItem4, gridBagConstraints);

        jScrollPane1.setViewportView(kabeh);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalBYR, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(380, 415, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(byr, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(kembali)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cs)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalBYR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(byr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cs)
                .addContainerGap())
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
        new Thread(this::muat).start();
    }//GEN-LAST:event_formWindowOpened

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    }//GEN-LAST:event_formMouseMoved

@SuppressWarnings("UnusedAssignment")
    private void byrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_byrKeyReleased
        if(byr.isValid()&&!byr.getText().isEmpty()){
            long l=Long.parseLong(byr.getText());
            org.joda.money.Money m=org.joda.money.Money.parse(totalBYR.getText());
            l-=m.getAmount().longValueExact();
            kembali.setText(org.joda.money.Money.of(CurrencyUnit.of("IDR"), l).toString());
        }validasine();
    }//GEN-LAST:event_byrKeyReleased

    private void csActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csActionPerformed
        inputAll();
        selesai();
        int x=JOptionPane.showConfirmDialog(rootPane, "Apa orang ini butuh struk?", "BUTUH?", JOptionPane.YES_NO_OPTION);
        if(x==JOptionPane.YES_OPTION)cetak();
        this.setVisible(false);
    }//GEN-LAST:event_csActionPerformed

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
        /*while(this.isVisible())try {
        refresh();
        } catch (SQLException | InterruptedException ex) {
        util.Db.hindar(ex);
        }*/
        refresh();
    } catch (SQLException | InterruptedException ex) {
        util.Db.hindar(ex);
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.dial.jual.BrgItem brgItem2;
    private ui.dial.jual.BrgItem brgItem3;
    private ui.dial.jual.BrgItem brgItem4;
    private javax.swing.JFormattedTextField byr;
    private javax.swing.JButton cs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane kabeh;
    private javax.swing.JTextField kembali;
    private javax.swing.JTextField totalBYR;
    // End of variables declaration//GEN-END:variables

    private void refresh() throws SQLException, InterruptedException {
        muatBarang();
        //Thread.sleep(5000);
    }

    private void validasine() {
        org.joda.money.Money m=org.joda.money.Money.parse(kembali.getText());
        if(0<=m.getAmount().longValue())kembali.setForeground(Color.BLACK);
        else kembali.setForeground(Color.red);
        cs.setEnabled(Color.BLACK==kembali.getForeground());
    }

    private void selesai() {
    try {
        entity.Jual b=new entity.Jual(j.getNota(), d);
        b.setTotal(org.joda.money.Money.parse(totalBYR.getText()));
        b.setKembali(org.joda.money.Money.parse(kembali.getText()));
        b.setByr(org.joda.money.Money.of(CurrencyUnit.of("IDR"), Long.parseLong(byr.getText())));
        new entity.dao.DAOJual(d).update(j, b);
        for(entity.DetJual dj:b.getDet()){
            entity.Barang b1=new entity.Barang(dj.getBrg(), d),b2=new entity.Barang(dj.getBrg(), d);
            b2.setStok(b1.getStok()-dj.getJum());
            new entity.dao.DAOBarang(d).update(b1, b2);
        }
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }
    }

    private void cetak() {
    try {
        java.util.Map<String,Object>m=new java.util.HashMap<String,Object>();
        m.put("nota", j.getNota());
        JasperPrintManager.printReport(JasperFillManager.fillReport(JasperCompileManager.
                compileReport(util.Struk.f.getAbsolutePath()), 
                m,d.getC()), false);
    } catch (JRException ex) {
        util.Db.hindar(ex);
    }
    }

    private void muatBarang() throws SQLException {
        if(kabeh.getAllFrames().length>0)kabeh.removeAll();
        java.sql.ResultSet r=d.keluar("select kode from barang where stok>0 and not deleted");
        int y=0, x=0;
        while(r.next()){
            BrgItem b=new BrgItem();
            if(y>0){
                java.awt.GridBagConstraints gbc=new java.awt.GridBagConstraints();
                gbc.gridy=y;
                gbc.gridx=x;
                kabeh.add(b, gbc);
                if(y==1)y++;
                else {
                	y=0;
                	x++;
                }
            }else{
                kabeh.add(b, new java.awt.GridBagConstraints());
                y++;
            } b.setKode(r.getString("kode"), d, j, totalBYR, kabeh);
        }r.close();
    }

    private void inputAll() {
        for(javax.swing.JInternalFrame i:kabeh.getAllFrames())try {
                BrgItem bi=(BrgItem) i;
                bi.simpenCok();
            } catch (SQLException ex) {
                util.Db.hindar(ex);
            }
    }
}