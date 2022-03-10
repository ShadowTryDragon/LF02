public class Schmuck extends Gegenstand {
    private String bezeichnung;

    public String getBezeichnung() {
        return bezeichnung;
    }
    public Schmuck(int gegenstandID, double gegenstandWert, String bezeichnung ) {
        super(gegenstandID, gegenstandWert);
        this.bezeichnung = bezeichnung;
    }
        public String toString() {
            String text;
            text = super.toString();
            text = "Bezeichnung:" + bezeichnung;
            return text;

    }
}
