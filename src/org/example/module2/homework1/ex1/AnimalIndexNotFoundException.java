package org.example.module2.homework1.ex1;

public final class AnimalIndexNotFoundException extends Exception {

    public AnimalIndexNotFoundException() {
        super();
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public AnimalIndexNotFoundException(String message, Object... args) {
        super(String.format(message, args));
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public AnimalIndexNotFoundException(Throwable cause, String message, Object... args) {
        super(String.format(message, args), cause);
    }

    public AnimalIndexNotFoundException(Throwable cause) {
        super(cause);
    }
}
