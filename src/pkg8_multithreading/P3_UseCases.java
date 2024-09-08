package pkg8_multithreading;

public class P3_UseCases extends Thread{
    //we can override start method but in this case start method will be executed just like a normal method call
   @Override
    public void start(){
       System.out.println("Normal method call");
    }

    //We can overload run method but start method always execute or invoke the no-arg run method
    public void run() {
        System.out.println("No-arg run()");
    }

    public void run(int i) {
        System.out.println("Parameterized run()");
    }


    //main method
    public static void main(String[] args) {
        P3_UseCases thread = new P3_UseCases();

        thread.start();
    }


}
