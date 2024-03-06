/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Test.*;

/**
 *
 * @author ADMIN
 */
public class Login {

    public static String login(String username, String password) {
        if (username == null || password == null) {
            return "Đăng nhập không thành công";
        }

        if (username.length() < 1 || username.length() > 20 || password.length() < 6 || password.length() > 15) {
            return "Đăng nhập không thành công";
        }

        if (!password.matches(".*[$&+,:;=?@#|'<>.^*()%!-].*")) {
            return "Đăng nhập không thành công";
        }

        return "Đăng nhập thành công";
    }
}

