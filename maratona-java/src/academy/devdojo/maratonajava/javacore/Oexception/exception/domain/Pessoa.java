package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Pessoa {

    public void save() throws LoginIncorretException, FileNotFoundException {
        System.out.println("Saving person");
    }
}
