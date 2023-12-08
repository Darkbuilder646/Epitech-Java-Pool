public class NoSuchFoodException extends Exception{
    public static final String MESSAGE_WRONG_FOOD_TYPE = "No such food type: [class name]";

    public NoSuchFoodException(String message) {
        super(message);
    }

    public NoSuchFoodException(String message, Throwable cause) {
        super(message, cause);
    }
}
