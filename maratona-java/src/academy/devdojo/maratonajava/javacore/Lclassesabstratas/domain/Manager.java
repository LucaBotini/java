package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Manager extends Employee{

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.2;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
