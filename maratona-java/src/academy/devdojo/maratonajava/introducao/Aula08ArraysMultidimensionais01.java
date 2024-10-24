package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        dias[0][0] = 0;
        dias[0][1] = 1;
        dias[0][2] = 2;
        dias[1][0] = 3;
        dias[1][1] = 4;
        dias[1][2] = 5;
        dias[2][0] = 6;
        dias[2][1] = 7;
        dias[2][2] = 8;
        //  <int i> se refere ao primeiro array dias[i]
        //  <int j> se refere ao segundo array dias[][j]
        // para dar valor a elas, elas sempre passa pela quantidade que foi descrita, nesse caso (3). Então a leitura
        //está sendo dias[0][0], dias[0][1], dias[0][2] e assim seguindo. São três blocos mas como começa do 0, acaba 2.

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("outro aqui em baixo");
        for(int[] arrBase:dias){
            for(int num:arrBase){
                System.out.println(num);
            }
        }

    }
}
