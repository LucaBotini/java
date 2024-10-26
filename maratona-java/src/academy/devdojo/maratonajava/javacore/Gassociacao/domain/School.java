package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class School {
    private String name;
    private Professor[] professors;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public void print(){
        System.out.println("Name School: "+this.name);
        if(professors == null) return;
        for (Professor professor : professors) {
            System.out.println("Name Professor: "+professor.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
