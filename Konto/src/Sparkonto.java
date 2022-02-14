public class Sparkonto extends Konto {

    public Sparkonto(Kunde inhaber,double kreditlimit, double zinssatz) {
        super(inhaber, 0, zinssatz);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}