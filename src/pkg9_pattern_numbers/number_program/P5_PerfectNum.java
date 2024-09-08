package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Perfect Number:
 * a positive integer that is equal to the sum of its positive proper divisors(excluding number itself).
 * EX: 6:
 * divisors of 6 = 1, 2, 3 => 1+2+3=6
 */
public class P5_PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();

        isPerfect(num);
    }

    private static void isPerfect(int num) {
        int sumOfDivisors = 0;
        for (int i=1; i<num; i++){
            if (num%i==0){
                sumOfDivisors+=i;
            }
        }
        if (sumOfDivisors == num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is Not a Perfect Number");
    }
}
