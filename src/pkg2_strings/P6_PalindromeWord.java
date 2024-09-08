package pkg2_strings;

public class P6_PalindromeWord {
    public static void main(String[] args) {
        String s = "Madam is staying with dad in Malayalam";

        String[] strArr = s.split(" ");
        for (String str : strArr){
            if (isPalindrome(str)){
                System.out.println(str + " is Palindrome word");
            }
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int i=0;
        int j=str.length()-1;

        while (i<j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }

        return true;
    }
}
