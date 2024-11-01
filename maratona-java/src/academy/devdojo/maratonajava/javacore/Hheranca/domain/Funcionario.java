package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String name){
        super(name);
    }

    public void print(){
        super.print();
        System.out.println(this.salario);
    }

    public void reportPayment(){
        System.out.println("Eu: "+this.name+" recebi o sálario de: "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
