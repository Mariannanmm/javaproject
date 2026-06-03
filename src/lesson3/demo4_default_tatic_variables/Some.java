package lesson3.demo4_default_tatic_variables;

public interface Some {
    public static final int x = 0;

    public int doSomth1(int x);
    int doSomth2(int x);
    String doSomth3();

    default void newMethod() {}
    static void againMethod() {}
}
