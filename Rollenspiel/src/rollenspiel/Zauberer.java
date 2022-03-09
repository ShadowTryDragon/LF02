package rollenspiel;



public class Zauberer extends Spielfigur {
    private int zauberpunkte;

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public Zauberer(String name, int staerkepunkte, int zauberpunkte,  int munition, int leben) {

        super(name, staerkepunkte, munition, leben);
        this.zauberpunkte = zauberpunkte;
    }

    public void zaubern() throws KeineKraftExeption {
        if (getZauberpunkte() >= 0) {
            System.out.println(getName() + " zaubert");
            zauberpunkte = zauberpunkte - 1;
        } else
            throw new KeineKraftExeption("zaubern", getName());


    }
    public void trinkenZaubertrank() {
        zauberpunkte = zauberpunkte + 3;
    }

    @Override
        public String toString() {
            String text;
            text = super.toString();
        text = text + "\n\t" + ", Mana:" + " " + zauberpunkte;
            return text;
    }
}
