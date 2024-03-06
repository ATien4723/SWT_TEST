/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    
    public LoginTest() {
    }
    
    @Test
    public void testValidCredentials() {
        assertEquals("Đăng nhập thành công", Login.login("tien1", "t@iendz1"));
    }
    
    @Test
    public void testNullUsername() {
        assertEquals("Đăng nhập không thành công", Login.login(null, "s1"));
    }
    
    @Test
    public void testNullPassword() {
        assertEquals("Đăng nhập không thành công", Login.login("tien1", null));
    }
    
    @Test
    public void testMinLengthUsername() {
        assertEquals("Đăng nhập thành công", Login.login("a", "t@iendz1"));
    }
    
    @Test
    public void testMaxLengthUsername() {
        String longUsername = "aaaaaaaaaaaaaaaaaaaa"; // Username có 20 ký tự
        assertEquals("Đăng nhập thành công", Login.login(longUsername, "t@iendz1"));
    }
    
      @Test
    public void testMaxLengthUsername21() {
        String longUsername = "aaaaaaaaaaaaaaaaaaaa1"; // Username có 21 ký tự
        assertEquals("Đăng nhập không thành công", Login.login(longUsername, "t@iendz1"));
    }
    
    @Test
    public void testMinLengthPassword() {
        assertEquals("Đăng nhập thành công", Login.login("tien1", "12@23"));
    }
    
    @Test
    public void testMaxLengthPassword() {
        String longPassword = "123456@78901234"; 
        assertEquals("Đăng nhập thành công", Login.login("tien1", longPassword));
    }
    
    @Test
    public void testNoSpecialCharacterPassword() { 
        assertEquals("Đăng nhập không thành công", Login.login("user1", "123456789"));
    }
    
    @Test
    public void testInvalidPasswordLengthForUsernameLength5() {
        assertEquals("Đăng nhập không thành công", Login.login("a", "12345"));
    }
    
     @Test
    public void testInvalidPasswordLengthForUsernameLength6() {
        assertEquals("Đăng nhập thành công", Login.login("tien1", "12345$")); //6ky tu pass
    }
    
    @Test
    public void testLogin() {
    }
}



