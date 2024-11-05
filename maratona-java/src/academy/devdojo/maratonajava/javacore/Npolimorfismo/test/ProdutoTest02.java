package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getName());
        System.out.println(produto.getValue());
        System.out.println(produto.calculateImpost());
        System.out.println("----");
        Produto produto2 = new Tomate("Tomate2", 3);
        System.out.println(produto2.getName());
        System.out.println(produto2.getValue());
        System.out.println(produto2.calculateImpost());
        System.out.println("----");
    }
}
