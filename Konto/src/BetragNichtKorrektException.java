public class BetragNichtKorrektException extends Exception {
    private String action;

    public  BetragNichtKorrektException ( String action ){
        this.action = action;

    }
    public String getMessage()
    {
        return action + " kann nicht ausgeführt werden ";
    }
}