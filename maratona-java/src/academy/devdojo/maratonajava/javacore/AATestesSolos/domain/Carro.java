package academy.devdojo.maratonajava.javacore.AATestesSolos.domain;

public class Carro {
    private String car;
    private String model;
    private int year;
    {
        System.out.println("Sempre que iniciar, vai codar essa parada");
    }


    public Carro(String car, String model, int year){
        this.car = car;
        this.model = model;
        this.year = year;
    }

    public void imprime() {
        System.out.println(this.car);
        System.out.println(this.model);
        System.out.println(this.year);
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
