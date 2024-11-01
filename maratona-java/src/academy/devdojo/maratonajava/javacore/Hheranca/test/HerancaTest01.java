package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("1234123");
        Pessoa pessoa = new Pessoa("João");
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);
        pessoa.print();
        System.out.println("---- funcionario abaixo ----");
        Funcionario funcionario = new Funcionario("Nome do funcionario");
        funcionario.setCpf("12341234");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        funcionario.print();
    }
}
