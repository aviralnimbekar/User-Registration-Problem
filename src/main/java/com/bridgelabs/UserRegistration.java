package com.bridgelabs;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String EMAIL_ID_PATTERN = "[a-zA-Z0-9]+[-.+]?[a-z0-9]*@[a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,3}";
    private static final String MOBILE_NUMBER_PATTERN = "^91 [1-9][0-9]{9}";
    private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);

        if (!pattern.matcher(firstName).matches())
            throw new InvalidDetailException("First Name INVALID !!!", InvalidDetailException.ExceptionType.INVALID_FIRST_NAME);

        return true;
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);

        if (!pattern.matcher(lastName).matches())
            throw new InvalidDetailException("Last Name INVALID !!!", InvalidDetailException.ExceptionType.INVALID_LAST_NAME);

        return true;
    }

    public boolean validateEmailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
        if (!pattern.matcher(emailId).matches())
            throw new InvalidDetailException("Email ID INVALID !!!", InvalidDetailException.ExceptionType.INVALID_EMAIL_ID);

        return true;
    }

    public boolean validateMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        if (!pattern.matcher(mobileNo).matches())
            throw new InvalidDetailException("Mobile Number INVALID !!!", InvalidDetailException.ExceptionType.INVALID_MOBILE_NUMBER);

        return true;
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        if (!pattern.matcher(password).matches())
            throw new InvalidDetailException("Password INVALID !!!", InvalidDetailException.ExceptionType.INVALID_PASSWORD);

        return true;
    }

    public String validatedUserRegistration(String firstName, String lastName,
                                            String emailId, String mobileNo, String password) {
        if (validateFirstName(firstName) && validateLastName(lastName) &&
                validateEmailId(emailId) && validateMobileNo(mobileNo) && validatePassword(password))
            return "HAPPY";
        return "SAD";
    }
}
