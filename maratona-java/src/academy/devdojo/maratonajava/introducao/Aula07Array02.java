package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        String [] names = new String[3];
        names[0] = "Botini";
        names[1] = "Martins";
        names[2] = "Silva";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
