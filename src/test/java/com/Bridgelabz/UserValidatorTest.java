package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void welcomeMessage_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.welcomeMessage("Welcome to User Registration Problem");
        Assert.assertEquals(true, result);
    }

    @Test
    public void welcomeMessage_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.welcomeMessage("Welcome to Registration Problem");
        Assert.assertEquals(false, result);
    }


}




