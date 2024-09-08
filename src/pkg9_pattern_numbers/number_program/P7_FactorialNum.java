package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Factorial Number:
 * factorial number is the product of all the positive integers less than or equal to n.
 * Factorial of n is denoted by n!
 * n! = n(n-1)*n(n-2)*n(n-3)*...n(n-m)
 *
 * Example 5!=120
 * => 5*4*3*2*1 = 120
 */
public class P7_FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();

        factorial(num);
    }

    //Method to Calculate Factorial
    private static void factorial(int num) {
        int fact=1;
        for (int i=num; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("Factorial of " + num + "! = " + fact);
    }
}
