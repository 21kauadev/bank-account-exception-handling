package model.exceptions;

public class NotEnoughBalanceException extends Exception {

    public NotEnoughBalanceException(String msg) {
        super(msg);
    }
}
