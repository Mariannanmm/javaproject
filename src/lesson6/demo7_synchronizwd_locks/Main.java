package lesson6.demo7_synchronizwd_locks;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Generator generator = new Generator();
        Runnable runnable = () -> {
            try {
                generator.generate();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        System.out.println("Starting generator");
        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime));
        System.out.println("List1: " + generator.getList1() + " ; List2: " + generator.getList2());




    }
}
