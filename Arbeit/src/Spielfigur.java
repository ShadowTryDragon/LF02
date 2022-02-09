public abstract class Spielfigur  {
    //Attribute erzeugen
    private String name;
    private int staerkepunkte;

    //Konstruktor
    public Spielfigur(String name, int staerkepunkte) {
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
    public void setAlter(int alter) {
        this.staerkepunkte = staerkepunkte;
    }
public void laufen() throws KeineKraftExeption {
    if (getStaerkepunkte() > 1) {
        System.out.println(getName() + "läuft");
        staerkepunkte = staerkepunkte - 1;
    } else
        throw new KeineKraftExeption("laufen", getName());
}

public void klettern() throws KeineKraftExeption {
    if (getStaerkepunkte() > 2) {
        System.out.println(getName() + "klettert");
        staerkepunkte = staerkepunkte - 1;
    } else
        throw new KeineKraftExeption("klettern", getName());

}
public void essen()
{ staerkepunkte = staerkepunkte + 10;

}
public void kaempfen() throws KeineKraftExeption {
    if (getStaerkepunkte() > 3) {
        System.out.println(getName() + "kämpft");
        staerkepunkte = staerkepunkte - 3;
    } else
        throw new KeineKraftExeption("kämpfen", getName());
}
    public String toString() {
        String text = "Name: " + name;
        text = text + "\n\t" + ", Stärke:" + " " + staerkepunkte;
        return text;
    }


}




