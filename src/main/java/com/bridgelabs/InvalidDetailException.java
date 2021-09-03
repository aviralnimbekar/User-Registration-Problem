package com.bridgelabs;

public class InvalidDetailException extends RuntimeException {

    enum ExceptionType {
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL_ID,
        INVALID_MOBILE_NUMBER, INVALID_PASSWORD
    }

    ExceptionType type;

    public InvalidDetailException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
