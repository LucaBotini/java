package academy.devdojo.maratonajava.javacore.Gassociacao.exSeminario.domain;

public class Seminario {
    private String title;
    private Aluno[] students;
    private String address;

    public Seminario(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Seminar Title: " + this.title);
        if (students == null || students.length == 0) return;
        int c = 1;
        for (Aluno aluno : students) {
            System.out.print("Name and age of " + c + "º seminar student: " + aluno.getName() + ", ");
            System.out.print(aluno.getAge());
            System.out.println();
            c++;
        }
        System.out.println("Address of seminar: " + this.address);
    }

    public Aluno[] getStudents() {
        return students;
    }

    public void setStudents(Aluno[] students) {
        this.students = students;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
