package pkg5_design_pattern;

public class Singleton {
    //Lazy Initialization
    private static Singleton instance;

    private Singleton(){}

    //Factory method design pattern
    public static Singleton getInstance(){
        if (instance==null) {
            instance = new Singleton();
            return instance;
        }
        else return instance;
    }
}

