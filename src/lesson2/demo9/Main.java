package lesson2.demo9;

public class Main {
    public static void main() {

        System.out.println(Wrap.x);
        Wrap.AddOperations addOperations = new Wrap.AddOperations();
        addOperations.addOne();
        addOperations.addTwo();
        System.out.println(Wrap.x);

        Wrap.RemoveOperations removeOperations = new Wrap.RemoveOperations();
        removeOperations.removeOne();
        System.out.println(Wrap.x);

    }
}
