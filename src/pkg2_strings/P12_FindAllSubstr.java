package pkg2_strings;

/*
*Program to print all possible substring in given string
* Example:
* String s = "abc"
* op:
* a,b,c,ab,bc,abc
*

 */
public class P12_FindAllSubstr {
    public static void main(String[] args) {
        String s = "abc";
        findSubstring(s);
    }

    private static void findSubstring(String s) {
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
