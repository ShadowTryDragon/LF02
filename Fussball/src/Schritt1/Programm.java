package Schritt1;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        Ergebnis ergebnis = new Ergebnis();
        Trainer trainer1 = new Trainer("Hugo", 49, 10);
        Torwart torwart1 = new Torwart("Tilo", 29, 10, 10, 10);
        Spieler spieler1 = new Spieler("Julius",29,10,10,8,54);
        Spieler spieler2 = new Spieler("Jatta",22,7,5,9,12);
        Spieler spieler3 = new Spieler("Heyer",24,8,4,6,8);
        Spieler spieler4 = new Spieler("Schonlau",27,9,3,10,2);
        ArrayList<Spieler> spielerArrayList1 = new ArrayList<>();
        spielerArrayList1.add(spieler1);
        spielerArrayList1.add(spieler2);
        spielerArrayList1.add(spieler3);
        spielerArrayList1.add(spieler4);
        Mannschaft mannschaft1 = new Mannschaft("Bremen", trainer1 , torwart1, spielerArrayList1);
        System.out.println(mannschaft1);
        System.out.println();

        Trainer trainer2 = new Trainer("Luck", 70, 1);
        Torwart torwart2 = new Torwart("Chan", 45, 1, 1, 6);
        Spieler spieler1_ = new Spieler("Ahmed",28,10,10,10,14);
        Spieler spieler2_ = new Spieler("Donald",26,4,2,3,6);
        Spieler spieler3_ = new Spieler("Terence",32,10,2,5,4);
        Spieler spieler4_ = new Spieler("Nicoo",30,6,1,8,2);
        ArrayList<Spieler> spielerArrayList2 = new ArrayList<>();
        spielerArrayList2.add(spieler1_);
        spielerArrayList2.add(spieler2_);
        spielerArrayList2.add(spieler3_);
        spielerArrayList2.add(spieler4_);
        Mannschaft mannschaft2 = new Mannschaft("SVW",trainer2,torwart2,spielerArrayList2 );
        System.out.println(mannschaft2);
        System.out.println();
        Spiel spiel = new Spiel(mannschaft1,mannschaft2,ergebnis);
        System.out.println(ergebnis);
        System.out.println(spiel);







    }
}
