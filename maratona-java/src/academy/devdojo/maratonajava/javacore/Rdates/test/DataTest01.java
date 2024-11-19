package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L); //long with ms
        System.out.println(date.getTime());
    }
}
