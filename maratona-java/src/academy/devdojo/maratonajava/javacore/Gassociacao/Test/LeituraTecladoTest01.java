package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type your name: ");
        String name = input.nextLine();
        System.out.println("type your age: ");
        int age = input.nextInt();
        System.out.println("type (M) or (F) for your sex: ");
        char sex = input.next().charAt(0);
        System.out.println("--------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Sex: "+sex);
    }
}
