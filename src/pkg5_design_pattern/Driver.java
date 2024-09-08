package pkg5_design_pattern;

public class Driver {
    public static void main(String[] args) {

        //Lazy Initialization singleton
       Singleton singleton =  Singleton.getInstance();
       Singleton singleton1 =  Singleton.getInstance();
       Singleton singleton3 =  Singleton.getInstance();

        //System.out.println(singleton == singleton1); //true always
        //System.out.println(singleton1 == singleton3); //true always

        //Eager Initialization Singleton
        Singleton1 s = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s==s2);
    }
}
