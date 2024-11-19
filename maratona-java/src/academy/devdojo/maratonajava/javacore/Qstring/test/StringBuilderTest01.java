package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Luca";
        name.concat(" Botini");
        System.out.println(name);


        StringBuilder sb = new StringBuilder("Luca Botini");
        sb.append(" Academy");
        System.out.println(sb);
    }
}
