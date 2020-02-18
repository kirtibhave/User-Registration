package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void welcomeMessage_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean message = validator.welcomeMessage("Welcome to User Registration Problem");
        Assert.assertEquals(true, message);
    }

    @Test
    public void welcomeMessage_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean message = validator.welcomeMessage("Welcome to Registration Problem");
        Assert.assertEquals(false,message);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean userFirstName= validator.validateFirstName("Kirti");
        Assert.assertEquals(true,userFirstName);

    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean userFirstName=validator.validateFirstName("Ky67h");
        Assert.assertEquals(false,userFirstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean userLastName=validator.validateLastName("Bhave");
        Assert.assertEquals(true,userLastName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean userLastName=validator.validateLastName("bhave12");
        Assert.assertEquals(false,userLastName);
    }

}

