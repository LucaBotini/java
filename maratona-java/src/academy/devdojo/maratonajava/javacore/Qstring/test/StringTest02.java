package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Botini";
        String numbers = "012345";
        System.out.println(name.charAt(5));
        System.out.println(name.replace("i", "z"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(3));
        System.out.println(numbers.substring(3,5));
        System.out.println(name.trim());
    }
}
