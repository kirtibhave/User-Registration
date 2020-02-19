package com.Bridgelabz;

public class UserValidator {
    String nameRule = "(^[A-Z]{1}[a-z]{2,})$";
    String emailRule = "^[a-zA-Z]{3,}([+|-|.|_]?[a-zA-Z0-9]+)?[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]+)?$";
    String mobileRule = "^[0-9]{2}[ ][0-9]{10}$";
    String passwordMinimumCharacterRule = "^[a-zA-Z]{8,}";
    String passwordUpperCaseRule = "^(?=.*[A-Z])[A-Za-z]{8,}$";
    String passwordNumericNumberRule = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{8,}$";

    public boolean welcomeMessage(String message) {
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

    public boolean passwordRule1(String password) {
        return password.matches(passwordMinimumCharacterRule);
    }

    public boolean passwordRule2(String password2) {
        return password2.matches(passwordUpperCaseRule);
    }

    public boolean passwordRule3(String password3) {
        return password3.matches(passwordNumericNumberRule);
    }

}

