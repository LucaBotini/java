package academy.devdojo.maratonajava.javacore.Gassociacao.exSeminario.domain;

public class Professor {
    private String nameProfessor;
    private String speciality;
    private Seminario[] seminars;

    public Professor(String nameProfessor, String speciality) {
        this.nameProfessor = nameProfessor;
        this.speciality = speciality;
    }

    public void print(){
        System.out.println("Name Professor: "+nameProfessor);
        System.out.println("Speciality of Professor: "+speciality);
        if(seminars == null || seminars.length == 0){
            return;
        }
        int c = 1;
        for (Seminario seminar : seminars) {
            System.out.println("Seminar "+c+" of professor: "+seminar.getTitle());
            c++;
        }

    }

    public Seminario[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminario[] seminars) {
        this.seminars = seminars;
    }

    public String getNameProfessor() {
        return nameProfessor;
    }

    public void setNameProfessor(String nameProfessor) {
        this.nameProfessor = nameProfessor;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
