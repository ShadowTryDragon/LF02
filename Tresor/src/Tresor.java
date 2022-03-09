import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> gegenstande;

    public Tresor() {
        gegenstande = new ArrayList<Gegenstand>();

    }

    public ArrayList getGegenstande(int id) {
        return gegenstande;
    }

    public void reinlegen(Gegenstand gegenstand)  {
        gegenstande.add(gegenstand);
    }

    public void rausnehmen(Gegenstand gegenstand) throws NichtVorhandenExeption {

 gegenstande.remove(gegenstand);
    }

    public void ermitteln(Gegenstand gegenstand) throws NichtVorhandenExeption {

    }
   }