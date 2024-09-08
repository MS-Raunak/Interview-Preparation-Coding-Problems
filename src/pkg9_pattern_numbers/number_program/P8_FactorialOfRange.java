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
public class P8_FactorialOfRange {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter range a: ");
            int range_a = sc.nextInt();
            System.out.print("enter range b: ");
            int range_b = sc.nextInt();

            factorialOfRange(range_a, range_b);
        }

    //Calculating Range
    private static void factorialOfRange(int rangeA, int rangeB) {
            for (int num=rangeA; num<=rangeB; num++) {
                factorial(num);
            }
    }

    //Calculating Factorial
    private static void factorial(int num) {
            int fact=1;
            for (int i=num; i>=1; i--){
                fact=fact*i;
            }
        System.out.println(num+"!= " + fact);
    }
}
