package lesson3.demo4_functional;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> {
            System.out.println();
            return a + b;
        };
        Calculator calculator2 = (a, b) -> {
            System.out.println();
            return a / b;
        };
        fooBar(10,20, (a, b) -> a*b);

    }
    public static void fooBar(int a, int b, Calculator calculator) {
        calculator.calculate(a,b);
    }
}