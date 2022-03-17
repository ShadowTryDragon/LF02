import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class testmueller {

    public static class Programm {

        public static void PrintWriter(String vertrag) throws FileNotFoundException {
            String datei = "H:/Dokumente/Kaufvertrag.txt";
            PrintWriter writer = new PrintWriter(datei);
            writer.println(vertrag);
            writer.close();
        }

        public static void main(String[] args) throws FileNotFoundException {


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
               Vertragspartner vermittler = new Vertragspartner("Jonas","Smidt", "1237894560");
                  Adresse2 a3 = new Adresse2("Nicht Zuhause", "7","28239", "Bremen");
                  vermittler.setAdresse(a3);
                Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer);
                vertrag.setZahlungsModalitaet("Privater Barverkauf");


                PrintWriter("" + vertrag);

                System.out.println(vertrag);


            }


        }
    }
}
