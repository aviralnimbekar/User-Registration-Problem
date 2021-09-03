package com.bridgelabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateFirstName("Aviral");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenImproper_ShouldReturnInvalidMessageToUser() {
        try {
            new UserRegistration().validateFirstName("Av");
        } catch (InvalidDetailException e) {
            Assertions.assertEquals(InvalidDetailException.ExceptionType.INVALID_FIRST_NAME, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateLastName("Nimbekar");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_WhenImproper_ShouldReturnInvalidMessageToUser() {
        try {
            new UserRegistration().validateLastName("nimbekar");
        } catch (InvalidDetailException e) {
            Assertions.assertEquals(InvalidDetailException.ExceptionType.INVALID_LAST_NAME, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenEmailId_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailId("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailId_WhenImproper_ShouldReturnInvalidMessageToUser() {
        try {
            new UserRegistration().validateEmailId("ab@c.xyz@bl.co.in");
        } catch (InvalidDetailException e) {
            Assertions.assertEquals(InvalidDetailException.ExceptionType.INVALID_EMAIL_ID, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenMobileNo_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateMobileNo("91 1112223344");
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNo_WhenImproper_ShouldReturnInvalidMessageToUser() {
        try {
            new UserRegistration().validateMobileNo("813311477779");
        } catch (InvalidDetailException e) {
            Assertions.assertEquals(InvalidDetailException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenPassword_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validatePassword("@hoWaRe8you");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenImproper_ShouldReturnInvalidMessageToUser() {
        try {
            new UserRegistration().validatePassword("12345678");
        } catch (InvalidDetailException e) {
            Assertions.assertEquals(InvalidDetailException.ExceptionType.INVALID_PASSWORD, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenDetails_WhenProper_ShouldReturnHAPPY() {
        UserRegistration validator = new UserRegistration();
        String result = validator.validatedUserRegistration("Aviral", "Nimbekar", "abc@gmail.co",
                "91 9988776610", "@how6AreYou");
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    void givenDetails_WhenImproper_ShouldReturnSAD() {
        UserRegistration validator = new UserRegistration();
        try {
            validator.validatedUserRegistration("Av", "Nimbekar", "abc@gmail.co",
                    "91 9988776610", "@how6AreYou");
        } catch (InvalidDetailException e) {
            System.out.println("Detail INVALID !!!");
        }
    }
}
