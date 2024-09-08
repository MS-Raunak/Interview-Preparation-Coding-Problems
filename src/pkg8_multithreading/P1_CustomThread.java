package pkg8_multithreading;

//Creating thread by extending Thread class
public class P1_CustomThread extends  Thread{
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println( Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        P1_CustomThread thread = new P1_CustomThread();

        thread.setName("Thread");
        thread.start();

        for (int i=1; i<=5; i++){
            System.out.println("Main-Thread");
        }

        //Output comes in random order

    }
}
