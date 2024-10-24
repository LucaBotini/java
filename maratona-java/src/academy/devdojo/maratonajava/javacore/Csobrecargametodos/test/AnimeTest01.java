package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime2.init("Dragon Ball", "TV", 12, "Luta");
        anime.imprime();
        anime2.imprime();
    }
}