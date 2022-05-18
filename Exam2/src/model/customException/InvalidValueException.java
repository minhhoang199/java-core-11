package model.customException;

public class InvalidValueException extends RuntimeException {
    public InvalidValueException(String msg) {
        super(msg);
    }
}


