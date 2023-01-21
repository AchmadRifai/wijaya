/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Cursor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import util.Db;

/**
 *
 * @author root
 */
public class ExportImportLoader extends javax.swing.JDialog {
    private boolean importing;
    private File file;
    private Db db;
    private XSSFWorkbook workbook;

    /**
     * Creates new form ExportImportLoader
     */
    public ExportImportLoader(java.awt.Frame parent, boolean modal, boolean importing, File file, Db db) {
        super(parent, modal);
        this.importing = importing;
        this.file = file;
        this.db = db;
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

        prog = new javax.swing.JProgressBar();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 204, 204));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        status.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prog, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        new Thread(this::mlaku).start();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar prog;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables

    private void mlaku() {
        try {
            if (importing) lagiImport();
            else lagiExport();
        } catch(Exception e) {
            util.Db.hindar(e);
        }
        setVisible(false);
    }

    private void lagiImport() throws InvalidFormatException, IOException, SQLException {
        showStatus(0, String.format("Loading from %s", file.getAbsolutePath()));
        workbook = new XSSFWorkbook(file);
        importingSuplier();
        importingPelanggan();
        importingBarang();
        importingMemasok();
        importingJual();
        importingDetjual();
    }

    private void lagiExport() throws IOException, SQLException {
        showStatus(0, "Initialing workbook");
        workbook = new XSSFWorkbook();
        exportingSuplier();
        exportingPelanggan();
        exportingBarang();
        exportingMemasok();
        exportingJual();
        exportingDetjual();
        writingWorkbook();
    }

    private void writingWorkbook() throws IOException {
        showStatus(90, String.format("Writing to %s", file.getAbsolutePath()));
        try (FileOutputStream out = new FileOutputStream(file)) {
            workbook.write(out);
        } 
        showStatus(100, "Export Completed");
    }

    private void exportingSuplier() throws SQLException {
        showStatus(5, "Exporting data suplier");
        long wrote = 0;
        XSSFSheet sheet = workbook.createSheet("suplier");
        writingSheetRow(sheet, 0, "ID", "Nama", "Alamat", "Jenis", "Telp", "Deleted", "Cekal");
        try (ResultSet rs = db.keluar("select*from suplier")) {
            while (rs.next()) {
                wrote++;
                writingSheetRow(sheet, wrote, rs.getString("id"), rs.getString("nm"), rs.getString("almt"), rs.getString("jns"),
                        rs.getString("tlp"), rs.getBoolean("deleted"), rs.getBoolean("blocked"));
            }
        }
        showStatus(10, "Exported data suplier");
    }

    private void showStatus(int i, String s) {
        prog.setValue(i);
        status.setText(s);
    }

    private void writingSheetRow(XSSFSheet sheet, long i, Object... datas) {
        XSSFRow row = sheet.createRow((int) i);
        for (int j = 0; j < datas.length; j++) {
            XSSFCell cell = row.createCell(j);
            cell.setCellValue(String.valueOf(datas[j]));
        }
    }

    private void exportingPelanggan() throws SQLException {
        showStatus(15, "Exporting data pelanggan");
        long wrote = 0;
        XSSFSheet sheet = workbook.createSheet("pelanggan");
        writingSheetRow(sheet, 0, "Kode", "Nama", "Alamat", "Telp", "Deleted", "Cekal");
        try (ResultSet rs = db.keluar("select*from pelanggan")) {
            while (rs.next()) {
                wrote++;
                writingSheetRow(sheet, wrote, rs.getString("kode"), rs.getString("nm"), rs.getString("almt"), 
                        rs.getString("tlp"), rs.getBoolean("deleted"), rs.getBoolean("blocked"));
            }
        }
        showStatus(20, "Exported data pelanggan");
    }

    private void exportingBarang() throws SQLException {
        showStatus(25, "Exporting data barang");
        long wrote = 0;
        XSSFSheet sheet = workbook.createSheet("barang");
        writingSheetRow(sheet, 0, "Kode", "Nama", "Satuan", "Harga Jual", "Harga Beli", "Stok", "Deleted", "Biji");
        try (ResultSet rs = db.keluar("select*from barang")) {
            while (rs.next()) {
                wrote++;
                writingSheetRow(sheet, wrote, rs.getString("kode"), rs.getString("nm"), rs.getString("satuan"), rs.getString("hrg"),
                        rs.getString("beli"), rs.getFloat("stok"), rs.getBoolean("deleted"), rs.getBoolean("biji"));
            }
        }
        showStatus(30, "Exported data barang");
    }

    private void exportingMemasok() throws SQLException {
        showStatus(35, "Exporting data memasok");
        long wrote = 0;
        XSSFSheet sheet = workbook.createSheet("memasok");
        writingSheetRow(sheet, 0, "Kode Barang", "Kode Suplier", "Harga Satuan", "Jumlah", "Tanggal");
        try (ResultSet rs = db.keluar("select*from memasok")) {
            while (rs.next()) {
                wrote++;
                writingSheetRow(sheet, wrote, rs.getString("brg"), rs.getString("sup"), rs.getLong("sat"),
                        rs.getFloat("jum"), rs.getDate("tgl"));
            }
        }
        showStatus(40, "Exported data memasok");
    }

    private void exportingJual() throws SQLException {
        showStatus(35, "Exporting data jual");
        long wrote = 0;
        XSSFSheet sheet = workbook.createSheet("jual");
        writingSheetRow(sheet, 0, "Nota", "Kode Pelanggan", "Tanggal", "Total", "Kembalian", "Bayar", "Deleted");
        try (ResultSet rs = db.keluar("select*from jual")) {
            while (rs.next()) {
                wrote++;
                writingSheetRow(sheet, wrote, rs.getString("nota"), rs.getString("pel"), rs.getDate("tgl"),
                        rs.getString("total"), rs.getString("kembali"), rs.getString("byr"), rs.getBoolean("deleted"));
            }
        }
        showStatus(40, "Exported data jual");
    }

    private void exportingDetjual() throws SQLException {
        showStatus(45, "Exporting data detjual");
        long wrote = 0;
        XSSFSheet sheet = workbook.createSheet("detjual");
        writingSheetRow(sheet, 0, "Nota", "Kode Barang", "Jumlah", "Total");
        try (ResultSet rs = db.keluar("select*from detjual")) {
            while (rs.next()) {
                wrote++;
                writingSheetRow(sheet, wrote, rs.getString("nota"), rs.getString("brg"), rs.getFloat("jum"), rs.getString("byr"));
            }
        }
        showStatus(50, "Exported data detjual");
    }

    private void importingSuplier() throws SQLException {
        showStatus(40, "Importing data suplier");
        XSSFSheet sheet = workbook.getSheet("suplier");
        for (long wrote = 1; !isEmptyRow(sheet, wrote); wrote++) {
            XSSFRow row = sheet.getRow((int) wrote);
            if (notFoundSuplier(row)) 
                insertSuplier(row);
        }
    }

    private boolean isEmptyRow(XSSFSheet sheet, long wrote) {
        XSSFRow row = sheet.getRow((int) wrote);
        if (Objects.isNull(row)) return true;
        XSSFCell cell = row.getCell(0);
        String val = cell.getStringCellValue();
        return Objects.isNull(val) || val.isEmpty() || val.isBlank();
    }

    private boolean notFoundSuplier(XSSFRow row) throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        boolean exists = false;
        String id = row.getCell(0).getStringCellValue();
        try (PreparedStatement ps = db.getPS("select*from suplier where id=?")) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                exists = rs.next();
            }
        }
        return !exists;
    }

    private void insertSuplier(XSSFRow row) throws SQLException {
        String id = row.getCell(0).getStringCellValue(), nm = row.getCell(1).getStringCellValue();
        String almt = row.getCell(2).getStringCellValue(), jns = row.getCell(3).getStringCellValue();
        String tlp = row.getCell(4).getStringCellValue();
        boolean deleted = Boolean.parseBoolean(row.getCell(5).getStringCellValue());
        boolean blocked = Boolean.parseBoolean(row.getCell(6).getStringCellValue());
        try (PreparedStatement ps = db.getPS("insert into suplier values(?,?,?,?,?,?,?)")) {
            ps.setString(1, id);
            ps.setString(2, nm);
            ps.setString(3, almt);
            ps.setString(4, jns);
            ps.setString(5, tlp);
            ps.setBoolean(6, deleted);
            ps.setBoolean(7, blocked);
            ps.execute();
        }
    }

    private void importingPelanggan() throws SQLException {
        showStatus(50, "Importing data pelanggan");
        XSSFSheet sheet = workbook.getSheet("pelanggan");
        for (long wrote = 1; !isEmptyRow(sheet, wrote); wrote++) {
            XSSFRow row = sheet.getRow((int) wrote);
            if (notFoundPelanggan(row)) 
                insertPelanggan(row);
        }
    }

    private boolean notFoundPelanggan(XSSFRow row) throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        boolean exists = false;
        String id = row.getCell(0).getStringCellValue();
        try (PreparedStatement ps = db.getPS("select*from pelanggan where kode=?")) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                exists = rs.next();
            }
        }
        return !exists;
    }

    private void insertPelanggan(XSSFRow row) throws SQLException {
        String id = row.getCell(0).getStringCellValue(), nm = row.getCell(1).getStringCellValue();
        String almt = row.getCell(2).getStringCellValue(), jns = row.getCell(3).getStringCellValue();
        boolean deleted = Boolean.parseBoolean(row.getCell(4).getStringCellValue());
        boolean blocked = Boolean.parseBoolean(row.getCell(5).getStringCellValue());
        try (PreparedStatement ps = db.getPS("insert into pelanggan values(?,?,?,?,?,?)")) {
            ps.setString(1, id);
            ps.setString(2, nm);
            ps.setString(3, almt);
            ps.setString(4, jns);
            ps.setBoolean(5, deleted);
            ps.setBoolean(6, blocked);
            ps.execute();
        }
    }

    private void importingBarang() throws SQLException {
        showStatus(60, "Importing data barang");
        XSSFSheet sheet = workbook.getSheet("barang");
        for (long wrote = 1; !isEmptyRow(sheet, wrote); wrote++) {
            XSSFRow row = sheet.getRow((int) wrote);
            if (notFoundBarang(row)) 
                insertBarang(row);
        }
    }

    private boolean notFoundBarang(XSSFRow row) throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        boolean exists = false;
        String id = row.getCell(0).getStringCellValue();
        try (PreparedStatement ps = db.getPS("select*from barang where kode=?")) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                exists = rs.next();
            }
        }
        return !exists;
    }

    private void insertBarang(XSSFRow row) throws SQLException {
        try (PreparedStatement ps = db.getPS("insert into barang values(?,?,?,?,?,?,?,?)")) {
            ps.setString(1, row.getCell(0).getStringCellValue());
            ps.setString(2, row.getCell(1).getStringCellValue());
            ps.setString(3, row.getCell(2).getStringCellValue());
            ps.setString(4, row.getCell(3).getStringCellValue());
            ps.setString(5, row.getCell(4).getStringCellValue());
            ps.setFloat(6, Float.parseFloat(row.getCell(5).getStringCellValue()));
            ps.setBoolean(7, Boolean.parseBoolean(row.getCell(6).getStringCellValue()));
            ps.setBoolean(8, Boolean.parseBoolean(row.getCell(7).getStringCellValue()));
            ps.execute();
        }
    }

    private void importingMemasok() throws SQLException {
        showStatus(70, "Importing data memasok");
        XSSFSheet sheet = workbook.getSheet("memasok");
        for (long wrote = 1; !isEmptyRow(sheet, wrote); wrote++) {
            XSSFRow row = sheet.getRow((int) wrote);
            if (notFoundMemasok(row)) 
                insertMemasok(row);
        }
    }

    private void insertMemasok(XSSFRow row) throws SQLException {
        try (PreparedStatement ps = db.getPS("insert into memasok values(?,?,?,?,?)")) {
            ps.setString(1, row.getCell(0).getStringCellValue());
            ps.setString(2, row.getCell(1).getStringCellValue());
            ps.setLong(3, Long.parseLong(row.getCell(2).getStringCellValue()));
            ps.setFloat(4, Float.parseFloat(row.getCell(3).getStringCellValue()));
            ps.setDate(5, Date.valueOf(row.getCell(4).getStringCellValue()));
            ps.execute();
        }
    }

    private boolean notFoundMemasok(XSSFRow row) throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        boolean exists = false;
        try (PreparedStatement ps = db.getPS("select*from memasok where brg=? and sup=? and sat=? and jum=? and tgl=?")) {
            ps.setString(1, row.getCell(0).getStringCellValue());
            ps.setString(2, row.getCell(1).getStringCellValue());
            ps.setLong(3, Long.parseLong(row.getCell(2).getStringCellValue()));
            ps.setFloat(4, Float.parseFloat(row.getCell(3).getStringCellValue()));
            ps.setDate(5, Date.valueOf(row.getCell(4).getStringCellValue()));
            try (ResultSet rs = ps.executeQuery()) {
                exists = rs.next();
            }
        }
        return !exists;
    }

    private void importingJual() throws SQLException {
        showStatus(80, "Importing data jual");
        XSSFSheet sheet = workbook.getSheet("jual");
        for (long wrote = 1; !isEmptyRow(sheet, wrote); wrote++) {
            XSSFRow row = sheet.getRow((int) wrote);
            if (notFoundJual(row)) 
                insertJual(row);
        }
    }

    private boolean notFoundJual(XSSFRow row) throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        boolean exists = false;
        String id = row.getCell(0).getStringCellValue();
        try (PreparedStatement ps = db.getPS("select*from jual where nota=?")) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                exists = rs.next();
            }
        }
        return !exists;
    }

    private void insertJual(XSSFRow row) throws SQLException {
        try (PreparedStatement ps = db.getPS("insert into jual values(?,?,?,?,?,?,?)")) {
            ps.setString(1, row.getCell(0).getStringCellValue());
            ps.setString(2, row.getCell(1).getStringCellValue());
            ps.setDate(3, Date.valueOf(row.getCell(2).getStringCellValue()));
            ps.setString(4, row.getCell(3).getStringCellValue());
            ps.setString(5, row.getCell(4).getStringCellValue());
            ps.setString(6, row.getCell(5).getStringCellValue());
            ps.setBoolean(7, Boolean.parseBoolean(row.getCell(6).getStringCellValue()));
            ps.execute();
        }
    }

    private void importingDetjual() throws SQLException {
        showStatus(90, "Importing data detjual");
        XSSFSheet sheet = workbook.getSheet("detjual");
        for (long wrote = 1; !isEmptyRow(sheet, wrote); wrote++) {
            XSSFRow row = sheet.getRow((int) wrote);
            if (notFoundDetjual(row)) 
                insertDetjual(row);
        }
    }

    private boolean notFoundDetjual(XSSFRow row) throws SQLException {
        @SuppressWarnings("UnusedAssignment")
        boolean exists = false;
        try (PreparedStatement ps = db.getPS("select*from detjual where nota=? and brg=?")) {
            ps.setString(1, row.getCell(0).getStringCellValue());
            ps.setString(2, row.getCell(1).getStringCellValue());
            try (ResultSet rs = ps.executeQuery()) {
                exists = rs.next();
            }
        }
        return !exists;
    }

    private void insertDetjual(XSSFRow row) throws SQLException {
        try (PreparedStatement ps = db.getPS("insert into detjual values(?,?,?,?)")) {
            ps.setString(1, row.getCell(0).getStringCellValue());
            ps.setString(2, row.getCell(1).getStringCellValue());
            ps.setFloat(3, Float.parseFloat(row.getCell(2).getStringCellValue()));
            ps.setString(4, row.getCell(3).getStringCellValue());
            ps.execute();
        }
    }
}