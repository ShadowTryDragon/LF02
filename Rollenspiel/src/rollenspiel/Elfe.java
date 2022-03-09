package rollenspiel;

public class Elfe extends Spielfigur {


    public Elfe(String name, int staerkepunkte, int munition, int leben) {
        super(name, staerkepunkte, munition, leben );
    }
    public void rennen() throws KeineKraftExeption {
        if (getStaerkepunkte() >= 2) {
            System.out.println(getName() + "rennt");
             setStaerkepunkte(getStaerkepunkte() -2);
        } else
            throw new KeineKraftExeption("zaubern", getName());

    }
    public String toString() {
        String text;
        text = super.toString();
        return text;
}}