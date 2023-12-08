

public class WeaponException extends Exception {
    public static final String MESSAGE_NOT_DEFINED = "I refuse to fight with my bare hands.";
    public static final String MESSAGE_EMPTY_STRING = "Attack method called with an empty string.";
    public static final String MESSAGE_INAPPROPRIATE_WARRIOR = "A [weapon]?? What should I do with this?!";
    public static final String MESSAGE_INAPPROPRIATE_MAGE = "I don't need this stupid [weapon]! Don't misjudge my powers!";

    public WeaponException(String message) {
        super(message);
    }
    
    public WeaponException(String message, Throwable cause) {
        super(message, cause);
    }
}
