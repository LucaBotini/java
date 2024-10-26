package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] ep;

    static {
        System.out.println("Dentro do bloco de inicialização");
        ep = new int[186];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int eps : Anime.ep) {
            System.out.print(eps + " ");
        }
        System.out.println();
    }

    public void imprime() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public int[] getEp() {
        return ep;
    }
}
