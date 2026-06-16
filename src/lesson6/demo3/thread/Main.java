package lesson6.demo3.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        };
        Thread thread0 =  new Thread(runnable, "My-Thread0");
        Thread thread1 =  new Thread(runnable, "My-Thread1");
        Thread thread2 =  new Thread(runnable, "My-Thread2");


        thread0.start();
        thread0.join();
        System.out.println("thread0.isAlive");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("all threads are finished");


    }
}

