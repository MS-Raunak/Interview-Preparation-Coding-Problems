package pkg3_recursion;

public class P2_PalindromeStr {
    public static void main(String[] args) {
        String s = "malayalam";
        boolean flag = isPalindrome(s, 0, s.length()-1);
        System.out.println(flag);
    }

    private static boolean isPalindrome(String s, int i, int j) {
        if (i>=j){
            return true;
        }
        else if (s.charAt(i)!=s.charAt(j))
            return false;

        return  isPalindrome(s, i+1, j-1);
    }
}
