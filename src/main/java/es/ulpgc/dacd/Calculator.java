package es.ulpgc.dacd;

public class Calculator {
    public double calculate(Operation operation, double a, double b) {
        if (operation == Operation.ADD) return add(a, b);
        if (operation == Operation.SUBTRACT) return subtract(a, b);
        if (operation == Operation.MULTIPLY) return multiply(a, b);
        if (operation == Operation.DIVIDE) return divide(a, b);

        throw new IllegalArgumentException("Unknown operatiom");
    }


    private double add(double a, double b) { return a + b; }
    private double subtract(double a, double b) { return a - b; }
    private double multiply(double a, double b) { return a * b; }
    private double divide(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return a / b;
    }
}