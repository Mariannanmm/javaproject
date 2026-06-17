package lesson6.demo5_thread_volatile;

public class Main {

    public static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 2000; i++) {
                System.out.println("runnable1 value: " + i);
            }
            running = false;
            System.out.println("State has been changed to:  " + running);
        };

        Runnable  runnable2 = () -> {
            int  i = 0;
            while (running) {
                i++;
            }
            System.out.println("runnable2 final value:  " + running);
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("all threads are completed");

    }
}
