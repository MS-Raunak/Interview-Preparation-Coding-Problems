package pkg3_recursion;

import java.util.Scanner;

public class P7_PrimeNum {
    public static void main(String[] args) {
        System.out.print("enter number:");
        int n = new Scanner(System.in).nextInt();

        System.out.println(isPrime(n, 2));
    }

    private static boolean isPrime(int n, int i) {
        if (i>n/2) return true;
        if (n%i==0) return false;
        return isPrime(n, i+1);
    }
}
