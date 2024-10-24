package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] ep;
    {
        ep = new int[186];
        for (int i = 0; i < ep.length; i++) {
            ep[i] = i+1;
        }
    }

    public Anime(String name){
        this.name = name;
    }

    public void imprime(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public int[] getEp() {
        return ep;
    }
}
