package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    private static int divisao(int a, int b) {
        if (b == 0 || a == 0) {
            throw new IllegalArgumentException("Argumento Ilegal. Não pode ser 0");
        }
        try {
            return a / b;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return a / b;
    }
}
