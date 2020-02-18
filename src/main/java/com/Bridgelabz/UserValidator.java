package com.Bridgelabz;

public class UserValidator {

    public boolean welcomeMessage(String message) {
        if (message.contains("User"))
            return true;
        else
            return false;
    }

    String nameRule = "(^[A-Z]{1}[a-z]{2,})$";
    public boolean validateFirstName(String firstName) {
        if (firstName.matches(nameRule))
            return true;
        else
            return false;
    }
}