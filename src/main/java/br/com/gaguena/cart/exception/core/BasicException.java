package br.com.gaguena.cart.exception.core;

public class BasicException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BasicException() {
    }

    public BasicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BasicException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasicException(String message) {
        super(message);
    }

    public BasicException(Throwable cause) {
        super(cause);
    }

}
