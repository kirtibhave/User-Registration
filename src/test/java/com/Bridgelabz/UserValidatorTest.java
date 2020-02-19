package com.Bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    UserValidator validator = new UserValidator();

    @Test
    public void welcomeMessage_WhenProper_ShouldReturnTrue() {
        boolean message = validator.welcomeMessage("Welcome to User Registration Problem");
        Assert.assertEquals(true, message);
    }

    @Test
    public void welcomeMessage_WhenNotProper_ShouldReturnFalse() {
        boolean message = validator.welcomeMessage("Welcome to Registration Problem");
        Assert.assertEquals(false, message);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean userFirstName = validator.validateFirstName("Kirti");
        Assert.assertEquals(true, userFirstName);

    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean userFirstName = validator.validateFirstName("Ky67h");
        Assert.assertEquals(false, userFirstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean userLastName = validator.validateLastName("Bhave");
        Assert.assertEquals(true, userLastName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean userLastName = validator.validateLastName("bhave12");
        Assert.assertEquals(false, userLastName);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean userEmail = validator.validateEmail("abc.xyz@bI.co.in");
        Assert.assertEquals(true, userEmail);
    }

    @Test
    public void givenEmail_WhenNotproper_ShouldReturnFalse() {
        boolean userEmail = validator.validateEmail("abc@.com.my");
        Assert.assertEquals(false, userEmail);

    }

    @Test
    public void givenMobileFormat_WhenProper_ShouldReturnTrue() {
        boolean userMobile = validator.validateMobileFormat("91 9919819801");
        Assert.assertEquals(true, userMobile);
    }

    @Test
    public void givenMobileFormat_WhenNotProper_ShouldReturnFalse() {
        boolean userMobile = validator.validateMobileFormat("8996572920");
        Assert.assertEquals(false, userMobile);
    }

    @Test
    public void givenPasswordFormat_WhenProper_ShouldReturnTrue() {
        boolean userPassword1 = validator.validatePasswordMinimumCharacter("asdfghjq");
        Assert.assertEquals(true, userPassword1);
    }

    @Test
    public void givenPasswordFormat_WhenNotProper_ShouldReturnFalse() {
        boolean userpassword1 = validator.validatePasswordMinimumCharacter("dgfds");
        Assert.assertEquals(false, userpassword1);
    }


    @Test
    public void givenPasswordFormat_WhenSatisfiesRule2_ShouldReturnTrue() {
        boolean userPassword2=validator.validatePasswordRule2("asyuJfghj");
        Assert.assertEquals(true,userPassword2);
    }

    @Test
    public void givenPasswordFormat_WhenNotSatisfiesRule2_ShouldReturnFalse() {
        boolean userPassword2 = validator.validatePasswordRule2("asdfgtf");
        Assert.assertEquals(false,userPassword2);
    }


}