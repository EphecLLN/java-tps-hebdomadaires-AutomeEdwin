package tp7bis.School;

public class DateArriveInvalideException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 8794769094931089817L;

    public DateArriveInvalideException() {
        super();
    }

    public DateArriveInvalideException(String msg){
        super(msg);
    }
}
