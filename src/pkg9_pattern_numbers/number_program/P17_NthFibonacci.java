package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Fibonacci Series:
 * It is the sequence of numbers in mathematics.
 * It follows a specific pattern where each number is the sum of the two preceding ones.
 * EX: 0,1,1,2,3,5,8
 * first number and second number will be 0 & 1 and next number would be
 * sum of two previous number
 */
public class P17_NthFibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the nth: ");
        int n = new Scanner(System.in).nextInt();

        nthFibonacci(n);
    }

    private static void nthFibonacci(int n) {
        if (n<0){
            System.out.println("Invalid input!");
            return;
        }
        if (n==0){
            System.out.println(0);
            return;
        }
        if (n==1 || n==2){
            System.out.println(1);
            return;
        }
        int a=0;
        int b=1;
        int c=0;
        for (int i=1; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);


    }
}
