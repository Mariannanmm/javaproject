package lesson6.demo4_thread_join;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CalculateReportJob calculateReportJob = new CalculateReportJob();
        SendReportJob sendReportJob = new SendReportJob(calculateReportJob);
        calculateReportJob.start();
        sendReportJob.start();





    }
}
