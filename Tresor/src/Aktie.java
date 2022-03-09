public class Aktie extends Gegenstand {
    private String unternehmenName;
    private int nennWert;

    public String getUnternehmenName() {
        return unternehmenName;
    }

    public void setUnternehmenName(String unternehmenName) {
        this.unternehmenName = unternehmenName;
    }

    public int getNennWert() {
        return nennWert;
    }

    public void setNennWert(int nennWert) {
        this.nennWert = nennWert;
    }
    public Aktie(int gegenstandID, double gegenstandWert, String unternehmenName, int nennWert ) {
        super(gegenstandID,gegenstandWert);
    }
}
