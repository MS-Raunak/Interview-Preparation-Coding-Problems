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
public class P10_StrongNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range a: ");
        int range_a = sc.nextInt();
        System.out.print("enter range b: ");
        int range_b = sc.nextInt();

        strongInRange(range_a, range_b);
    }

    private static void strongInRange(int rangeA, int rangeB) {
        for (int i=rangeA; i<=rangeB; i++){
            if (isStrong(i))
                System.out.println(i + " is a Strong Number");
        }
    }

    private static boolean isStrong(int num) {
        int sumOfFactOfDigits = 0;
        for (int i=num; i>0; i/=10){
            sumOfFactOfDigits += factorial(i%10);
        }
        if (sumOfFactOfDigits==num) return true;
        else return false;
    }

    private static int factorial(int num) {
        int fact=1;
        for (int i=num; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }
}
