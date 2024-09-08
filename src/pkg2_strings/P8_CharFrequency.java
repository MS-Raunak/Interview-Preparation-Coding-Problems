package pkg2_strings;

import java.util.HashMap;
import java.util.Map;

public class P8_CharFrequency {
    public static void main(String[] args) {
        //findFrequency("chhaya");
        frequency("chhaya"); //using collection

    }


    //Beginner technique
    private static void findFrequency(String s) {
        char[]chars = s.toCharArray();

        for (int i=0; i< chars.length; i++) {
            int count=1;

            for (int j=i+1; j< chars.length; j++){
                if (chars[i] == chars[j]){
                    count++;
                    chars[j] = ' ';
                }
            }

            if (chars[i]!=' '){
                System.out.println(s.charAt(i) + ": " + count);
            }
        }
    }

    //Map technique
    private static void frequency(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch: s.toCharArray()) {
            if (!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else {
                map.put(ch, map.get(ch) + 1);
            }
        }
       // System.out.println(map);

        //print
        for (char ch : map.keySet()){
            System.out.println(ch + ": " + map.get(ch));
        }
    }
}
