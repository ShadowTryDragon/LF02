import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> gegenstande;
    double gesamtwert = 0;

    public Tresor() {
        gegenstande = new ArrayList<Gegenstand>();

    }

    public Gegenstand getGegenstand(int id) throws GegenstandNichtVorhandenException {
        for (Gegenstand g : gegenstande) {
            if (g.getGegenstandID() == id) {
                return gegenstande.get(id);
            }
            else throw new GegenstandNichtVorhandenException("ID");
        }
        return gegenstande.get(id);
    }

    public void addGegenstand(Gegenstand gegenstand)  {
        gegenstande.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand) throws GegenstandNichtVorhandenException {
        if(gegenstande.contains(gegenstand)) gegenstande.remove(gegenstand);
        else throw new GegenstandNichtVorhandenException("ID");
}

    public double berechneGesamtwert(){
        for ( Gegenstand v: gegenstande){
            v.getGegenstandWert();
            gesamtwert += v.getGegenstandWert();
        }
        return gesamtwert;
    }
    @Override
    public String toString(){
        String text=  "\nGegenstand:\t :"+ gegenstande;
        return text;
    }
}
