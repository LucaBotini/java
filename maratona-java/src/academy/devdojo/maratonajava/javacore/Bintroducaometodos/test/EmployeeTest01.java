package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.EmployeePrint;

public class EmployeeTest01 {
    public static void main(String[] args) {
        EmployeePrint employeePrint = new EmployeePrint();
        employeePrint.setNameEmployee("Luca Botini");
        employeePrint.setAgeEmployee(20);
        employeePrint.setSalaryEmployee(new double[]{1950.43, 3200.75, 2400.65});

        employeePrint.printEmployee(employeePrint);
        employeePrint.averageSalary();

    }


}
