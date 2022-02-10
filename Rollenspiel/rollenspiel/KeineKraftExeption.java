package rollenspiel;

public class KeineKraftExeption extends Exception {
    private String action;
    private String name;
    public  KeineKraftExeption (String action, String name){
  this.name = name;
  this.action = action;
    }
    public String getMessage()
    {
        return name + " kann nicht " + action;
    }
}