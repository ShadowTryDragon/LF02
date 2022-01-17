public class Programm  {
    public static void main(String[] args) {

Apfel Apfel = new Apfel();
        Apfel.setFarbe("Grün");
        Apfel.setGewicht(250);
        Apfel.setReife(true);

        System.out.println(Apfel.getName());
        System.out.println(Apfel.getGewicht());
 Banane banane = new Banane();
 banane.setKruemmung(0.5);
        System.out.println(banane.getName());
        System.out.println(banane.getKruemmung());

    }



}
