package Factory;

public class NoSuchToyException extends IllegalArgumentException {

    public static final String MESSAGE_TOY_EXCEPTION = "No such toy: [toy name].";

    public NoSuchToyException(String message) {
        super(message);
    }

    public NoSuchToyException(String message, Throwable cause) {
        super(message, cause);
    }
}
