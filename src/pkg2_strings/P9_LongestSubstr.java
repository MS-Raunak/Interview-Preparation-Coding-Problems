package pkg2_strings;

import java.util.*;
import java.util.stream.Collectors;


// Find first longest substring without repeating the characters
public class P9_LongestSubstr {
    public static void longestSubStr(String s) {
        String longestSubstr=null;
        int longestSubStrLength=0;

        Map<Character, Integer> map= new LinkedHashMap<>();
        char[]chars = s.toCharArray();

        for (int i=0; i< chars.length; i++){
            if (!map.containsKey(chars[i])){
                map.put(chars[i], i); //here i represents index value of current char
            }
            else {
                i=map.get(chars[i]);
                map.clear();
            }

            if (map.size() > longestSubStrLength){
                longestSubStrLength = map.size();
                String str="";
                longestSubstr=map.keySet().stream().map(ch-> str+ch).collect(Collectors.joining());
            }
        }
        System.out.println("Longest Substring is: " + longestSubstr + "\nLength: " + longestSubStrLength);
    }

    public static void main(String[] args) {
        longestSubStr("pwwkew");
    }
}

