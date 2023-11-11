package ru.etozhealexis.itprojects.exception;

public class PasswordConfirmationException extends IllegalArgumentException {
    public PasswordConfirmationException() {
        super("Passwords don't match");
    }
}
