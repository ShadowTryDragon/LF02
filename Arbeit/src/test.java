public class test {
    public static void main(String[] args) {
        Spieler horst1 = new Spieler("horst1",20,10,5);
        Torwart horst2 = new Torwart("horst2",13,6,9,5);
        Trainer horst3 = new Trainer("horst3",19,9);

        System.out.println(horst1.getName());
        System.out.println(horst2.getName());
        System.out.println(horst3.getErfahrung());
    }


}
