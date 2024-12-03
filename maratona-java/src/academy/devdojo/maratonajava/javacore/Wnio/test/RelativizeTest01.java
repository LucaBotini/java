package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/btn");
        Path clazz = Paths.get("/home/btn/devdojo/hello-world.Java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/btn");
        Path absolute2 = Paths.get("/user/local");
        Path absolute3 = Paths.get("/home/btn/devdojo/hello-world.Java");
        Path relativize1 = Paths.get("temp");
        Path relativize2 = Paths.get("temp/temp.202323");
        System.out.println("1 " + absolute1.relativize(absolute3));
        System.out.println("2 " + absolute3.relativize(absolute1));
        System.out.println("3 " + absolute1.relativize(absolute2));
        System.out.println("4 " + relativize1.relativize(relativize2));
        System.out.println("5 " + absolute1.relativize(relativize1)); //error

    }
}
