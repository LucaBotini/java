package academy.devdojo.maratonajava.javacore.AATestesSolos.test;

import academy.devdojo.maratonajava.javacore.AATestesSolos.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", "Honda", 2006);
        carro.imprime();
    }
}