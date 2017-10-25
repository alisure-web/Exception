package test.spring.exception;

/**
 * Created by ALISURE on 2017/3/26.
 */
public class ALISUREException extends Exception {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public ALISUREException() {
        super("ALISURE-Exception");
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public ALISUREException(String message) {
        super(message);
    }
}
