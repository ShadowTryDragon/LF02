public abstract class Gegenstand {
    private int gegenstandID;
    private double gegenstandWert;

    public Gegenstand(int gegenstandID, double gegenstandWert) {
        this.gegenstandID = gegenstandID;
        this.gegenstandWert = gegenstandWert;
    }


    public int getGegenstandID() {
        return gegenstandID;
    }

    public double getGegenstandWert() {
        return gegenstandWert;
    }

    public void setGegenstandID(int gegenstandID) {
        this.gegenstandID = gegenstandID;
    }

    public void setGegenstandWert(double gegenstandWert) {
        this.gegenstandWert = gegenstandWert;
    }

    public String toString() {
        String text = "ID: " + gegenstandID;
        text = text + "\n\t" + ", Gegenstandwert:" + " " + gegenstandWert;
        return text;
    }
}
