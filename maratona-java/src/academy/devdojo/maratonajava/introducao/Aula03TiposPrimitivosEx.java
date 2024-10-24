package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie Variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosEx {
    public static void main(String[] args) {
        String name = "Luca Botini";
        String address = "São Paulo";
        double wage = 2300.13;
        String dateWage = "05/10/2024";
        String report = "Eu, " + name + ", morando no endereço: " + address + ". Confirmo que recebi o salário de: R$" + wage + " na data: " + dateWage + ".";
        System.out.println(report);
    }
}
