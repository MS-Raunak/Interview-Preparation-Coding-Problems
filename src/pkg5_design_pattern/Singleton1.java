package pkg5_design_pattern;

public class Singleton1 {
    private static Singleton1 instantce = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instantce;
    }
}
