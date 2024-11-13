package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

public class LoginIncorretException extends Exception{
    public LoginIncorretException() {
        super("Login Incorret");
    }

    public LoginIncorretException(String message) {
        super(message);
    }
}
