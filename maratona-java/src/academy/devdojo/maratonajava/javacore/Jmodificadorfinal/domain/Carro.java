package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String name;
    public static final double SPEED_MAX = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
}
