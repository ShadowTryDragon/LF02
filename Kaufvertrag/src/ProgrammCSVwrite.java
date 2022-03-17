import java.io.*;

public class ProgrammCSVwrite {

    public static void main(String[] args) throws IOException {


        Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt","0123456789");

        kaeufer.setAdresse(new Adresse2("Zu Hause", "3a", "28199", "Bremen"));

        Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull", "9876543210");
        verkaeufer.setAdresse(new Adresse2("Auch zu Hause", "7", "28195", "Bremen"));

        Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer);
        vertrag.setZahlungsModalitaet("Privater Barverkauf");
        erstelleTxt(vertrag);

    }
    private static void erstelleTxt(Kaufvertrag kaufvertrag) throws IOException {

        String datei = "H:/Dokumente/Kaufvertrag.csv";
        PrintWriter writer= new PrintWriter(datei);

        writer.print("Vertragspartner" + " ; ");
        writer.println(" Name " + " ; " + " AusweisNr " + " ; " + " Adresse ");
        writer.println(" Kaeufer " + " ; " + kaufvertrag.getKaeufer().getVorname() + " " + kaufvertrag.getKaeufer().getNachname() + " ; " + kaufvertrag.getKaeufer().getAusweisNr() + " ; " + kaufvertrag.getKaeufer().getAdresse().getStrasse()  + kaufvertrag.getKaeufer().getAdresse().getHausNr()  + " " + kaufvertrag.getKaeufer().getAdresse().getPlz() +  " " + kaufvertrag.getKaeufer().getAdresse().getOrt());
        writer.println(" Vermittler " + " ; " + "Jonas Schmidt" + " ; " + " 1237894560" + " ; " + " Nicht zu Hause " + " 7 " + " 28239" + " " + " Bremen ");
        writer.println(" Verkaufer " + " ; " +  kaufvertrag.getVerkaeufer().getVorname() + " " + kaufvertrag.getVerkaeufer().getNachname() + " ; " + kaufvertrag.getVerkaeufer().getAusweisNr() + " ; " + kaufvertrag.getVerkaeufer().getAdresse().getStrasse() + " " + kaufvertrag.getVerkaeufer().getAdresse().getHausNr() + " " + kaufvertrag.getVerkaeufer().getAdresse().getPlz() + " " + kaufvertrag.getVerkaeufer().getAdresse().getOrt());
        writer.println(" Anwalt" + " ; " + " Johannes Blütenburg " + " ; " + "123487650" + " ; " + "Auch Nicht Zuhause" + " " + " 3a" + " " +  "2819" + " " + " Bremen "  );
        writer.close();

    }

}