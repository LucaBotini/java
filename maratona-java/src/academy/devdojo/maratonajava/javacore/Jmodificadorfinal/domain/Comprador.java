package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Comprador {
    private String name;

    public Comprador(String name) {
        this.name = name;
    }
    public Comprador() {
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
