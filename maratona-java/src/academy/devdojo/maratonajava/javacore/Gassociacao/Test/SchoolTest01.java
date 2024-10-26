package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Mauro");
        Professor professor2 = new Professor("Kaka");
        Professor professor3 = new Professor("Zé morango");
        Professor[] professors = {professor, professor2, professor3};
        School school = new School("Odete", professors);

        school.print();
    }
}
