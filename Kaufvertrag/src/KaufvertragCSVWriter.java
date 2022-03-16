import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class KaufvertragCSVWriter {
    public static void PrintWriter(String vertrag) throws FileNotFoundException {
        String datei = "H:/Dokumente/Kaufvertrag.csv";
        PrintWriter writer = new PrintWriter(datei);
        writer.println("Vertragspartner");
        writer.println("Name");
        writer.println("Nachname");
        writer.println("AusweisNr");
        writer.println("Straße");
        writer.println("HausNr");
        writer.println("PLZ");
        writer.println("Ort");
        writer.println("Verkäufer");
        writer.println("Joachim");
        writer.println("Bredull");
        writer.println("9876543210");
        writer.println("Zu Hause");
        writer.println("7");
        writer.println("28199");
        writer.println("Bremen");
        writer.println("Käufer");
        writer.println("Klaus");
        writer.println("Brandt");
        writer.println("1234567890");
        writer.println("Auch zu Hause");
        writer.println("3a");
        writer.println("27195");
        writer.println("Bremen");

        writer.close();
    }
    public static void main(String[] args) throws IOException {


        {
            Ware ware = new Ware("Laptop", 250.0);
            ware.setBeschreibung("Super krasses High-End Gaming-Laptop ");
            ware.getBesonderheiten().add("Tasche");
            ware.getBesonderheiten().add("Gaming-Maus");
            ware.getMaengel().add("Ladekabel fehlt");
            ware.getMaengel().add("Touchpad defekt");

            Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt", "01234567890");
            Adresse2 a1 = new Adresse2("Zu Hause", "3a", "28199", "Bremen");
            kaeufer.setAdresse(a1);

            Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull", "9876543210");
            Adresse2 a2 = new Adresse2("Auch zu Hause", "7", "28195", "Bremen");
            verkaeufer.setAdresse(a2);

            Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
            vertrag.setZahlungsModalitaet("Privater Barverkauf");


            PrintWriter("" + vertrag);

            System.out.println(vertrag);



        }
}}
