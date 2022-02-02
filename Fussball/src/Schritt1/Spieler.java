package Schritt1;

public class Spieler extends Person
{
    private String name;
    private int alter;
    private int motivation;
    private int torschuesse;
    private int staerke;
    private int tore;
    private int reaktion;






    public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int tore) {
        super(name, alter);
        this.staerke = staerke;
        this.torschuesse = torschuss;
        this.motivation = motivation;
        this.tore = tore;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getTorschuesse() {
        return torschuesse;
    }

    public void setTorschuesse(int torschuesse) {
        this.torschuesse = torschuesse;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public  int getTore() { return tore;}

    public void setTore(int tore) {this.tore = tore;}

    public int getReaktion() {
        return reaktion;
    }

    public void setReaktion() {
        this.reaktion = reaktion;
    }
    @Override
    public String toString() {
        String text = "Name: " + name;
        text = text + "\n\t" + ", Alter:" + " " + alter;
        text = text + "\n\t" + ", Stärke: " + staerke;
        text = text + "\n\t" + ", Motivation: " + motivation;
        text = text + "\n\t" + ", Tore: " + tore;
        text = text + "\n\t" + ", Torschüsse : " + torschuesse;
        text = text + "\n\t" + ", Reaktion: " + reaktion;
        return text;



        }

    }

