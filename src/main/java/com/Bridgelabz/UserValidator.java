package com.Bridgelabz;

public class UserValidator {

    public boolean welcomeMessage(String message) {
        if (message.contains("User")) {
            return true;
        }
            return false;
    }

}
