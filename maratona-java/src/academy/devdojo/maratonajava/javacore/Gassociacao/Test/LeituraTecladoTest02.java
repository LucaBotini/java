package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The big software of forecast of future");
        System.out.println("Type your quest and i will answer yes or no");
        String quest = input.nextLine();
        if(quest.charAt(0) == ' '){
            System.out.println("YES!");
        }else{
            System.out.println("NO!");
        }
    }
}
