package lesson6.demo9_reentrant_locks;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private int count = 0;

    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final Condition condition = reentrantLock.newCondition();

    public void increment() {
        for (int i = 0; i<10000; i++) {
            count++;
        }

    }
    public void firstThreadJob()  {
        reentrantLock.lock();
        System.out.println("waiting...");
        System.out.println("waiting...");
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("woken up!");
        try {
            increment();
            System.out.println("first thread is done");
        }  finally {
            reentrantLock.unlock();
        }
    }
    public void secondThreadJob() {
        reentrantLock.lock();
        System.out.println("press return key");
        new Scanner(System.in).nextLine();
        System.out.println("got return key");
        condition.signal();
        try {
            increment();
            System.out.println("second thread is done");
        }   finally {
            reentrantLock.unlock();
        }
    }
    public void finishState() {
        System.out.println("final count: " + count);
    }



}
