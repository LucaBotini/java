package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setName("Kiririr");
        System.out.println(carro.COMPRADOR);
    }
}
