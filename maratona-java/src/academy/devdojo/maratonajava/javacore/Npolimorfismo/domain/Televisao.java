package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Televisao extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.40;
    public Televisao(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateImpost() {
        System.out.println("Calculating impost of TV");
        return this.value * IMPOSTO_POR_CENTO;
    }
}
