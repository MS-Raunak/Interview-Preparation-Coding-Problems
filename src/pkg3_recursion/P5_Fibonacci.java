package pkg3_recursion;

import java.util.Scanner;

//Find fibonacci
public class P5_Fibonacci {
    public static void main(String[] args) {
        System.out.println("enter n:");
        int n = new Scanner(System.in).nextInt();

        //calling fun to generate fibonacci series
        for (int i=0; i<=n; i++){
            System.out.print(fibo(i) + " ");
        }

        //calling fun to find nth fibonacci ele
        System.out.println("\n" + nthFibo(n));


    }

    //Generate fibonacci series
    public static int fibo(int n){
        if (n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }

    //Find nth fibonacci
    public static int nthFibo(int n){
        if (n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }

}
