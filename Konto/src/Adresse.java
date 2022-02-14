public class Adresse {

        private String strasse;
        private String hausNr;
        private String plz;
        private String ort;

    public Adresse(String strasse, String hausNr, String plz, String ort) {
        this.strasse = strasse;
        this.hausNr = hausNr;
        this.plz = plz;
        this.ort = ort;
    }

        public String getStrasse () {
        return strasse;
    }

        public String getHausNr () {
        return hausNr;
    }

        public void setHausNr (String hausNr){
        hausNr = hausNr;
    }

        public String getOrt () {
        return ort;
    }

        public void setOrt (String ort){
        this.ort = ort;
    }

        public String getPlz () {
        return plz;
    }

        public void setPlz (String plz){
        this.plz = plz;
    }

        @Override
        public String toString () {
            String text = "Straße: " + strasse;
            text = text + "\n\t" + ", Hausnummer:" + " " + hausNr;
            text = text + "\n\t" + ", Postleittzahl:" + " " + plz;
            text = text + "\n\t" + ", Ort:" + " " + ort;
            return text;
    }
    }
