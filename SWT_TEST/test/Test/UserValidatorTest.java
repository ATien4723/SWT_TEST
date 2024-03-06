/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import org.junit.Test;
import static org.junit.Assert.*;


public class UserValidatorTest {
    

    public UserValidatorTest() {
        
    }
    

   @Test
   public void testValidUsername() {
        assertTrue(UserValidator.isValidUsername("tien123"));
    }

    @Test public void testInvalidUsernameWithSpecialCharacter() {
        assertTrue(UserValidator.isValidUsername("tien@123"));
    }

    @Test public void testInvalidUsernameTooShort() {
        assertFalse(UserValidator.isValidUsername("t"));
    }

    @Test public void testInvalidUsernameTooLong() {
        assertFalse(UserValidator.isValidUsername("tiennnnnnnnnnnnnnnnnnnnnna"));
    }
    
    @Test public void testInvalidUsernameNull() {
        assertFalse(UserValidator.isValidUsername(""));
    }


    @Test public void testValidPassword() {
        assertTrue(UserValidator.isValidPassword("$password1"));
    }

    @Test public void testInvalidPasswordNotStartingWithUpperCase() {
        assertFalse(UserValidator.isValidPassword("password1"));
    }

    @Test public void testInvalidPasswordTooShort() {
        assertFalse(UserValidator.isValidPassword("Pass1"));
    }

    @Test public void testInvalidPasswordTooLong() {
        assertFalse(UserValidator.isValidPassword("Password123456789"));
    }
    
    @Test public void testInvalidPasswordNull() {
        assertFalse(UserValidator.isValidPassword(""));
    }

    @Test public void testValidFirstName() {
        assertTrue(UserValidator.isValidFirstName("tien"));
    }
    
     @Test public void testValidFirstNameSpe() {
        assertTrue(UserValidator.isValidFirstName("tien$12"));
    }

    @Test public void testInvalidFirstNameTooShort() {
        assertFalse(UserValidator.isValidFirstName("anh"));
    }
    
    @Test public void testInvalidFirstNameTooLong() {
        assertFalse(UserValidator.isValidFirstName("tiennnnnnnnn"));
    }

    @Test public void testInvalidFirstNameWithNumber() {
        assertFalse(UserValidator.isValidFirstName("tien3"));
    }

    @Test public void testValidLastName() {
        assertTrue(UserValidator.isValidLastName("tien"));
    }

    @Test public void testInvalidLastNameTooShort() {
        assertFalse(UserValidator.isValidLastName("Do"));
    }

    @Test public void testInvalidLastNameWithNumber() {
        assertFalse(UserValidator.isValidLastName("Doe123"));
    }

    @Test public void testValidTelephone() {
        assertTrue(UserValidator.isValidTelephone("0123456789"));
    }
    
    @Test public void testValidTelephoneSpe() {
        assertTrue(UserValidator.isValidTelephone("0123456789$"));
    }

    @Test public void testValidTelephoneWithElevenDigits() {
        assertTrue(UserValidator.isValidTelephone("12345678901"));
    }

    @Test public void testInvalidTelephoneTooShort() {
        assertFalse(UserValidator.isValidTelephone("123456"));
    }

    @Test public void testInvalidTelephoneTooLong() {
        assertFalse(UserValidator.isValidTelephone("12222222222"));
    }

    @Test public void testInvalidTelephoneWithNonNumericCharacter() {
        assertFalse(UserValidator.isValidTelephone("1234567890a"));
    }

    @Test public void testValidEmail() {
        assertTrue(UserValidator.isValidEmail("tiendz1@gmail.com"));
    }

    @Test public void testInvalidEmailWithoutAtSymbol() {
        assertFalse(UserValidator.isValidEmail("tiendz1"));
    }

    @Test public void testInvalidEmailWithoutDomain() {
        assertFalse(UserValidator.isValidEmail("example@"));
    }

    @Test public void testInvalidEmailWithoutUsernameAndDomain() {
        assertFalse(UserValidator.isValidEmail("example.com"));
    }

    @Test public void testInvalidEmailWithoutDotBetweenDomainAndTLD() {
        assertFalse(UserValidator.isValidEmail("example@examplecom"));
    }

    @Test public void testInvalidEmailWithTooLongDomain() {
        assertFalse(UserValidator.isValidEmail("example@example.comcomcom"));
    }

    @Test
    public void testIsValidUsername() {
    }

    @Test
    public void testIsValidPassword() {
    }

    @Test
    public void testIsValidFirstName() {
    }

    @Test
    public void testIsValidLastName() {
    }

    @Test
    public void testIsValidTelephone() {
    }

    @Test
    public void testIsValidEmail() {
    }
}
    
    

