import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;

public class KaufvertragPDF   {
    public static void main(String[] args) throws  IOException {

        String datei = "H:/Dokumente/Kaufvertrag.pdf";
        // PdfWriter
        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        // Formatierung
        document.setFont(font);
        document.setFontSize(12);


        //Paragraph 1
        Paragraph p1 = new Paragraph("Vertragspartner").setFontColor(new DeviceRgb(50,100,150)).setFontSize(20);
        p1.add("\n");
        p1.add("\n");
        //Paragraph 2
        Paragraph p2 = new Paragraph("Verkäufer ").setFontColor(new DeviceRgb(100,100,200)).setFontSize(16);
       //Paragraph 3


        Paragraph p3 = new Paragraph("Name: Joachim Breduul");
        p3.add("\n");
        p3.add("Personummer: 01234567890");
        p3.add("\n");
        p3.add("Adresse: Auch zu Hause 7 28195 Bremen");


        // Paragraph 4
        Paragraph p4 = new Paragraph("Käufer ").setFontColor(new DeviceRgb(70,80,90)).setFontSize(16);
        p4.add("\n");
        //Paragraph 5
        Paragraph p5 = new Paragraph("Name: Klaus Brandt");
        p5.add("\n");
        p5.add("Personummer: 9876543210");
        p5.add("\n");
        p5.add("Adressse: Zu Hause 3a 28199 Bremen");
        //Paragraph 6
        Paragraph p6 = new Paragraph("Vekaufte Ware").setFontColor(new DeviceRgb(75,40,90)).setFontSize(16);
        p6.add("\n");
        //Paragraph 7
        Paragraph p7 = new Paragraph("Laptop").setFontColor(new DeviceRgb());
        p7.add("\n");
        p7.add("Krasser High End Laptop");
        p7.add("\n");
        p7.add("Preis: 250 Zacken");
        p7.add("\n");
        p7.add("nur Zahlung in Bar");






        document.add(p1);
        document.add(p2);
        document.add(p3);
        document.add(p4);
        document.add(p5);
        document.add(p6);
        document.add(p7);
        document.close();


    }}
