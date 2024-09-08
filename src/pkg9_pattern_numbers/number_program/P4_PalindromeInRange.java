package pkg9_pattern_numbers.number_program;

import java.util.Scanner;
/**
 * Palindrome Number: The number which is exactly same after the reversing
 * EX: 11, 111, 121...
 */
public class P4_PalindromeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range a: ");
        int range_a = sc.nextInt();
        System.out.print("enter range b: ");
        int range_b = sc.nextInt();

        palindromeInRange(range_a, range_b);
    }

    //simplify the range
    private static void palindromeInRange(int rangeA, int rangeB) {
        for (int num=rangeA; num<=rangeB; num++){
            if (isPalindrome(num))
                System.out.println(num + " is a Palindrome Number");
        }
    }

    //Check whether the passing number is Palindrome or Not
    private static boolean isPalindrome(int num) {
        int reversed=0;
        for (int i=num; i>0; i/=10) {
            reversed = reversed*10 + i%10;
        }

        return reversed == num;
    }
}
