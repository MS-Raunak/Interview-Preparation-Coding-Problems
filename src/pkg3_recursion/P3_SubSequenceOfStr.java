package pkg3_recursion;

//Find the subsequences(powerSet) of given string
/*
EX: s="ab"
total powerset = (2)^n => 2^2 => 4
op:"", "a", "b", "ab"
 */
public class P3_SubSequenceOfStr {
    public static void main(String[] args) {
        String s = "ab";
        powerSet(s, 0, "");
    }

    private static void powerSet(String s, int i, String currStr) {
        if (i==s.length()) {
            System.out.println(currStr);
            return;
        }
        powerSet(s,i+1,currStr+s.charAt(i));
        powerSet(s,i+1, currStr);
    }
}
