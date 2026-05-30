package lesson2.demo8;

public class Main {
    public static void main() {

        Wrap wrap = new Wrap(0);

        Wrap.AddOperations addOperations = wrap.new AddOperations();
        addOperations.addOne();
        addOperations.addTwo();
        System.out.println(wrap.getX());

    }
}
