package pkg2_strings;

public class P4_PalindromeString {
    public static void main(String[] args) {
        String s = "madama";

        checkPalindrome(s);
    }

    //Palindrome String
    private static void checkPalindrome(String s) {

        char[]chars = s.toCharArray();
        int i=0;
        int j=s.length()-1;

        while (i<j){
            if (chars[i]!=chars[j]) {
                System.out.println(s + " is not a Palindrome String");
                return;
            }
            else {
                i++;
                j--;
            }
        }
        System.out.println(s + " is a Palindrome String");


        //Another way using StringBuilder
        /*StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String str = sb.toString();

        if (s.equals(str)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
         */

    }
}
