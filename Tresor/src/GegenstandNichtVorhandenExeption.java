public class GegenstandNichtVorhandenExeption extends Exception{
    private String id;

    public GegenstandNichtVorhandenExeption(String id) {
   this.id = id;
    }
    public String getMessage() {
        return id + " nicht vorhanden";
    }
}
