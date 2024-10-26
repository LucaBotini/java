package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Professor {
    private String name;
    private School school;

    public Professor(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Name of teacher: "+this.name);
        if(school == null)return;
        System.out.println("Name of school: "+school.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
