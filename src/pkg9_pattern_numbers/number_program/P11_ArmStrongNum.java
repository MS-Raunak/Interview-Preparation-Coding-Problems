package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Armstrong Number:
 * A positive integer that is equal to the sum of the power of total number of digits of its individual digits.
 * Example:
 *
 * Consider the number 153:
 *
 * Individual Digits: 1, 5, 3
 * Number of Digits: 3 (since 153 has three digits)
 * Cubes of Digits: 1^3 = 1, 5^3 = 125, 3^3 = 27
 * Sum of Cubes: 1 + 125 + 27 = 153
 *
 * Consider another number 9474
 * Number Of Digits: 4
 * 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474
 */
public class P11_ArmStrongNum {
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        int num = new Scanner(System.in).nextInt();

        checkArmStrong(num);
    }
    //Method to calculate ArmStrong Number
    private static void checkArmStrong(int num) {
        int power = countDigit(num);
        int sumOfPowerOfTotalDigits = 0;

        for (int i=num; i>0; i/=10){
            int digit = i%10;
            sumOfPowerOfTotalDigits += (int) Math.pow(digit, power);
        }
        if (sumOfPowerOfTotalDigits==num)
            System.out.println(num + " is an ArmStrong Number");
        else    System.out.println(num + " is Not an ArmStrong Number");
    }

    //Method to count total digits of given number
    private static int countDigit(int num) {
        int count=0;
        for (int i=num; i>0; i/=10){
            //int digit = i%10;
            count++;
        }

        return count;
    }
}
