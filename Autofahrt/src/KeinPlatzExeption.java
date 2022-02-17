public class KeinPlatzExeption extends Exception {
    private String action;
    public KeinPlatzExeption(String action){
        this.action = action;
    }
    public String getMessage() {
        return action + "kann nich ausgeführt werden kein Platz";
    }
}
