package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    public  abstract void calculateBonus();
}
