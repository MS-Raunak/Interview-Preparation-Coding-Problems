package pkg8_multithreading;

public class P5_ThreadPrevention_Yield extends Thread{
    @Override
    public void run() {
        Thread.yield();
        for (int i=1; i<=5; i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        P5_ThreadPrevention_Yield thread = new P5_ThreadPrevention_Yield();

        thread.start();

        for (int i=1; i<=5; i++){
            System.out.println("Main Thread");
        }

    }
}
/**
 * In the above program child Thread always calling yield() method and hence main
 * Thread will get the chance more number of times for execution.
 * Hence the chance of completing the main Thread first is high.
 * Note : Some operating systems may not provide proper support for yield() method.
 */