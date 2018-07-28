/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Component;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.joda.money.CurrencyUnit;

/**
 *
 * @author ai
 */
public class Analyze extends javax.swing.JDialog {
private util.Db d;
    /**
     * Creates new form Analyze
     */
    public Analyze(java.awt.Frame parent, boolean modal,util.Db db) {
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

        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tglAwal = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        blnAwal = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        thnAwal = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        tglAkhir = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        blnAkhir = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        thnAkhir = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        pnlMinta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMinta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tglAwalUR = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        blnAwalUR = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        thnAwalUR = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        tglAkhirUR = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        blnAkhirUR = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        thnAkhirUR = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Mulai");

        tglAwal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel2.setText(":");

        blnAwal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        blnAwal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blnAwalStateChanged(evt);
            }
        });

        jLabel3.setText(":");

        thnAwal.setModel(new javax.swing.SpinnerNumberModel());

        jLabel4.setText("Sampai dengan");

        tglAkhir.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel5.setText(":");

        blnAkhir.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        blnAkhir.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blnAkhirStateChanged(evt);
            }
        });

        jLabel6.setText(":");

        thnAkhir.setModel(new javax.swing.SpinnerNumberModel());

        jButton1.setText("Generate Grafik");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMintaLayout = new javax.swing.GroupLayout(pnlMinta);
        pnlMinta.setLayout(pnlMintaLayout);
        pnlMintaLayout.setHorizontalGroup(
            pnlMintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        pnlMintaLayout.setVerticalGroup(
            pnlMintaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tblMinta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMinta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlMinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tglAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blnAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thnAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tglAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blnAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thnAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1)))
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tglAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(blnAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(thnAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tglAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(blnAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(thnAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                .addContainerGap())
        );

        tab.addTab("Permintaan", jPanel1);

        jLabel7.setText("Mulai");

        tglAwalUR.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel8.setText(":");

        blnAwalUR.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        blnAwalUR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blnAwalURStateChanged(evt);
            }
        });

        jLabel9.setText(":");

        thnAwalUR.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel10.setText("Sampai Dengan");

        tglAkhirUR.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel11.setText(":");

        blnAkhirUR.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel12.setText(":");

        thnAkhirUR.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglAwalUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blnAwalUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thnAwalUR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglAkhirUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blnAkhirUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thnAkhirUR, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tglAwalUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(blnAwalUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(thnAwalUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tglAkhirUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(blnAkhirUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(thnAkhirUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(481, Short.MAX_VALUE))
        );

        tab.addTab("untung rugi", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        javax.swing.table.DefaultTableModel m=new javax.swing.table.DefaultTableModel(new String[]{"Nama Barang","Jumlah"}, 0);
        tblMinta.setModel(m);
        LocalDate ld1=LocalDate.now(),ld2=ld1.minusWeeks(1);
        thnAkhir.setValue(ld1.getYear());
        blnAkhir.setValue(ld1.getMonthValue());
        tglAkhir.setValue(ld1.getDayOfMonth());
        thnAwal.setValue(ld2.getYear());
        blnAwal.setValue(ld2.getMonthValue());
        tglAwal.setValue(ld2.getDayOfMonth());
    }//GEN-LAST:event_formWindowOpened

    private void blnAwalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blnAwalStateChanged
        int[]p={2,4,6,9,11};
        int max=31, saikiBln=Integer.parseInt(""+blnAwal.getValue()),saikiTgl=Integer.parseInt(""+tglAwal.getValue());
        for(int i:p){
            if(i==saikiBln){
                int b=30;
                if(i==2){
                    if(0==Integer.parseInt(""+thnAwal.getValue())%4)b=29;
                    else b=28;
                } if(saikiTgl>b)saikiTgl=b;
                max=b;
                break;
            }
        }tglAwal.setModel(new javax.swing.SpinnerNumberModel(saikiTgl, 1, max, 1));
    }//GEN-LAST:event_blnAwalStateChanged

    private void blnAkhirStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blnAkhirStateChanged
        int[]p={2,4,6,9,11};
        int max=31, saikiBln=Integer.parseInt(""+blnAkhir.getValue()),saikiTgl=Integer.parseInt(""+tglAkhir.getValue());
        for(int i:p){
            if(i==saikiBln){
                int b=30;
                if(i==2){
                    if(0==Integer.parseInt(""+thnAkhir.getValue())%4)b=29;
                    else b=28;
                } if(saikiTgl>b)saikiTgl=b;
                max=b;
                break;
            }
        }tglAkhir.setModel(new javax.swing.SpinnerNumberModel(saikiTgl, 1, max, 1));
    }//GEN-LAST:event_blnAkhirStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Thread(()->{
            LocalDate ld1=LocalDate.of(Integer.parseInt(""+thnAwal.getValue()), Integer.parseInt(""+blnAwal.getValue()), 
                Integer.parseInt(""+tglAwal.getValue())),ld2=LocalDate.of(Integer.parseInt(""+thnAkhir.getValue()), 
                        Integer.parseInt(""+blnAkhir.getValue()), Integer.parseInt(""+tglAkhir.getValue()));
            try {
                genaratePermintaan(ld1,ld2);
            } catch (SQLException ex) {
                util.Db.hindar(ex);
            }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }).start();
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void blnAwalURStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blnAwalURStateChanged
        int[]p={2,4,6,9,11};
        int max=31, saikiBln=Integer.parseInt(""+blnAwalUR.getValue()),saikiTgl=Integer.parseInt(""+tglAwalUR.getValue());
        for(int i:p){
            if(i==saikiBln){
                int b=30;
                if(i==2){
                    if(0==Integer.parseInt(""+thnAwalUR.getValue())%4)b=29;
                    else b=28;
                } if(saikiTgl>b)saikiTgl=b;
                max=b;
                break;
            }
        }tglAwalUR.setModel(new javax.swing.SpinnerNumberModel(saikiTgl, 1, max, 1));
    }//GEN-LAST:event_blnAwalURStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner blnAkhir;
    private javax.swing.JSpinner blnAkhirUR;
    private javax.swing.JSpinner blnAwal;
    private javax.swing.JSpinner blnAwalUR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMinta;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tblMinta;
    private javax.swing.JSpinner tglAkhir;
    private javax.swing.JSpinner tglAkhirUR;
    private javax.swing.JSpinner tglAwal;
    private javax.swing.JSpinner tglAwalUR;
    private javax.swing.JSpinner thnAkhir;
    private javax.swing.JSpinner thnAkhirUR;
    private javax.swing.JSpinner thnAwal;
    private javax.swing.JSpinner thnAwalUR;
    // End of variables declaration//GEN-END:variables

    private void permintaan() throws SQLException {
        Date max=tglMax(),min=tglMin();
    }

    private void keuangan() throws SQLException {
        Date max=tglMax(),min=tglMin();
    }

    private void load() {
        try {
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        permintaan();
        keuangan();
        laba();
    } catch (SQLException ex) {
        util.Db.hindar(ex);
    }this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }

    private Date tglMax() throws SQLException {
        Date tgl=null;
        java.sql.ResultSet r=d.keluar("select max(tgl)as intok from jual");
        if(r.next())tgl=r.getDate("intok");
        r.close();
        return tgl;
    }

    private Date tglMin() throws SQLException {
        Date tgl=null;
        java.sql.ResultSet r=d.keluar("select min(tgl)as intok from jual");
        if(r.next())tgl=r.getDate("intok");
        r.close();
        return tgl;
    }

    private Component buatPermintaan(LocalDate l) throws SQLException {
        org.jfree.data.general.DefaultPieDataset data=new org.jfree.data.general.DefaultPieDataset();
        java.sql.PreparedStatement p=d.getPS("select detjual.brg,sum(detjual.jum)as qty from jual inner join detjual where jual.tgl>=? and "
                + "jual.tgl<? group by detjual.brg");
        p.setDate(1, Date.valueOf(l));
        p.setDate(2, Date.valueOf(l.plusMonths(1)));
        java.sql.ResultSet r=p.executeQuery();
        while(r.next())data.setValue(getNamaBrg(r.getString("brg")), r.getDouble("qty"));
        r.close();
        p.close();
        return new org.jfree.chart.ChartPanel(ChartFactory.createPieChart("PERMINTAAN", data,true,true,false));
    }

    private String getNamaBrg(String kode)throws SQLException{
        java.sql.PreparedStatement p=d.getPS("select nm from barang where kode=?");
        p.setString(1, kode);
        java.sql.ResultSet r=p.executeQuery();
        String s="";
        if(r.next())s=r.getString("nm");
        r.close();
        p.close();
        return s;
    }

    private Component buatKeuangan(LocalDate l) throws SQLException {
        org.jfree.data.category.DefaultCategoryDataset data=new org.jfree.data.category.DefaultCategoryDataset();
        for(LocalDate l2=l;l2.isBefore(l.plusWeeks(1));l2=l2.plusDays(1)){
            data.addValue(getUntung(l2), "Untung", l2);
            data.addValue(getRugi(l2), "Rugi", l2);
        }return new org.jfree.chart.ChartPanel(ChartFactory.createBarChart("Untung Rugi", "Periode", "Nilai", data,
                PlotOrientation.VERTICAL,true,true
        ,false));
    }

    private Number getUntung(LocalDate l2) throws SQLException {
        org.joda.money.Money m=org.joda.money.Money.zero(CurrencyUnit.of("IDR"));
        java.sql.PreparedStatement p=d.getPS("select total from jual where tgl=?");
        p.setDate(1, Date.valueOf(l2));
        java.sql.ResultSet r=p.executeQuery();
        while(r.next())m=m.plus(org.joda.money.Money.parse(r.getString("total")));
        r.close();
        p.close();
        return m.getAmount().longValueExact();
    }

    private Number getRugi(LocalDate l2) throws SQLException {
        double dou=0;
        java.sql.PreparedStatement p=d.getPS("select sum(sat*jum)as oke from memasok where tgl=?");
        p.setDate(1, Date.valueOf(l2));
        java.sql.ResultSet r=p.executeQuery();
        if(r.next())dou=r.getDouble("oke");
        r.close();
        p.close();
        return dou;
    }

    private void laba() throws SQLException {
        Date max=tglMax(),min=tglMin();
    }

    private Component labane(LocalDate l) throws SQLException {
        org.jfree.data.category.DefaultCategoryDataset data=new org.jfree.data.category.DefaultCategoryDataset();
        for(LocalDate l2=l;l2.isBefore(l.plusWeeks(1));l2=l2.plusDays(1)){
            Number u=getUntung(l2),r=getRugi(l2);
            data.addValue(u.longValue()-r.longValue(), "Laba", l2);
        }return new org.jfree.chart.ChartPanel(ChartFactory.createLineChart("Laba Bersih", "Periode", "Nilai", data,
                PlotOrientation.VERTICAL,true,true
        ,false));
    }

    private void genaratePermintaan(LocalDate awal, LocalDate akhir) throws SQLException {
        org.jfree.data.general.DefaultPieDataset data=new org.jfree.data.general.DefaultPieDataset();
        javax.swing.table.DefaultTableModel m=new javax.swing.table.DefaultTableModel(new String[]{"Nama Barang","Jumlah"}, 0);
        tblMinta.setModel(m);
        java.sql.PreparedStatement p=d.getPS("select detjual.brg,sum(detjual.jum)as qty from jual left join detjual on jual.nota=detjual.nota "
                + "where jual.tgl>=? and "
                + "jual.tgl<=? group by detjual.brg");
        p.setDate(1, Date.valueOf(awal));
        p.setDate(2, Date.valueOf(akhir));
        java.sql.ResultSet r=p.executeQuery();
        while(r.next()){
            String brg=r.getString("brg");
            double qty=r.getDouble("qty");
            data.setValue(brg, qty);
            m.addRow(new String[]{brg,""+qty});
        }r.close();
        p.close();
        org.jfree.chart.ChartPanel cp
                =new org.jfree.chart.ChartPanel(ChartFactory.createPieChart("Permintaan", data, true, true, false));
        cp.setSize(pnlMinta.getSize());
        if(0<pnlMinta.getComponentCount())pnlMinta.removeAll();
        pnlMinta.add(cp);
    }
}