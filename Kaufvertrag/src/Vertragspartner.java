public abstract class Vertragspartner {

    private String vorname;
    private String nachname;
    private Adresse2 adresse;
    private String ausweisNr;

    public Vertragspartner(String vorname, String nachname, String ausweisNr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.ausweisNr = ausweisNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Adresse2 getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse2 adresse) {
        this.adresse = adresse;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    @Override
    public String toString() {
        String text = "Name: " + vorname;
        text = text + "\n\t" + ", Nachname:" + " " + nachname;
        text = text + "\n\t" + ", Adresse:" + " " + adresse;
        text = text + "\n\t" + ", AusweisNr:" + " " + ausweisNr;
        return text;
    }
}