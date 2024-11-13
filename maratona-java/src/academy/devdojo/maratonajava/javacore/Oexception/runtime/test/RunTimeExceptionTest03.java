package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        openconnection();
    }

    private static String openconnection() {
        try{
            System.out.println("Opening file");
            System.out.println("Typing data on file");
            return "Connection Open";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("closed resources released from SO");
        }
        return null;
    }
    private static void openconnection2() {
        try{
            System.out.println("Opening file");
            System.out.println("Typing data on file");
            throw new RuntimeException();
        }finally {
            System.out.println("closed resources released from SO");
        }
    }
}
