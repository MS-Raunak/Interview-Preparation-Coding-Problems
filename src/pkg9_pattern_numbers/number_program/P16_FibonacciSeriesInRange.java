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
public class P16_FibonacciSeriesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Starting range: ");
        int start = sc.nextInt();

        System.out.print("Ending range: ");
        int end = sc.nextInt();

        fiboInSeries(start, end);
    }

    //Generating Fibonacci Series in the given range
    private static void fiboInSeries(int start, int end) {
        int a=0;
        int b=1;
        int c=0;

        for (int i=1; i<=end; i++){
            if (c>=start){
                System.out.print(c + " ");
            }
            a=b;
            b=c;
            c=a+b;
        }
    }
}
