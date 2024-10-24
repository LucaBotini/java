package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.somaDoisNumeros(10,10);
        calculator.subtraiDoisNumeros(10,5);
        calculator.multiplicaDoisNumeros(10,2);
        System.out.println(calculator.divideDoisNumeros(20,2));
    }
}
