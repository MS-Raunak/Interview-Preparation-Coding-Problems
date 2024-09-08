package pkg9_pattern_numbers.number_program;

import java.util.Scanner;


/**
 * Find sum of first n numbers?
 * Ex: Find Sum of first 4 numbers(1,2,3,4)
 * 1+2+3+4 => 10
 */
public class P13_SumOfFirst_N_Numbers {
    public static void main(String[] args) {
        System.out.print("enter n: ");
        int n = new Scanner(System.in).nextInt();

        int sum = (n*(n+1))/2;
        System.out.println("Sum Of First " + n + " numbers = "+ sum);

    }
}
