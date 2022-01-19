public class Apfel extends Obst {
    public Apfel() {
        super("Apfel");
    }

    public String toString() {
        String text = getName() + " " + getGewicht();
        return text;
    }
}

