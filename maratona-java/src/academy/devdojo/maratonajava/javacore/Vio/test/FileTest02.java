package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("foulder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Directory create? " + isDirectoryCreated);
        File fileArchiveDirectory = new File(fileDirectory, "archive.txt");
        boolean isFileCreated = fileArchiveDirectory.createNewFile();
        System.out.println("Archive created? " + isFileCreated);
        File fileRenamed = new File(fileDirectory, "archive_renamed2.txt");
        boolean isRenamed = fileArchiveDirectory.renameTo((fileRenamed));
        System.out.println("Archive: " + fileArchiveDirectory + " renamed? " + isRenamed);
        File foulderRename = new File("foulder2");
        boolean foulderRenamed = fileDirectory.renameTo(foulderRename);
        System.out.println("Foulder: " + fileDirectory + " renamed? " + foulderRenamed);
    }
}
