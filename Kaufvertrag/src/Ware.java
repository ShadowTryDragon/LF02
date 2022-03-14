
import java.util.ArrayList;

public class Ware {
    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String> besonderheiten;
    private ArrayList<String> maengel;

    public String getBezeichnung() {
        return bezeichnung;
    }
public Ware(String bezeichnung, double preis) {
this.bezeichnung = bezeichnung;
this.preis = preis;
this.besonderheiten = new ArrayList<String>();
this.maengel = new ArrayList<String>();
}
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public ArrayList<String> getBesonderheiten() {
        return besonderheiten;
    }

    public void setBesonderheiten(ArrayList<String> besonderheiten) {
        this.besonderheiten = besonderheiten;
    }
    public ArrayList<String> getMaengel() {
        return maengel;
    }
    public void setMaengel(ArrayList<String> maengel) {
        this.maengel = maengel;
    }
    public String toString() {
        String text = "Name: " + bezeichnung;
        text = text + "\n\t" + ", beschreibung:" + " " + beschreibung;
        text = text + "\n\t" + ", Preis:" + " " + preis;
        text = text + "\n\t" + ", Maengel:" + " " + maengel;
        text = text + "\n\t" + ", Besonderheiten:" + " " + besonderheiten;
        return text;
    }

}
