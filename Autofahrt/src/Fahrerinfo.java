public abstract class Fahrerinfo {
    private String vorname;
    private String nachname;
    private Adresse adresse;
    private String fuehrerscheinklasse;
    private String alter;

    public Fahrerinfo(String vorname, String nachname, String fuehrerscheinklasse, String alter, Adresse adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.fuehrerscheinklasse = fuehrerscheinklasse;
    }
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getFuehrerscheinklasse() {
        return fuehrerscheinklasse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public String getAlter() {
        return alter;
    }

    public void setNachname(String vorname) {
        this.nachname = nachname;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String toString() {
        String text = "Name: " + vorname;
        text = text + "\n\t" + ", Nachname:" + " " + nachname;
        text = text + "\n\t" + ", Adresse:" + " " + adresse;
        text = text + "\n\t" + ", Führerscheinklasse:" + " " + fuehrerscheinklasse;
        return text;

    }
}
