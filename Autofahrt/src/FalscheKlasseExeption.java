public class FalscheKlasseExeption extends Exception {
    private String action;
    public FalscheKlasseExeption( String action) {
        this.action = action;
    }
    public String getMessage() {
        return action + "kann nicht ausgeführt werden du hast nicht die richtige Fahrzeugklasse";
    }
}
