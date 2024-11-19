package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long init = System.currentTimeMillis();
        concatString(100_000);
        long end = System.currentTimeMillis();
        System.out.println("time of execute: " + (end - init) + "ms");

        init = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("time of execute StringBuilder: " + (end - init) + "ms");

        init = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("time of execute StringBuffer: " + (end - init) + "ms");
    }

    private static void concatString(int size){
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size){
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size){
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

}
