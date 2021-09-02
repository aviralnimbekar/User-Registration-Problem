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
    void givenLastName_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateLastName("Nimbekar");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmailId_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailId("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    void givenMobileNo_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateMobileNo("91 1112223344");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenProper_ShouldReturnTure() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validatePassword("how5ArEyou");
        Assertions.assertTrue(result);
    }
}
