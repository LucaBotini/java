package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path foulderPath = Paths.get("foulder");
        if (Files.notExists(foulderPath)) {
            Path foulderDirectory = Files.createDirectory(foulderPath);
        }

        Path subFoulderPath = Paths.get("foulder/subFoulder/subFoulder/subFoulder");
        Path foulderDirectory = Files.createDirectories(subFoulderPath);
        Path filePath = Paths.get(subFoulderPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Path filePatchCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get("");

    }
}
