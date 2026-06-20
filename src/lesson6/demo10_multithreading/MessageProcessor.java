package lesson6.demo10_multithreading;

public class MessageProcessor implements Runnable {

    private String message;
    public MessageProcessor(String message) {
        this.message = message;
    }
    private void processMessage() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Unable to process message" + message);
        }
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +  "[received] message: " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() +  "[processed] message: " + message);

    }
}
