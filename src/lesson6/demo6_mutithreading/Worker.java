package lesson6.demo6_mutithreading;

public class Worker {
    private int count = 0;

    int getCount() {
        return count;
    }

    public synchronized void increment() throws InterruptedException {
        count = count+1;
        System.out.println("Thread in progress..." + Thread.currentThread().getName() + "and count is: " + count);
        Thread.sleep(1000);
    }


}
