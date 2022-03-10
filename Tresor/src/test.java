public class test  {
    public static void main(String[] args)throws GegenstandNichtVorhandenExeption {
Schmuck s1 = new Schmuck(1,20,"Ring");
        Aktie a1 = new Aktie(1,3.3,"Effos Gmbh",2);
        Tresor t1 = new Tresor();


            t1.addGegenstand(a1);


        try {
            t1.removeGegenstand(a1);
            System.out.println("rausgenommen");
        } catch (GegenstandNichtVorhandenExeption e) {
            System.out.println(e.getMessage());
        }
    }
    }



