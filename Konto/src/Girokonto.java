public class Girokonto extends Konto {
    private double zinsKredit;

    public Girokonto(Kunde inhaber, double zinsKredit, double kresitlimit, double zinssatz) {
        super(inhaber, kresitlimit, zinssatz);
        this.zinsKredit = zinsKredit;
    }

    @Override
    public void setKreditLimit(double kreditLimit) {
        super.setKreditLimit(kreditLimit);
    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }

    public void ueberweisen(double betrag, Girokonto girokonto) throws BetragNichtKorrektException, KreditLimitUeberschreibenException {
        if (getKontoStand() + getKreditLimit() >= betrag) {
            auszahlen(betrag);
            girokonto.einzahlen(betrag);
            System.out.println("Überweisung Erfolgreich!");

        } else {
            throw new KreditLimitUeberschreibenException("Überweisung");
        }
    }

    @Override
    public String toString() {
        return "Girokonto{" +
                "zinsKredit=" + zinsKredit +
                '}';
    }
}