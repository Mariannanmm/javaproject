package lesson6.demo8_waitandnotify;

import java.util.LinkedList;

public class Processor {

    private LinkedList<Integer> list = new LinkedList<>();
    private final Object lock1 = new Object();
    private final int LIMIT = 10;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            while (list.size() == LIMIT) {
                lock1.wait();
            }
            synchronized (lock1) {
                list.add(value++);
            }

        }
    }

    public void consume() {
        while (true) {
            synchronized (lock1) {
                if (list.isEmpty()) {
                    continue;
                }
                System.out.print("list size: " + list.size());
                int value = list.removeFirst();
                System.out.println(" ; Removed value: " + value);
                lock1.notify();
            }

        }
    }

}
