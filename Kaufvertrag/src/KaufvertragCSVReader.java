import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class KaufvertragCSVReader {
    public static void PrintReader(Kaufvertrag kaufvertrag) throws IOException {
        String datei = "H:/Dokumente/Kaufvertrag.csv";
        BufferedReader br =  new  BufferedReader(new FileReader(datei));
        String zeile;
        ArrayList<String[]> arrayList = new ArrayList<>();
        while((zeile = br.readLine()) != null ) {

            String[] array = zeile.split(";");

        }
        for(String[] s : arrayList) {
            System.out.println(kaufvertrag);
        }
}
}
