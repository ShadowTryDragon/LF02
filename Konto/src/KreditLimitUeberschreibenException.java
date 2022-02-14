public class KreditLimitUeberschreibenException extends Exception{

    public KreditLimitUeberschreibenException(String action) {

    }

        private String action;

    public  KreditLimitUeberschreibenException (){
            this.action = action;

        }
        public String getMessage()
        {
            return action + " wurde Nicht ausgeführt, Kreditlimit wurde erreicht ";
        }
    }
