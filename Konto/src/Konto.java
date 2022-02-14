public abstract class Konto {

    private Kunde inhaber;
    private  double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kreditLimit, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kontoStand = 0;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    protected void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) throws BetragNichtKorrektException {
        this.zinsGuthaben = zinsGuthaben;
    }
    public void setKontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public void einzahlen(double betrag) throws BetragNichtKorrektException {
        if (betrag > 0 ) {
            this.kontoStand = kontoStand - betrag ;
            System.out.println("Einzahlung war Erfolgreich!");
        } else {
            throw new BetragNichtKorrektException("Einzazhlen");
        }
    }
    public void auszahlen (double betrag) throws KreditLimitUeberschreibenException {
        if (kontoStand + kreditLimit >= betrag) {
            kontoStand = kontoStand - betrag;
            System.out.println("Auszahlung erfolgreich");
        } else if  ( kontoStand < 0 ) {
            System.out.println("Du Hast Kein Geld");
            throw new KreditLimitUeberschreibenException("Auszahlen");
        }

    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber=" + inhaber +
                ", kontoStand=" + kontoStand +
                ", kreditLimit=" + kreditLimit +
                ", zinsGuthaben=" + zinsGuthaben +
                '}';
    }
}