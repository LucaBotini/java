package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Michele";
        estudante.age = 21;
        estudante.sex = 'F';

        System.out.println("name: "+estudante.name);
        System.out.println("age: "+estudante.age);
        System.out.println("sex: "+ estudante.sex);
    }
}
