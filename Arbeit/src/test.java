public class test {
    public static void main(String[] args) {
        Spieler horst1 = new Spieler("horst1",20,10,5);
        Torwart horst2 = new Torwart("horst2",13,6,9,5);
        Trainer horst3 = new Trainer("horst3",19,9);
        Spieler test = new Spieler("Mani",18,3,10);

        System.out.println("Name: " + horst1.getName());
        System.out.println("Alter: " + horst1.getAlter());
        System.out.println("Motivation: " + horst1.getMotivation());
        System.out.println("Stärke: " + test.getStaerke());
    }


}
