package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Development;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Jair Botini", 5000);
        Development development = new Development("Luca Botini", 12000);
        System.out.println(manager);
        System.out.println(development);
    }
}
