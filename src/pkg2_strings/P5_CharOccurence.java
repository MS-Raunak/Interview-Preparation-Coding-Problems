package pkg2_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P5_CharOccurence {
    public static void main(String[] args) {
        String s = "India";

        //minOccurrence(s.toLowerCase());
        //maxOccurrence(s.toLowerCase());

        //Using Hashmap
        min(s.toLowerCase());
        max(s.toLowerCase());
    }

    private static void max(String s) {
        Map<Character, Integer> map = new HashMap<>();//we can use LinkedHAshMap for preserving insertion order

        //Frequency of each character
        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else {
                map.put(ch, map.get(ch)+1);
            }
        }

        int max = 0;
        char resChar = ' ';

        //Find max occurrence
        for (char ch: map.keySet()) {
            int count = map.get(ch);
            if (max < count) {
                max=count;
                resChar = ch;
            }
        }

        //if max occurrence is having more than one max occurred char
        List<Character> list = new ArrayList<>();
        for (char ch : map.keySet()) {
            if (max ==  map.get(ch)){
                list.add(ch);
            }
        }
        System.out.println(list);

    }

    //Character with minimum occurrence
    private static void min(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        char resChar = ' ';

        // frequency of each character
        for (char ch : s.toCharArray()){
            if (!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else {
                map.put(ch, map.get(ch)+1);
            }
        }

        //Find minimum occurrence
        for (char ch : map.keySet()){
            if (map.get(ch) < min) {
                min = map.get(ch);
                resChar = ch;
            }
        }
        System.out.println(resChar);

        //Find total minimum occurrence
        List<Character> list = new ArrayList<>();
        for (char ch: map.keySet()){
            if (map.get(ch)==min){
                list.add(ch);
            }
        }
        System.out.println(list);



    }

    //Character with minimum occurrence
    private static void minOccurrence(String s) {
        int min = Integer.MAX_VALUE;

        char ch = ' '; //store char with min occurrence

        char[]chars = s.toCharArray();

        for (int i=0; i<s.length(); i++){
            int count=1;
            for (int j=i+1; j<s.length(); j++){
                if (chars[i]==chars[j]){
                    count++;
                    chars[j]=' ';
                }
            }
            if (chars[i]!=' ' && count<min){
                min=count;
                ch = s.charAt(i);
            }
        }
        System.out.println("Min char Occurance: " + ch);
    }


    //Character with max occurrence
    private static void maxOccurrence(String s) {
        char[]chars = s.toCharArray();

        int max=0;
        char ch = ' ';  //hold resulting char

        for (int i=0; i< chars.length; i++){
            int count=1;
            for (int j=i+1; j< chars.length; j++){
                if (chars[i]==chars[j]){
                    count++;
                    chars[j]=' ';
                }
            }
            if (chars[i]!=' ' && max < count){
                max=count;
                ch = chars[i];
            }
        }

        System.out.println("Max char occurrence: " + ch);
    }
}
