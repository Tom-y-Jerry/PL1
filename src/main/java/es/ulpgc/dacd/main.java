package es.ulpgc.dacd;

public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Suma: "+ calc.calculate("add", 5, 3));
        System.out.println("Resta: "+ calc.calculate("subtract", 5, 3));
    }
}
