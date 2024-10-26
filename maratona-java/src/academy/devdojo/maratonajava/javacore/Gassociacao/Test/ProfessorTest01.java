package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.School;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Luca");
        School school = new School("Odete");
        professor.setSchool(school);

        professor.print();

    }
}
