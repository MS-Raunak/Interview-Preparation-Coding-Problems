package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Strong Number:
 * positive integer that is equal to the sum of the factorials of its individual digits.
 * Consider the number 145:
 *
 * Individual Digits: 1, 4, 5
 * Factorials: 1! = 1, 4! = 24, 5! = 120
 * Sum of Factorials: 1 + 24 + 120 = 145
 */
public class P9_StrongNum {
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        int num = new Scanner(System.in).nextInt();

        strongNum(num);
    }

    // Method to check whether the given number is Strong Number or Not
    private static void strongNum(int num) {
        int sumOfFactOfDigits = 0;

        for (int i = num; i > 0; i /= 10) {
            int digit = i % 10; // Extract the digit
            sumOfFactOfDigits += factorial(digit);
        }

        if (sumOfFactOfDigits == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is Not a Strong Number");
        }
    }

    //Method to check calculate factorial Number
    private static int factorial(int num) {
        int fact=1;
        for (int i=num; i>=1; i--){
            fact=fact*i;
        }

        return fact;
    }
}
