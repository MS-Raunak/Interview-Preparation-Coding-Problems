package pkg8_multithreading;

public class P2_CustomThread implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println( Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        P2_CustomThread runnable = new P2_CustomThread();

        Thread thread = new Thread(runnable);//here runnable is a Target Runnable
        Thread thread2 = new Thread(runnable);//here runnable is a Target Runnable

        thread.setName("Thread-1");
        thread.start();

        thread2.setName("Thread-2");
        thread2.start();



        //Output comes in random order

    }
}
