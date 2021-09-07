package com.bridgelabs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {

    private String emailId;
    private boolean expectedResult;
    private UserRegistration userRegistration;

    public EmailValidationTest(String emailId, boolean expectedResult) {
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection diffEmails() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true}, {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true}, {"abc111@abc.com", true}, {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
                {"abc+100@gmail..com", true}});
    }

    @Test
    public void givenEmailAsVar_ShouldReturnAsPerParameterizedResult() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validateEmailId(this.emailId);
        Assert.assertEquals(this.expectedResult, result);
    }
}