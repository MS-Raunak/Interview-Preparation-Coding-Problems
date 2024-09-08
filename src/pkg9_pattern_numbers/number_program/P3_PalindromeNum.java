package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Palindrome Number: The number which is exactly same after the reversing
 * EX: 11, 111, 121...
 */
public class P3_PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();

        isPalindrome(num);
    }

    //method to check whether the given number is Palindrome or not
    private static void isPalindrome(int num) {
        int reversed = 0;
        for (int i=num; i>0; i/=10) {
            reversed = reversed*10+i%10;
        }
        if (reversed==num)
            System.out.println(num + " is a Paindrome Number");
        else    System.out.println(num + " is NOT a Paindrome Number");
    }
}
