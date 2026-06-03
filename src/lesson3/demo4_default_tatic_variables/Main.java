package lesson3.demo4_default_tatic_variables;

public class Main {
    public static void main(String[] args) {
        System.out.println(Some.x);

        JustClass justClass = new JustClass();
        justClass.newMethod();

        Some.againMethod();



    }
}
