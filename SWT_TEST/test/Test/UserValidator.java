/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author ADMIN
 */
import Test.*;
import java.util.regex.*;

public class UserValidator {
    public static boolean isValidUsername(String username) {
        return username.matches("[a-zA-Z0-9!@#$%^&*()\\-+=_]{1,20}");
    }

    public static boolean isValidPassword(String password) {
         return password.matches("(?=.*[!@#$%^&*()])(?=.*[a-zA-Z0-9]).{5,15}");
    }

    public static boolean isValidFirstName(String firstName) {
        return firstName.matches("[a-zA-Z]{4,10}");
    }

    public static boolean isValidLastName(String lastName) {
        return lastName.matches("[a-zA-Z]{4,10}");
    }

    public static boolean isValidTelephone(String telephone) {
        return telephone.matches("[0-9]{10}");
    }

    public static boolean isValidEmail(String email) {
        return email.matches(".+@.+\\..+") && email.length() >= 8 && email.length() <= 20;
    }
}