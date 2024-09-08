package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Perfect Number: Number which is equal to the Sum of all positive number(excluding number itself)
 * EX: 6, 28
 */
public class P6_PerfectInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range a: ");
        int range_a = sc.nextInt();
        System.out.print("enter range b: ");
        int range_b = sc.nextInt();

        perfactInRange(range_a, range_b);
    }

    private static void perfactInRange(int rangeA, int rangeB) {
        for (int num=rangeA; num<=rangeB; num++){
            if(isPerfect(num))
                System.out.println(num + " is a Perfect Number");
        }
    }

    private static boolean isPerfect(int num) {
        int sumOfDivisors = 0;
        for (int i=1; i<num; i++) {
            if (num%i==0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors==num;
    }
}
