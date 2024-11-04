package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Development extends Employee{

    public Development(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Development{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
