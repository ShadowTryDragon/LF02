import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> gegenstande;

    public Tresor() {
        gegenstande = new ArrayList<Gegenstand>();

    }

    public Gegenstand getGegenstand(int id) {
        return gegenstande.get(id);
    }

    public void addGegenstand(Gegenstand gegenstand)  {
        gegenstande.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand) throws GegenstandNichtVorhandenExeption {

 if(gegenstande.contains(gegenstand)) gegenstande.remove(gegenstand);
 else throw new GegenstandNichtVorhandenExeption("ID");
    }

    public double berechneGesamtwert() {
         gegenstande.size();
         return berechneGesamtwert();
    }

public String toString() {
        String text;
        text = "Inhalt des Tresors: " + gegenstande;
        text = "Gesamter Wert = " + berechneGesamtwert();
        return text;
}
   }
