package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.name = "Civic";
        carro.model = "Honda";
        carro.year = 2006;

        carro2.name = "Evoque";
        carro2.model = "Range Rover";
        carro2.year = 2020;

        System.out.println("Name: " + carro.name + "\n" + "Model: " + carro.model + "\n" + "Year: " + carro.year);

        System.out.println("Name: " + carro2.name + "\n" + "Model: " + carro2.model + "\n" + "Year: " + carro2.year);
    }
}
