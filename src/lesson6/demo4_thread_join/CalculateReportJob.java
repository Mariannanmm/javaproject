package lesson6.demo4_thread_join;

public class CalculateReportJob extends Thread{
    private String result;

    public String getResult() {
        return result;
    }

    @Override
    public void run() {
        System.out.println("Calculating report done...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.result = "here is my new report";
        System.out.println("report is ready");
    }
}
