package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
        estudante01.name = "Karina";
        estudante01.age = 39;
        estudante01.sex = 'F';

        estudante02.name = "Jair";
        estudante02.age = 40;
        estudante02.sex = 'M';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
    }
}
