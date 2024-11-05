package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateImpost() {
        System.out.println("Calculating impost of computer");
        return this.value * IMPOSTO_POR_CENTO;
    }

}
