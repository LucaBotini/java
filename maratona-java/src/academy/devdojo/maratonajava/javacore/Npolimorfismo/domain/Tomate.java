package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String expirationData;

    public Tomate(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateImpost() {
        System.out.println("Calculating impost of tomate");
        return this.value * IMPOSTO_POR_CENTO;
    }

    public String getExpirationData() {
        return expirationData;
    }

    public void setExpirationData(String expirationData) {
        this.expirationData = expirationData;
    }
}
