package pkg2_strings;

import java.util.Arrays;
import java.util.Comparator;

public class P10_FindLargestWordStr {
    public static void main(String[] args) {
        String s = "Chhaya is a cute baby girl";
        longestStr(s);
    }

    private static void longestStr(String s) {
        int longestStrLength=0;
        String longestStr="";
        String[]strArr = s.split(" ");

        for (String str: strArr){
            if (str.length()> longestStrLength){
                longestStrLength=str.length();
                longestStr = str;
            }
        }
        System.out.println("Longest String: " + longestStr);

        //Using java8
        //longestStr = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        //System.out.println("Longest String: " + longestStr);
    }


}
