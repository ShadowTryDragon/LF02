public class Kunde extends Person {
    private Betreuer betreuer;

    public Kunde(Betreuer betreuer, String vorname, String nachname) {
        super(vorname, nachname);
        this.betreuer = betreuer;
    }

    public Betreuer getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Betreuer betreuer) {
        this.betreuer = betreuer;
    }

    @Override
    public String toString() {
        String text = "\n\t" + ", Betreuer:" + " " + betreuer;
        return text;
    }
}