public class Zauberer extends Spielfigur {
    private int zauberpunkte;

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public Zauberer(String name, int staerkepunkte, int zauberpunkte) {

        super(name, staerkepunkte);
        this.zauberpunkte = zauberpunkte;
    }

    public void zaubern() throws KeineKraftExeption {
        if (getZauberpunkte() > 0) {
            System.out.println(getName() + "zaubert");
            zauberpunkte = zauberpunkte - 1;
        } else
            throw new KeineKraftExeption("zaubern", getName());


    }
    public void trinkenZaubertrank() {
        zauberpunkte = zauberpunkte + 3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tZauberpunkte\t = " + zauberpunkte;
    }
}
