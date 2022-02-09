public class Elfe extends Spielfigur {


    public Elfe(String name, int staerkepunkte) {
        super(name, staerkepunkte);
    }
    public void rennen() throws KeineKraftExeption{
        if (getStaerkepunkte() > 2) {
            System.out.println(getName() + "rennt");
            getStaerkepunkte() = getStaerkepunkte() - 1;
        } else
            throw new KeineKraftExeption("zaubern", getName());




    }
}
