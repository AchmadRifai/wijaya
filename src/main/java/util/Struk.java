/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author ai
 */
public class Struk {
    public static java.io.File f=new java.io.File(System.getProperty("user.home")+"/.wijaya/templates/struk.jrxml");

    public static void init() throws FileNotFoundException {
        if(!f.getParentFile().exists())f.getParentFile().mkdirs();
        PrintWriter o=new PrintWriter(f);
        o.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        header(o);
        ndas(o);
        awak(o);
        kaki(o);
        o.close();
    }

    private static void header(PrintWriter o) {
        o.print("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" xmlns:xsi=\"http://www.w3.org");
        o.print("/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports http:/");
        o.print("/jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"null\" language=\"java\" pageWidth=\"425\" ");
        o.print("pageHeight=\"255\" orientation=\"Landscape\" columnWidth=\"385\" leftMargin=\"20\" rightMargin=\"20\" ");
        o.print("topMargin=\"20\" bottomMargin=\"20\" uuid=\"f05a5a0c-a352-4601-b1b4-e8214dea82e0\">");
        data(o);
    }

    private static void data(PrintWriter o) {
        o.print("<property name=\"ireport.zoom\" value=\"1.5\"/>");
        o.print("<property name=\"ireport.x\" value=\"0\"/>");
        o.print("<property name=\"ireport.y\" value=\"0\"/>");
        o.print("<style name=\"Title\" fontName=\"Arial\" fontSize=\"20\" isBold=\"true\" pdfFontName=\"Helvetica-Bold\"/>");
        o.print("<style name=\"SubTitle\" forecolor=\"#666666\" fontName=\"Arial\" fontSize=\"14\"/>");
        o.print("<style name=\"Column header\" forecolor=\"#666666\" fontName=\"Arial\" fontSize=\"9\" isBold=\"true\"/>");
        o.print("<style name=\"Detail\" fontName=\"Arial\" fontSize=\"9\"/>");
        o.print("<parameter name=\"nota\" class=\"java.lang.String\"/>");
        sql(o);
    }

    private static void sql(PrintWriter o) {
        o.print("<queryString language=\"SQL\">");
        o.print("<![CDATA[SELECT jual.`nota` AS jual_nota,");
        o.print("jual.kembali as jual_kembali");
        o.print(",jual.`total` AS jual_total,jual.`tgl` AS jual_tgl,detjual.`brg` AS detjual_brg,detjual.`jum` AS ");
        o.print("detjual_jum,detjual.`byr` AS detjual_byr,jual.byr as jual_byr ");
        o.print("FROM`jual` jual INNER JOIN `detjual` detjual ON jual.`nota` = detjual.`nota` WHERE jual.nota =");
        o.print("$P{nota}]]>");
        o.print("</queryString>");
        field(o);
    }

    private static void field(PrintWriter o) {
        o.print("<field name=\"jual_nota\" class=\"java.lang.String\"/>");
        o.print("<field name=\"jual_byr\" class=\"java.lang.String\"/>");
        o.print("<field name=\"jual_total\" class=\"java.lang.String\"/>");
        o.print("<field name=\"jual_kembali\" class=\"java.lang.String\"/>");
        o.print("<field name=\"jual_tgl\" class=\"java.sql.Date\"/>");
        o.print("<field name=\"detjual_brg\" class=\"java.lang.String\"/>");
        o.print("<field name=\"detjual_jum\" class=\"java.lang.Float\"/>");
        o.print("<field name=\"detjual_byr\" class=\"java.lang.String\"/>");
        o.print("<background>");
        o.print("<band splitType=\"Stretch\"/>");
        o.print("</background>");
    }

    private static void ndas(PrintWriter o) {
        title(o);
        o.print("<pageHeader>");
        o.print("<band splitType=\"Stretch\"/>");
        o.print("</pageHeader>");
        kolom(o);
    }

    private static void title(PrintWriter o) {
        o.print("<title>");
        o.print("<band height=\"59\" splitType=\"Stretch\">");
        o.print("<staticText>");
        o.print("<reportElement style=\"Title\" x=\"0\" y=\"0\" width=\"352\" height=\"33\" uuid=\"77c315d6-5643-4fd3-8dee-0f9a8224f649\"/>");
        o.print("<textElement verticalAlignment=\"Middle\"/>");
        o.print("<text><![CDATA[TOKO BANGUNAN WIJAYA]]></text>");
        o.print("</staticText>");
        o.print("<textField>");
        o.print("<reportElement style=\"SubTitle\" x=\"124\" y=\"33\" width=\"261\" height=\"24\" uuid=\"a81d79a1-97b2-4589-8704-58e91dac77df\"/>");
        o.print("<textFieldExpression><![CDATA[$F{jual_nota}]]></textFieldExpression>");
        o.print("</textField>");
        o.print("</band>");
        o.print("</title>");
    }

    private static void kolom(PrintWriter o) {
        o.print("<columnHeader>");
        o.print("<band height=\"15\" splitType=\"Stretch\">");
        o.print("<staticText>");
        o.print("<reportElement style=\"Column header\" x=\"0\" y=\"0\" width=\"108\" height=\"15\" uuid=\"516ca095-2621-41cd-8742-9f37825bc0c5\"/>");
        o.print("<text><![CDATA[KODE BARANG]]></text>");
        o.print("</staticText>");
        o.print("<staticText>");
        o.print("<reportElement style=\"Column header\" x=\"108\" y=\"0\" width=\"92\" height=\"15\" uuid=\""
                + "51484d33-ebd1-48f9-9a3e-cb4de9b1212c\"/>");
        o.print("<text><![CDATA[Qty]]></text>");
        o.print("</staticText>");
        o.print("<staticText>");
        o.print("<reportElement style=\"Column header\" x=\"200\" y=\"0\" width=\"185\" height=\"15\" uuid=\""
                + "880e77ad-714f-4ce4-8098-f4385eaac021\"/>");
        o.print("<textElement textAlignment=\"Right\"/>");
        o.print("<text><![CDATA[Sub Total]]></text>");
        o.print("</staticText></band></columnHeader>");
    }

    private static void awak(PrintWriter o) {
        o.print("<detail><band height=\"16\" splitType=\"Stretch\">");
        o.print("<line>");
        o.print("<reportElement positionType=\"FixRelativeToBottom\" x=\"0\" y=\"15\" width=\"555\" height=\"1\" uuid=\""
                + "7e7dfb33-a45e-460d-857b-3f6025e654cd\"/>");
        o.print("<graphicElement>");
        o.print("<pen lineWidth=\"0.5\" lineColor=\"#999999\"/>");
        o.print("</graphicElement>");
        o.print("</line>");
        baris(o);
        o.print("</band></detail>");
    }

    private static void baris(PrintWriter o) {
        o.print("<textField>");
        o.print("<reportElement style=\"Detail\" x=\"0\" y=\"1\" width=\"108\" height=\"15\" uuid=\""
                + "8c1b1731-185b-4083-8d90-33e8130bfe24\"/>");
        o.print("<textFieldExpression><![CDATA[$F{detjual_brg}]]></textFieldExpression>");
        o.print("</textField>");
        o.print("<textField>");
        o.print("<reportElement style=\"Detail\" x=\"200\" y=\"1\" width=\"185\" height=\"15\" uuid=\""
                + "b008fc0b-88cb-4408-814d-e949be08dd47\"/>");
        o.print("<textElement textAlignment=\"Right\"/>");
        o.print("<textFieldExpression><![CDATA[$F{detjual_byr}]]></textFieldExpression>");
        o.print("</textField>");
        o.print("<textField>");
        o.print("<reportElement style=\"Detail\" x=\"108\" y=\"1\" width=\"92\" height=\"15\" uuid=\""
                + "2ed4ae12-db42-4019-b9b1-3e166ebf0107\"/>");
        o.print("<textFieldExpression><![CDATA[$F{detjual_jum}]]></textFieldExpression>");
        o.print("</textField>");
    }

    private static void kaki(PrintWriter o) {
        footer1(o);
        footer2(o);
        o.print("<summary>");
        o.print("<band splitType=\"Stretch\"/>");
        o.print("</summary>");
        o.print("</jasperReport>");
    }

    private static void footer1(PrintWriter o) {
        o.print("<columnFooter><band height=\"45\" splitType=\"Stretch\">");
        o.print("<line>");
        o.print("<reportElement positionType=\"FixRelativeToBottom\" x=\"0\" y=\"3\" width=\"555\" height=\"1\" uuid=\""
                + "4e1a923e-77fa-42ac-a991-da4eaded5162\"/>");
        o.print("<graphicElement>");
        o.print("<pen lineWidth=\"0.375\" lineColor=\"#999999\"/>");
        o.print("</graphicElement>");
        o.print("</line>");
        kesimpulan(o);
        o.print("</band></columnFooter>");
    }

    private static void kesimpulan(PrintWriter o) {
        o.print("<textField>");
        o.print("<reportElement style=\"Detail\" x=\"200\" y=\"4\" width=\"185\" height=\"12\" uuid=\"eb58a5b4-7fe7-42ff-a608-a71e86e1d03e\"/>");
        o.print("<textElement textAlignment=\"Right\"/>");
        o.print("<textFieldExpression><![CDATA[$F{jual_total}]]></textFieldExpression>");
        o.print("</textField><textField>");
        o.print("<reportElement style=\"Detail\" x=\"200\" y=\"16\" width=\"185\" height=\"15\" uuid=\"2ff06299-a6d2-4ec0-abe1-81679dc2b2a4\"/>");
        o.print("<textElement textAlignment=\"Right\"/>");
        o.print("<textFieldExpression><![CDATA[$F{jual_kembali}]]></textFieldExpression>");
        o.print("</textField><textField>");
        o.print("<reportElement style=\"Detail\" x=\"200\" y=\"31\" width=\"185\" height=\"14\" uuid=\"48648ec7-8440-47b0-be43-847bce60a359\"/>");
        o.print("<textElement textAlignment=\"Right\"/>");
        o.print("<textFieldExpression><![CDATA[$F{jual_byr}]]></textFieldExpression>");
        o.print("</textField>");
        keterangane(o);
    }

    private static void footer2(PrintWriter o) {
        o.print("<pageFooter><band height=\"15\" splitType=\"Stretch\">");
        o.print("<textField>");
        o.print("<reportElement style=\"Column header\" x=\"275\" y=\"0\" width=\"80\" height=\"15\" uuid=\""
                + "9b183ecc-85d1-412c-b829-328ecce6669c\"/>");
        o.print("<textElement textAlignment=\"Right\">");
        o.print("<font size=\"8\" isBold=\"false\"/>");
        o.print("</textElement>");
        o.print("<textFieldExpression><![CDATA[\"Page \"+$V{PAGE_NUMBER}+\" of\"]]></textFieldExpression>");
        o.print("</textField>");
        pageNumber(o);
        o.print("</band></pageFooter>");
    }

    private static void pageNumber(PrintWriter o) {
        o.print("<textField evaluationTime=\"Report\">");
        o.print("<reportElement style=\"Column header\" x=\"355\" y=\"0\" width=\"30\" height=\"15\" uuid=\""
                + "e904c84d-5ce0-4a46-95c5-f957e4276755\"/>");
        o.print("<textElement>");
        o.print("<font size=\"8\" isBold=\"false\"/>");
        o.print("</textElement>");
        o.print("<textFieldExpression><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>");
        o.print("</textField><textField pattern=\"EEEEE dd MMMMM yyyy\">");
        o.print("<reportElement style=\"Column header\" x=\"0\" y=\"0\" width=\"148\" height=\"15\" uuid=\""
                + "693b1d31-3ba4-4a37-a6d3-1af84295b584\"/>");
        o.print("<textElement>");
        o.print("<font size=\"8\" isBold=\"false\"/>");
        o.print("</textElement>");
        o.print("<textFieldExpression><![CDATA[$F{jual_tgl}]]></textFieldExpression>");
        o.print("</textField>");
    }

    private static void keterangane(PrintWriter o) {
        o.print("<staticText>");
        o.print("<reportElement style=\"Column header\" x=\"0\" y=\"4\" width=\"100\" height=\"12\" uuid=\""
                + "93306a98-a346-4333-9e43-9ab55adc64d8\"/>");
        o.print("<text><![CDATA[Total]]></text>");
        o.print("</staticText><staticText>");
        o.print("<reportElement style=\"Column header\" x=\"0\" y=\"18\" width=\"100\" height=\"12\" uuid=\""
                + "ba32a78b-a1b9-4575-a2ba-9b0b82db51fb\"/>");
        o.print("<text><![CDATA[Pembayaran]]></text>");
        o.print("</staticText><staticText>");
        o.print("<reportElement style=\"Column header\" x=\"0\" y=\"33\" width=\"100\" height=\"12\" uuid=\""
                + "bd9439f5-ccd3-4608-94ed-6fb6861f5db4\"/>");
        o.print("<text><![CDATA[Kembalian]]></text>");
        o.print("</staticText>");
    }
}