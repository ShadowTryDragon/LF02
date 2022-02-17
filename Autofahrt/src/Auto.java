public class Auto {
    private String marke;
    private String sitzplaetze;
    private String antrieb;
    private String benoetigteFuehrerschein;
    private Fahrer fahrer;
    private double treibstoff;
    private String hatSchaden;

    public Auto(String marke, String sitzplaetze, String benoetigteFuehrerschein, Fahrer fahrer, double treibstoff, String hatSchaden) {
        this.fahrer = fahrer;
        this.marke = marke;
        this.benoetigteFuehrerschein = benoetigteFuehrerschein;
        this.treibstoff = treibstoff;
    }

    public  String getMarke() {
        return marke;
    }
    public String getSitzplaetze() {
        return sitzplaetze;
    }
    public String getAntrieb(){
        return antrieb;
    }
    public String getBenoetigteFuehrerschein() {
        return benoetigteFuehrerschein;
    }
    public double getTreibstoff() {
        return treibstoff;
    }
    public String isHatSchaden(){
        return hatSchaden;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
    public void setSitzplaetze(String sitzplaetze){
        this.sitzplaetze = sitzplaetze;
    }
    public void setAntrieb(String antrieb) {
        this.antrieb = antrieb;
    }
    public void setBenoetigteFuehrerschein(String benoetigteFuehrerschein) {
        this.benoetigteFuehrerschein = benoetigteFuehrerschein;

    }
    public void setTreibstoff(double treibstoff) {
        this.treibstoff = treibstoff;
    }
    public void setHatSchaden(String hatSchaden) {
        hatSchaden = hatSchaden;
    }


    public void fahren() throws KeinBenzinExeption, FalscheKlasseExeption, SchadenExeption {
        if (treibstoff >= 1)
            setTreibstoff(getTreibstoff()-1);
        else
            throw new KeinBenzinExeption("Fahren ");

        if (getBenoetigteFuehrerschein().equalsIgnoreCase("B"))
            System.out.println("Fährt");
    else
            throw new FalscheKlasseExeption("Fahren");

        if (hatSchaden.equalsIgnoreCase("Nein") || hatSchaden.equalsIgnoreCase("Hat Nicht"))
            System.out.println("Fährt");
else throw new SchadenExeption("Fahren");

    }
public void tanken()  {
    System.out.println(" Tankt ");
       treibstoff = treibstoff + 1;
}

}
