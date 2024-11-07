package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile() {
        File file = new File("file\\teste.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("File: " + file.getName() + " create: " + isCreate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
