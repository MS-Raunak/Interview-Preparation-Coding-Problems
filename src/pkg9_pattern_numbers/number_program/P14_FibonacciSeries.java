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
public class P14_FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter the number of terms for the Fibonacci sequence:");
        int n = new Scanner(System.in).nextInt();

        fibonacci(n);

    }

    private static void fibonacci(int n) {
        int a=0;
        int b=1;

        for (int i=1; i<=n; i++){
            System.out.print(a +" ");
            int c=a+b;
            a=b;
            b=c;

        }
    }
}
