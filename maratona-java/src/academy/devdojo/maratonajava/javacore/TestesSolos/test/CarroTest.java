package academy.devdojo.maratonajava.javacore.TestesSolos.test;

import academy.devdojo.maratonajava.javacore.TestesSolos.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", "Honda", 2006);
        carro.imprime();
    }
}