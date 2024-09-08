package pkg8_multithreading;

public class P4_ThreadPriority extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getPriority());
        }
    }


    //main method
    public static void main(String[] args) {
        P4_ThreadPriority thread1 = new P4_ThreadPriority();
        P4_ThreadPriority thread2 = new P4_ThreadPriority();

        thread1.setPriority(10);
        //thread2.setPriority();  //always executed first

        thread1.start();
        thread2.start();
    }
}
