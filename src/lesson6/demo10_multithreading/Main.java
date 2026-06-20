package lesson6.demo10_multithreading;

import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 300; i++) {
            String uuid = UUID.randomUUID().toString();
            MessageProcessor messageProcessor = new MessageProcessor(uuid);
            executorService.execute(messageProcessor);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
        long end = System.currentTimeMillis();
        System.out.printf("Total time: %d ms\n", end - start);

    }

}
