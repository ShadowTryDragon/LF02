public abstract class Obst {

    private  String name;
    private  String farbe;
    private  double gewicht;
    private boolean reif;


    public  Obst(String name) {
        this.name = name;
    }
    public  String getName() {
        return name;
    }
    public String getFarbe() {
        return farbe;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public boolean getReife(boolean reif) {
        return reif;
    }
    public static void setReife(boolean reif) {
        reif = reif;
}
}
