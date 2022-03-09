package rollenspiel;


public abstract class Spielfigur  {
    //Attribute erzeugen
    private String name;
    private int staerkepunkte;
    private int muniton;
    private int leben;

    //Konstruktor
    public Spielfigur(String name, int staerkepunkte, int muniton, int leben) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }
    //getter Name
    public String getName() {
        return name;
    }
    //setter Name
    public void setName(String name) {
        this.name = name;
    }
    //getter Stärke
    public int getStaerkepunkte() {
        return staerkepunkte;
    }
    //setter Stärke
    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public int getMuniton() {
        return muniton;
    }
    public void setMuniton(int muniton) {
        this.muniton = muniton;
    }

    public int getLeben() {
        return leben;
    }

    public void setLeben(int leben) {
        this.leben = leben;
    }

    public void laufen() throws KeineKraftExeption {
    if (getStaerkepunkte() >= 1 && leben >=1){
        System.out.println(getName() + " läuft");
        staerkepunkte = staerkepunkte - 1;
    } else
        throw new KeineKraftExeption("laufen", getName());
}

public void klettern() throws KeineKraftExeption {
    if (getStaerkepunkte() >= 2 && leben >=1) {
        System.out.println(getName() + " klettert");
        staerkepunkte = staerkepunkte - 2;
    } else
        throw new KeineKraftExeption("klettern", getName());

}
public void essen()
{ staerkepunkte = staerkepunkte + 10;

}
public void kaempfen() throws KeineKraftExeption {
    if (getStaerkepunkte() >= 3 && leben >= 5 ) {
        System.out.println(getName() + " kämpft");
        staerkepunkte = staerkepunkte - 3;
    } else
        throw new KeineKraftExeption("kämpfen", getName());
}
public void schlafen()
{
    System.out.println(getName() + " erholt sich");
staerkepunkte = staerkepunkte + 10;
leben = leben + 5;
}
public void schiessen() throws KeineMunitionExeption {
        if (getMuniton() >=1) {
            System.out.println(getName() + "Schießt ");
        muniton = muniton - 1;
        }
        else throw new KeineMunitionExeption("schießen", getName());
}
    public String toString() {
        String text = "Name: " + name;
        text = text + "\n\t" + ", Stärke:" + " " + staerkepunkte;
        return text;
        
    }


}




