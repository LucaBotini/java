package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;
import java.util.Arrays;

public class EmployeePrint {
    private String nameEmployee;
    private int ageEmployee;
    private double[] salaryEmployee;
    private double sumValues;

    public void printEmployee(EmployeePrint employeePrint){
        System.out.println("Name employee: "+this.nameEmployee);
        System.out.println("Age employee: "+this.ageEmployee);
        System.out.println("3 months salary: "+Arrays.toString(this.salaryEmployee));
    }

    public void averageSalary(){
        for(int i = 0; i < salaryEmployee.length; i++){
            sumValues = sumValues + salaryEmployee[i];
        }
        System.out.println("Return of average: "+sumValues / salaryEmployee.length);
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public double[] getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double[] salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public double getSumValues() {
        return sumValues;
    }
}
