public class KeineKraftExeption extends Exception {
    public  KeineKraftExeption (String action, String name){

    }
    public String getMessage()
    {
        System.out.println("Du hast nicht genug Kraft");
        return getMessage();
    }
}