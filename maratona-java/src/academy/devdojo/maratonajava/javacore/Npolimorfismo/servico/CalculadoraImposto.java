package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Report of tax");
        double tax = produto.calculateImpost();
        System.out.println("Product: "+produto.getName());
        System.out.println("Value: "+produto.getValue());
        System.out.println("Value tax: "+tax);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Expiration Date: "+tomate.getExpirationData());
        }
    }
}
