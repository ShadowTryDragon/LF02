import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;


import java.io.IOException;

public class KaufvertragPDF   {
    public static void main(String[] args) throws  IOException {

        String datei = "H:/Dokumente/Kaufvertrag.pdf";
        String bild1 = "H:/Dokumente/Laptop.jpg";

        // PdfWriter
        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);

        // Formatierung
        document.setFont(font);
        document.setFontSize(12);


        //Paragraph 1
        Paragraph p1 = new Paragraph("Kaufvertrag vom XX.XX.XXXX").setFontColor(new DeviceRgb(50,100,150)).setFontSize(20).setBold();
        p1.add("\n");
        p1.add("\n");
        //Paragraph 2
        Paragraph p2 = new Paragraph("Verkäufer ").setFontColor(new DeviceRgb(100,100,200)).setFontSize(16).setBold();
       //Paragraph 3


        Paragraph p3 = new Paragraph("Name: Joachim Breduul");
        p3.add("\n");
        p3.add("Personummer: 01234567890");
        p3.add("\n");
        p3.add("Adresse: Auch zu Hause 7 28195 Bremen");
        p3.add("\n");
        p3.add("Telefonnummer: 15343399890");



        // Paragraph 4
        Paragraph p4 = new Paragraph("Käufer ").setFontColor(new DeviceRgb(70,80,90)).setFontSize(16).setBold();
        p4.add("\n");
        //Paragraph 5
        Paragraph p5 = new Paragraph("Name: Klaus Brandt");
        p5.add("\n");
        p5.add("Personummer: 9876543210");
        p5.add("\n");
        p5.add("Adressse: Zu Hause 3a 28199 Bremen");
        p5.add("\n");
        p5.add("Telefonnummer: 152232098321");
        //Paragraph 6
        Paragraph p6 = new Paragraph("Verkaufte Ware").setFontColor(new DeviceRgb(75,40,90)).setFontSize(16).setBold();
        p6.add("\n");
        //Paragraph 7
        Paragraph p7 = new Paragraph("Ware: Laptop").setFontColor(new DeviceRgb());
        p7.add("\n");
        p7.add("Beschreibung: es ist ein Krasser High End Gaming Laptop mit einer RTX 3090 Grafikkarte und touch Display und eingebauter Kühlung perfekt um darauf spannende Matches zu spielen oder um mit deinen Freunden eine gemütliche Runde Partygames Online zu genießen!");
        p7.add("\n");
        p7.add("\n");
        p7.add("Zugehör:  Gaming Maus, Tasche für den sicheren Transport, ");
        p7.add("\n");
        p7.add("Mängel: Ladekabel defekt");
        p7.add("\n");
        p7.add("Preis: 250€");
        p7.add("\n");
        p7.add("\n");
        Image i1 = new Image(ImageDataFactory.create(bild1));
         p7.add(i1);
        p7.add("\n");
        p7.add("Bild des Laptops").setFontSize(10);

        //Paragraph 8
        Paragraph p8 = new Paragraph(" Achtung Keine Garantie auf Rückerstattung!").setFontSize(6).setBold().setUnderline();
        p8.add("\n");
        Paragraph p9 = new Paragraph("Unterschrift des Käufers ").setFontSize(10);
        p9.add(" _________").setBold();
        Paragraph p10 = new Paragraph("Unterschrift des Verkäufers").setFontSize(10);
        p10.add(" _________").setBold();
        p10.add("\n");
        p10.add("\n");
        p10.add("\n");
        p10.add("\n");

        // Paragraph 11  ( Neue Seite )

        Paragraph p11 = new Paragraph(" Zusatzseite ").setFontColor(new DeviceRgb(50,50,150)).setFontSize(20).setBold();
        p11.add("\n");


        // Paragraph 12

        Paragraph p12 = new Paragraph("Informationen zur Beratung" ).setFontColor(new DeviceRgb(100,100,300)).setFontSize(16).setBold();
        p12.add("\n");


        // Paragraph 13

        Paragraph p13 = new Paragraph("Seite: www.EffosWeb.de");
        p13.add("\n");
        p13.add("Betreuende Person: Niels Bach");
        p13.add("\n");
        p13.add("Personummer: 32112564890");
        p13.add("\n");
        p13.add("Mitarbeiter ID: 23222");
        p13.add("\n");
        p13.add(" Email: Bachniels@gmail.com");
        p13.add("\n");
        p13.add("Telefonnummer: +49 0331237098");
        p13.add("\n");

        // Paragraph14

        Paragraph p14 = new Paragraph("Informationen zur Bestellungen").setFontSize(16).setBold();

        // Paragraph p15

        Paragraph p15 = new Paragraph("Dauer der Lieferung in  Tagen: 5 Tage");
        p15.add("\n");
        p15.add(" Zustellung am XX.XX.XXXX");
        p15.add("\n");
        p15.add("Zustellende Adresse: Zu Hause 3a 28199 Bremen ");
        p15.add("\n");
        p15.add("Abholstelle: -");
        p15.add("\n");
        p15.add("Zustellender Dienst: DC Logistik");
        p15.add("\n");
        p15.add("Bitte seien sie zum Zustellungstermin zuhause");
        p15.add("\n");

        // Paragraph 16
        Paragraph p16 = new Paragraph("Unterschrift des Zustellers: ").setFontSize(10);
        p16.add(" D.rawker").setBold().setUnderline();


        document.add(p1);
        document.add(p2);
        document.add(p3);
        document.add(p4);
        document.add(p5);
        document.add(p6);
        document.add(p7);
        document.add(p8);
        document.add(p9);
        document.add(p10);
        document.add(p11);
        document.add(p12);
        document.add(p13);
        document.add(p14);
        document.add(p15);
        document.add(p16);
        document.close();


    }}
