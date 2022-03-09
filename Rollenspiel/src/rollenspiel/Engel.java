package rollenspiel;

public class Engel extends Spielfigur {
    private int zauberpunkte;

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public void setZauberpunkte(int zauberpunkte) {
        this.zauberpunkte = zauberpunkte;
    }

    public Engel(String name, int staerkepunkte, int munition, int leben  ) {
        super(name, staerkepunkte, munition, leben);
    }
    public void fliegen() throws KeineKraftExeption {
        if (getStaerkepunkte() >= 1)
            System.out.println(getName() + "Fliegt");
        else throw new KeineKraftExeption("Fliegen", getName());
    }

    public void helfen() throws KeineKraftExeption {
        if (getZauberpunkte() >= 1 && getLeben() >= 1) {
            System.out.println(getName() + "hilft");
            zauberpunkte = zauberpunkte - 1;
        }
        else throw new KeineKraftExeption("Helfen", getName());
    }


    public String toString() {
        String text;
        text = super.toString();
        text = text + "\n\t" + ", Mana:" + " " + zauberpunkte;
        return text;
}}
