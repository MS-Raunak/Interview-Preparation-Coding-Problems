package pkg7_advance_dsa.hashing;

import java.util.LinkedHashMap;

//Find the occurrence of each character in given string
public class P2_CharFrequency {
    public static void main(String[] args) {
        frequency("Chhaya");
    }

    private static void frequency(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>(); //to preserve insertion order used lhashMap

        for (Character ch : s.toCharArray()){
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        }
        //System.out.println(map);

        //Iterate
        for (Character c : map.keySet()){
            System.out.println(c + ": " +  map.get(c));
        }
    }
}
