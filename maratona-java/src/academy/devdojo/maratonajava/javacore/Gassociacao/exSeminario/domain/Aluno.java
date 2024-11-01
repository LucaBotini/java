package academy.devdojo.maratonajava.javacore.Gassociacao.exSeminario.domain;

public class Aluno {
    private String name;
    private int age;
    private String seminar;

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Student: " + this.name);
        System.out.println("Age: " + this.age);
        if (seminar == null) return;
        System.out.println("Title seminar: " + this.seminar);
    }

    public String getSeminar() {
        return seminar;
    }

    public void setSeminar(String seminar) {
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
