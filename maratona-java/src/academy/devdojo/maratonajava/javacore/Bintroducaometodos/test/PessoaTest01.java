package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Luca");
        pessoa.setAge(20);
        pessoa.imprime();
        System.out.println("----");
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
     }

}
