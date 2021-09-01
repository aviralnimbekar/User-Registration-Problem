package com.bridgelabs;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String FIRST_NAME_PATTERN = "[A-Z][a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "[A-Z][a-z]{2,}";
    private static final String EMAIL_ID_PATTERN = "[a-zA-Z0-9]+[.][a-zA-Z0-9]*[@][b][l][.][c][o][.][in]*";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateEmailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
        return pattern.matcher(emailId).matches();
    }
}
