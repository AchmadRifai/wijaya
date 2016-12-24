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
        grup1(o);
        grup2(o);
        grup3(o);
        grup4(o);
        grup5(o);
        grup6(o);
        o.close();
    }

    private static void grup1(PrintWriter o) {
        o.print("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
        o.print(" xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\"");
        o.print(" name=\"null\" language=\"groovy\" pageWidth=\"425\" pageHeight=\"255\" orientation=\"Landscape\" columnWidth=\"385\"");
        o.print(" leftMargin=\"20\" rightMargin=\"20\" topMargin=\"20\" bottomMargin=\"20\" uuid=\"f05a5a0c-a352-4601-b1b4-e8214dea82e0\">");
        o.print("<property name=\"ireport.zoom\" value=\"1.5\"/>");
        o.print("<property name=\"ireport.x\" value=\"0\"/>");
        o.print("<property name=\"ireport.y\" value=\"0\"/>");
        o.print("<style name=\"Title\" fontName=\"Arial\" fontSize=\"20\" isBold=\"true\" pdfFontName=\"Helvetica-Bold\"/>");
        o.print("<style name=\"SubTitle\" forecolor=\"#666666\" fontName=\"Arial\" fontSize=\"14\"/>");
        o.print("<style name=\"Column header\" forecolor=\"#666666\" fontName=\"Arial\" fontSize=\"9\" isBold=\"true\"/>");
        o.print("<style name=\"Detail\" fontName=\"Arial\" fontSize=\"9\"/>");
        o.print("<parameter name=\"nota\" class=\"java.lang.String\"/>");
    }

    private static void grup2(PrintWriter o) {
        o.print("<queryString language=\"SQL\">");
        o.print("<![CDATA[SELECT jual.`nota` AS jual_nota,jual.`total` AS jual_total,jual.`tgl` AS jual_tgl,detjual.`brg` AS detjual_brg," +
"detjual.`jum` AS detjual_jum,detjual.`byr` AS detjual_byr FROM`jual` jual INNER JOIN `detjual` detjual ON jual.`nota` = detjual.`nota` " +
"WHERE jual.nota = $P{nota}]]></queryString>");
        o.print("<field name=\"jual_nota\" class=\"java.lang.String\"/>");
        o.print("<field name=\"jual_total\" class=\"java.lang.String\"/>");
        o.print("<field name=\"jual_tgl\" class=\"java.sql.Date\"/>");
        o.print("<field name=\"detjual_brg\" class=\"java.lang.String\"/>");
        o.print("<field name=\"detjual_jum\" class=\"java.lang.Float\"/>");
        o.print("<field name=\"detjual_byr\" class=\"java.lang.String\"/>");
        o.print("<background><band splitType=\"Stretch\"/></background>");
        o.print("<title><band height=\"59\" splitType=\"Stretch\"><staticText>");
        o.print("<reportElement style=\"Title\" x=\"0\" y=\"0\" width=\"352\" height=\"33\" uuid=\"77c315d6-5643-4fd3-8dee-0f9a8224f649\"/>");
        o.print("<textElement verticalAlignment=\"Middle\"/><text><![CDATA[TOKO BANGUNAN WIJAYA]]></text></staticText><textField>");
        o.print("<reportElement style=\"SubTitle\" x=\"124\" y=\"33\" width=\"261\" height=\"24\" uuid=\"a81d79a1-97b2-4589-8704-58e91dac77df\"/>");
        o.print("<textFieldExpression><![CDATA[$F{jual_nota}]]></textFieldExpression></textField></band></title>");
    }

    private static void grup3(PrintWriter o) {
        o.print("<pageHeader><band splitType=\"Stretch\"/></pageHeader>");
        o.print("<columnHeader><band height=\"15\" splitType=\"Stretch\"><staticText>");
        o.print("<reportElement style=\"Column header\" x=\"0\" y=\"0\" width=\"108\" height=\"15\" uuid=\"516ca095-2621-41cd-8742-9f37825bc0c5\"/>");
        o.print("<text><![CDATA[KODE BARANG]]></text></staticText><staticText>");
        o.print("<reportElement style=\"Column header\" x=\"108\" y=\"0\" width=\"92\" height=\"15\" uuid=\"51484d33-ebd1-48f9-9a3e-cb4de9b1212c\"/>");
        o.print("<text><![CDATA[Qty]]></text></staticText><staticText>");
        o.print("<reportElement style=\"Column header\" x=\"200\" y=\"0\" width=\"185\" height=\"15\" uuid=\"880e77ad-714f-4ce4-8098-f4385eaac021\"/>");
        o.print("<textElement textAlignment=\"Right\"/>");
        o.print("<text><![CDATA[Sub Total]]></text></staticText></band></columnHeader>");
    }

    private static void grup4(PrintWriter o) {
        o.print("<detail><band height=\"16\" splitType=\"Stretch\"><line>");
        o.print("<reportElement positionType=\"FixRelativeToBottom\" x=\"0\" y=\"15\" width=\"555\" height=\"1\" uuid=\""
                + "7e7dfb33-a45e-460d-857b-3f6025e654cd\"/>");
        o.print("<graphicElement><pen lineWidth=\"0.5\" lineColor=\"#999999\"/></graphicElement></line><textField>");
        o.print("<reportElement style=\"Detail\" x=\"0\" y=\"1\" width=\"108\" height=\"15\" uuid=\"8c1b1731-185b-4083-8d90-33e8130bfe24\"/>");
        o.print("<textFieldExpression><![CDATA[$F{detjual_brg}]]></textFieldExpression></textField><textField>");
        o.print("<reportElement style=\"Detail\" x=\"200\" y=\"1\" width=\"185\" height=\"15\" uuid=\"b008fc0b-88cb-4408-814d-e949be08dd47\"/>");
        o.print("<textElement textAlignment=\"Right\"/><textFieldExpression><![CDATA[$F{detjual_byr}]]></textFieldExpression></textField><textField>");
        o.print("<reportElement style=\"Detail\" x=\"108\" y=\"1\" width=\"92\" height=\"15\" uuid=\"2ed4ae12-db42-4019-b9b1-3e166ebf0107\"/>");
        o.print("<textFieldExpression><![CDATA[$F{detjual_jum}]]></textFieldExpression></textField></band></detail>");
    }

    private static void grup5(PrintWriter o) {
        o.print("<columnFooter><band height=\"45\" splitType=\"Stretch\"><line>");
        o.print("<reportElement positionType=\"FixRelativeToBottom\" x=\"0\" y=\"3\" width=\"555\" height=\"1\" uuid=\""
                + "4e1a923e-77fa-42ac-a991-da4eaded5162\"/>");
        o.print("<graphicElement><pen lineWidth=\"0.375\" lineColor=\"#999999\"/></graphicElement></line><textField>");
        o.print("<reportElement style=\"Detail\" x=\"200\" y=\"33\" width=\"185\" height=\"12\" uuid=\"eb58a5b4-7fe7-42ff-a608-a71e86e1d03e\"/>");
        o.print("<textElement textAlignment=\"Right\"/><textFieldExpression><![CDATA[$F{jual_total}]]></textFieldExpression></textField>");
        o.print("</band></columnFooter>");
    }

    private static void grup6(PrintWriter o) {
        o.print("<pageFooter><band height=\"15\" splitType=\"Stretch\"><textField>");
        o.print("<reportElement style=\"Column header\" x=\"275\" y=\"0\" width=\"80\" height=\"15\" uuid=\"9b183ecc-85d1-412c-b829-328ecce6669c\"/>");
        o.print("<textElement textAlignment=\"Right\"><font size=\"8\" isBold=\"false\"/></textElement>");
        o.print("<textFieldExpression><![CDATA[\"Page \"+$V{PAGE_NUMBER}+\" of\"]]></textFieldExpression></textField>");
        o.print("<textField evaluationTime=\"Report\">");
        o.print("<reportElement style=\"Column header\" x=\"355\" y=\"0\" width=\"30\" height=\"15\" uuid=\"e904c84d-5ce0-4a46-95c5-f957e4276755\"/>");
        o.print("<textElement><font size=\"8\" isBold=\"false\"/></textElement>");
        o.print("<textFieldExpression><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression></textField>");
        o.print("<textField pattern=\"EEEEE dd MMMMM yyyy\">");
        o.print("<reportElement style=\"Column header\" x=\"0\" y=\"0\" width=\"148\" height=\"15\" uuid=\"693b1d31-3ba4-4a37-a6d3-1af84295b584\"/>");
        o.print("<textElement><font size=\"8\" isBold=\"false\"/></textElement>");
        o.print("<textFieldExpression><![CDATA[$F{jual_tgl}]]></textFieldExpression></textField></band></pageFooter>");
        o.print("<summary><band splitType=\"Stretch\"/></summary></jasperReport>");
    }
}