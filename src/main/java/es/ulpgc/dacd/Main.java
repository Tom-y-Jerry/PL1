package es.ulpgc.dacd;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Suma: " + calc.calculate(Operation.ADD, 5, 3));
        System.out.println("Resta: " + calc.calculate(Operation.SUBTRACT, 10, 4));
        System.out.println("Multiplicación: " + calc.calculate(Operation.MULTIPLY, 6, 2));
        System.out.println("División: " + calc.calculate(Operation.DIVIDE, 9, 3));
    }
}
