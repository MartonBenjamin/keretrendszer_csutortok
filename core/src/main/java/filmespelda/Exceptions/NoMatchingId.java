package filmespelda.Exceptions;

public class NoMatchingId extends Exception {
    public NoMatchingId(){
        super();
    }

    public NoMatchingId(String message) {
        super(message);
    }
}
