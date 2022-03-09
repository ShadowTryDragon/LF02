package rollenspiel;

public class KeineMunitionExeption extends Exception {
    private String action;
    private String name;

    public KeineMunitionExeption(String action, String name) {
        this.action = action;
        this.name = name;

    }
    public String getMessage() {
        return name + " kann nicht " + action;
    }
}
