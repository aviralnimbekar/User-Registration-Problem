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
}
