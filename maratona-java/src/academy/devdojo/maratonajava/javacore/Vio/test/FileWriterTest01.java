package academy.devdojo.maratonajava.javacore.Vio.test;

// File - File
// FileWritter - Escrita
// FileReader - Leitura
// BufferedWriter - Escrita Buffada
// BufferedReader - Leitura Buffada

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("mensagem de texto ");
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();        }
    }
}












