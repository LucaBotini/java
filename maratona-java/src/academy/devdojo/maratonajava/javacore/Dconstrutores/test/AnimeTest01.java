package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive","TV", 12, "Ação", "Konami");
//        Anime anime2 = new Anime("Dragon Ball", "TV", 12, "Luta");
//        Anime anime3 = new Anime();
        anime.imprime();
//        anime2.imprime();
//        anime3.imprime();
    }
}