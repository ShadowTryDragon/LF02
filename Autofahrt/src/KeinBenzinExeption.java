public class KeinBenzinExeption extends Exception {

    private String action;

    public KeinBenzinExeption(String action) {
        this.action = action;
    }
    public String getMessage()
    {
        return action + "ist nicht möglich Bitte Tanken";
}}
