package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("i7", 4000.0);
        Tomate tomate = new Tomate("Tomate", 20.0);
        tomate.setExpirationData("04/12/24");
        Televisao tv = new Televisao("SmartTV", 3000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----");
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("----");
    }
}
