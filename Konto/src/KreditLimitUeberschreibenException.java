public class KreditLimitUeberschreibenException extends Exception{

    private String action;
    public KreditLimitUeberschreibenException(String action) {
    {
            this.action = action;

    }
    }
        public String getMessage()
        {
            return action + " wurde Nicht ausgeführt, Kreditlimit wurde erreicht ";
        }
    }
