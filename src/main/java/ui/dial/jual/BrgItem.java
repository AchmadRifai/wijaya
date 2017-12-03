/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.dial.jual;

import java.math.RoundingMode;
import java.sql.SQLException;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class BrgItem extends javax.swing.JInternalFrame {
    private entity.Jual j;
    private util.Db d;
    private org.joda.money.Money m;
    private javax.swing.JTextField t;
    private javax.swing.JDesktopPane desk;
    private String kode;

    public org.joda.money.Money getTotal(){
        org.joda.money.Money tot=m.multipliedBy(Float.parseFloat(""+jum.getValue()), RoundingMode.FLOOR);
        return tot;
    }

public void setKode(String kode,util.Db d,entity.Jual j,javax.swing.JTextField t,javax.swing.JDesktopPane jd) throws SQLException{
    this.t=t;
    this.kode=kode;
    desk=jd;
    java.sql.PreparedStatement p=d.getPS("select nm,satuan,hrg,stok from barang where kode=?");
    p.setString(1, kode);
    java.sql.ResultSet r=p.executeQuery();
    if(r.next()){
        nm.setText(r.getString("nm"));
        m=org.joda.money.Money.of(CurrencyUnit.of("IDR"), r.getLong("hrg"));
        hrg.setText(""+m);
        stok.setText(""+r.getFloat("stok")+" "+r.getString("satuan"));
    }r.close();
    p.close();
    this.setVisible(true);
    this.d=d;
    this.j=j;
}
    /**
     * Creates new form BrgItem
     */
    public BrgItem() {
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

        nm = new javax.swing.JLabel();
        stok = new javax.swing.JLabel();
        hrg = new javax.swing.JLabel();
        jum = new javax.swing.JSpinner();

        nm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm.setText("jLabel1");

        stok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stok.setText("jLabel1");

        hrg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hrg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hrg.setText("jLabel2");

        jum.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(9.0f), Float.valueOf(0.1f)));
        jum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jumStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nm, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(stok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jum, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hrg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumStateChanged
        org.joda.money.Money m=org.joda.money.Money.zero(CurrencyUnit.of("IDR"));
        for(javax.swing.JInternalFrame inter:desk.getAllFrames()){
            BrgItem bi=(BrgItem) inter;
            m=m.plus(bi.getTotal());
        }t.setText(""+m);
    }//GEN-LAST:event_jumStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hrg;
    private javax.swing.JSpinner jum;
    private javax.swing.JLabel nm;
    private javax.swing.JLabel stok;
    // End of variables declaration//GEN-END:variables

    public void simpenCok() throws SQLException{
        java.sql.PreparedStatement p=d.getPS("insert into detjual values(?,?,?,?)");
        p.setString(1, j.getNota());
        p.setString(2, kode);
        p.setFloat(3, Float.parseFloat(""+jum.getValue()));
        p.setString(4, hrg.getText());
        p.execute();
        p.close();
    }
}