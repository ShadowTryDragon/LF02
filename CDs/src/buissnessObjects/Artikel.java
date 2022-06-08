package buissnessObjects;

public class Artikel {
    private String artikelNr;
    private double preis;
    private String bezeichnung;
    private int bewertung;

    public Artikel(String artikelNr, String bezeichnung, double preis, int bewertung) {
        this.artikelNr = artikelNr;
        this.preis = preis;
        this.bezeichnung = bezeichnung;
    }

    public String getArtikelNr() {
        return artikelNr;
    }

    public void setArtikelNr(String artikelNr) {
        this.artikelNr = artikelNr;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }
}
