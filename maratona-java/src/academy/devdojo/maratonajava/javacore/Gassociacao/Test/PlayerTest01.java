package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Neymar");
        Player player2 = new Player("Cristiano Ronaldo");
        Player player3 = new Player("Lionel Messi");
        Player[] players = {player1, player2, player3};
        for (Player player : players){
            player.print();
        }
    }
}
