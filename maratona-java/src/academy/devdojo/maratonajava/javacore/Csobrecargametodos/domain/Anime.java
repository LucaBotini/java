package academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int ep;
    private String genero;

    public Anime(){

    }
    public void init(String nome, String tipo, int ep){
        this.nome = nome;
        this.tipo = tipo;
        this.ep = ep;

    }
    public void init(String nome, String tipo, int ep, String genero){
        this.init(nome, tipo, ep);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.ep);
        System.out.println(this.genero);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setEp(int ep){
        this.ep = ep;
    }
    public int getEp(){
        return this.ep;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
