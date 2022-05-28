package model;

public class InvalidParameter extends RuntimeException {
    public InvalidParameter(String msg) {
        super(msg);
    }
}
