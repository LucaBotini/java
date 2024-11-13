package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginIncorretException;

import java.util.Scanner;

public class LoginIncorretExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginIncorretException e) {
            throw new RuntimeException(e);
        }
    }
    private static void login() throws LoginIncorretException {
        Scanner teclado = new Scanner((System.in));
        String usernameDB = "Goku";
        String password = "ssj";
        System.out.println("User");
        String usernameTypeing = teclado.nextLine();
        System.out.println("Password");
        String passwordTypeing = teclado.nextLine();
        if(!usernameDB.equals(usernameTypeing) || !password.equals(passwordTypeing)){
            throw new LoginIncorretException("User or Password invalid");
        }
        System.out.println("Login sucess");
    };
}
