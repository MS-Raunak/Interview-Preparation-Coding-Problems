package pkg10_tricky_programs;

public class Tricky {
    public static void main(String[] args) {
        //print hello world without using semicolon
        if (System.out.printf("Hello World")==null){}

        count(1);
    }

    //print 1 to 100 without using loop
    private static void count(int num){
        if (num>100) return;
        System.out.println(num);
        count(num+1);
    }
}
