public class NichtVorhandenExeption extends Exception{
    private String id;

    public NichtVorhandenExeption(String id) {
   this.id = id;
    }
    public String getMessage() {
        return id + "nicht vorhanden";
    }
}
