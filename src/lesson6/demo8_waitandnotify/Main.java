package lesson6.demo8_waitandnotify;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) throws InterruptedException {
        Processor processor = new Processor();
        Thread producer =  new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Producer Thread");
        Thread consumer =  new Thread(processor::consume, "Consumer Thread");
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

    }
}
