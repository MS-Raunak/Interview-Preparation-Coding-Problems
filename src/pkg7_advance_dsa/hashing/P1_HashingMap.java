package pkg7_advance_dsa.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Subclass of Map interface.
 * Allow to insert key-pair values in map.
 * It uses hashing technique.
 * Underlying data structure is Array & linkedList which is used to sort keys of map.
 * insertion order us not allowed but keys will be on sorted order
 * Duplicate keys are not allow.
 * Values can be duplicated.
 * At most one key can be null but n number of null value can be allowed.
 * Available in java.util package.
 * Introduced in jdk1.2
 */
public class P1_HashingMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //map.put(null, "India"); allowed one null as key
        //map.put(1, null);
        //map.put(2, null);  // n number of null values are allowed

        map.put(3, "Chhaya");
        map.put(1, "Shanaya");
        map.put(2, "Jaa babu");
        //System.out.println(map);  //{1=Shanaya, 2=Jaa babu, 3=Chhaya} => keys are in sorted order

        //Searching
        /*System.out.println(map.containsKey(3));//true => searching for key and return boolean
        System.out.println(map.containsValue("Shanaya"));//true => searching for value and return boolean
        System.out.println(map.get(1)); // Shanaya => searching value based on key*/

        //Iterating map - 1st-Approach
        System.out.println("\nFirst Approach To Iterate");
        for (Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        //Removing
        String b = map.remove(2);
        System.out.println("\n" + b + " deleted from set");

        //Iterating map - 2nd-Approach
        System.out.println("\nSecond Approach To Iterate");
       for (Integer key :  map.keySet()){
           System.out.println(key + ": " + map.get(key));
       }
    }
}
