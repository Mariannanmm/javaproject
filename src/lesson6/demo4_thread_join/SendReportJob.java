package lesson6.demo4_thread_join;

public class SendReportJob extends Thread {
    private CalculateReportJob calculateReportJob;
    public SendReportJob(CalculateReportJob calculateReportJob) {
        this.calculateReportJob = calculateReportJob;
    }

    @Override
    public void run() {
        try {
            calculateReportJob.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String result = calculateReportJob.getResult();
        System.out.printf("Sending report: %s...", result);
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Report is send");


    }

}
