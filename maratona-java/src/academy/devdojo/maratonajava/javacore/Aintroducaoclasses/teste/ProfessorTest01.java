package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Sogro";
        professor.age = 41;
        professor.sex = 'M';

        System.out.println(professor.name + "\n" + professor.age + "\n" + professor.sex);
    }
}
