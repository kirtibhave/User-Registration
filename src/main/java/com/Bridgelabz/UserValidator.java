package com.Bridgelabz;

public class UserValidator {
    String nameRule = "(^[A-Z]{1}[a-z]{2,})$";
    String emailRule="^[a-zA-Z]{3,}([+|-|.|_]?[a-zA-Z0-9]+)?[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]+)?$";
    String mobileRule="^[0-9]{2}[ ][0-9]{10}$";
    String passwordMinimumCharacterRule="^[a-zA-Z]{8,}";
    public boolean welcomeMessage(String message){
        return message.contains("User");
    }
    public boolean validateFirstName(String firstName) {
        return firstName.matches(nameRule);
    }

    public boolean validateLastName(String lastName) {
        return lastName.matches(nameRule);
    }

    public boolean validateEmail(String email) {
        return email.matches(emailRule);
    }

    public boolean validateMobileFormat(String mobile) {
        return mobile.matches(mobileRule);
    }

    public boolean validatePasswordMinimumCharacter(String password) {
        return password.matches(passwordMinimumCharacterRule);
    }
}



