package academy.devdojo.maratonajava.javacore.Gassociacao.exSeminario.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exSeminario.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exSeminario.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exSeminario.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exSeminario.domain.Seminario;

public class ExSeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("School");
        Professor professor = new Professor("Carlos Roberto", "Tecnologia da Informação.");
        Seminario seminario = new Seminario("Associação Java BackEnd.");
        Seminario seminar2 = new Seminario("React FrontEnd.");
        Seminario[] seminars = {seminario, seminar2};
        Aluno aluno = new Aluno("Luca Botini", 20);
        Aluno aluno2 = new Aluno("Michele da Silva Martins", 21);
        Aluno[] studentsJava = {aluno};
        Aluno[] studentsReact = {aluno2};
//
        System.out.println("--Inf. Seminar Java: -- ");
        seminario.setAddress(local.getAddress());
        seminario.setStudents(studentsJava);
        seminario.print();
        System.out.println();
//
        System.out.println("--Inf. Seminar React: -- ");
        seminar2.setAddress(local.getAddress());
        seminar2.setStudents(studentsReact);
        seminar2.print();
        System.out.println();
//
        System.out.println("--Inf. Professor: -- ");
        professor.setSeminars(seminars);
        professor.print();
        System.out.println();
//
        System.out.println("--Inf. Student 1: -- ");
        aluno.setSeminar(seminario.getTitle());
        aluno.print();
        System.out.println();
//
        System.out.println("--Inf. Student 2: -- ");
        aluno2.setSeminar(seminar2.getTitle());
        aluno2.print();
        System.out.println();
    }
}
