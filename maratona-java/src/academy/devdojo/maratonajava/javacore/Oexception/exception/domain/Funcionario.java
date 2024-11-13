package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void save() throws LoginIncorretException, FileNotFoundException{
        System.out.println("Saving person");
    }
}
