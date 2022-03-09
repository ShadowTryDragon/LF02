package rollenspiel;



public class test {
    public static void main(String[] args) throws KeineKraftExeption {
        Zauberer z1 = new Zauberer("Merlin",3,30,2, 100);
        Elfe e1 = new Elfe("Yechan", 20,4,100);
        System.out.println(z1.getName());
        System.out.println(e1.getName());


        try {
            z1.kaempfen();
        }
        catch (KeineKraftExeption e ) {
            System.out.println(e.getMessage());}

        try {
            z1.zaubern();
        }
        catch (KeineKraftExeption e ) {
            System.out.println(e.getMessage());}
        try {
            z1.laufen();
        }
        catch (KeineKraftExeption e ) {
            System.out.println(e.getMessage());}

        try {
            z1.klettern();
        }
        catch (KeineKraftExeption e ) {
            System.out.println(e.getMessage());}

        try {
            e1.schiessen();
        }
        catch (KeineMunitionExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
