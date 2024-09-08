package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

public class P0_SumOfDigit {
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        int num = new Scanner(System.in).nextInt();

        sumOfDigits(num);
    }

    private static void sumOfDigits(int num) {
        int sumOfDigits = 0;
        int digit = 0;

        for (int i=num; i>0; i/=10){
            digit = i%10;
            System.out.print(digit + " + ");
            sumOfDigits+=digit;
        }
        System.out.print("= " + sumOfDigits);
    }
}
