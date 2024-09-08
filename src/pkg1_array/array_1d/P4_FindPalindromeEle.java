package pkg1_array.array_1d;

import java.util.Arrays;

/**
 * Palindrome Element:
 * Given Array: [12, 121, 13, 151, 97]
 * 121 is the palindrome element
 * 151 is the palindrome element
 *
 * Note: A palindrome number is a number which is exact same after reversing digit
 */
public class P4_FindPalindromeEle {
    public static void main(String[] args) {
        int[]arr = {12, 121, 13, 151, 97};
        System.out.println("Given Array: " + Arrays.toString(arr));

        for (int ele : arr){
            if(isPalindrome(ele))
                System.out.println(ele + " is the palindrome element");
        }
    }

    private static boolean isPalindrome(int ele) {
        int rev = 0;
        for (int i=ele; i>0; i/=10) {
            rev = rev*10 + i%10;
        }

        if (rev==ele) return true;
        return false;
    }
}
