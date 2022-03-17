public class Kaufvertrag {
    private Vertragspartner kaeufer;
    private  Vertragspartner verkaeufer;
    private  Ware ware;
    private  String zahlungsModalitaet;
    public Kaufvertrag(Vertragspartner kaeufer, Vertragspartner verkaeufer) {
        this.verkaeufer = verkaeufer;
        this.kaeufer = kaeufer;

    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }
    public void setVerkaeufer(Vertragspartner verkaeufer) {
        this.verkaeufer = verkaeufer;
    }

    public String getZahlungsModalitaet() {
        return zahlungsModalitaet;
    }
    public void setZahlungsModalitaet(String zahlungsModalitaet) {
        this.zahlungsModalitaet = zahlungsModalitaet;
    }

    public Ware getWare() {
        return ware;
    }
    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }


    @Override
    public String toString() {
        return "Kaufvertrag{" +
                "kaeufer=" + kaeufer +
                ", verkaeufer=" + verkaeufer ;
    }
}


