package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("The Flash");
        anime.imprime();
        for (int i : anime.getEp()) {
            System.out.println(i + " ");
        }


    }
}
