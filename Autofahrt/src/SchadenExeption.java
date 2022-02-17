public class SchadenExeption extends Exception {
    private String action;

    public SchadenExeption(String action){
        this.action = action;
    }
    public String getMessage(){
        return action + " kann nicht ausgeführt Auto Hat Schaden";
    }
}
