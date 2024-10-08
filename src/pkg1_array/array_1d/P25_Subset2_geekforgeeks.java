package pkg1_array.array_1d;

import java.util.HashMap;
import java.util.Map;

//Check if arr2 is subset of arr1 or not
public class P25_Subset2_geekforgeeks {
    public static void main(String[] args) {
        int[]arr1  = {11, 1, 13, 21, 3, 7};
        //int[]arr2 = {11, 33, 7, 1};
        int[]arr2 = {11, 3, 7, 1};

        //System.out.println(checkSubset(arr1, arr2)); //bruteforce approach=> )
        System.out.println(isSubset(arr1,arr2));    //optimized approach
    }

    //Bruteforce Approach
    private static String checkSubset(int[] arr1, int[] arr2) {
        for (int i=0; i< arr2.length; i++){
            if (!isEqual(arr2[i], arr1))
                return "NO";
        }
        return "YES";
    }

    private static boolean isEqual(int ele, int[] arr1) {
        for (int i=0; i< arr1.length; i++){
            if (ele == arr1[i]) {
                arr1[i]=-ele;
                return true;
            }
        }

        return false;
    }


    //Optimized Approach
    private static String isSubset(int[]arr, int[]arr2){
        Map<Integer, Integer> freqMap = new HashMap<>();

        //frequency of each ele of arr
        for (int ele : arr){
            freqMap.put(ele, freqMap.getOrDefault(ele,0)+1);
        }

        //check element of arr2 in set, if ele present then subtract the frequency by 1
        for (int ele : arr2){
            if(freqMap.containsKey(ele) && freqMap.get(ele) > 0){
                freqMap.put(ele, freqMap.get(ele)-1);
            }
            else
                return "NO";
        }

        return "YES";
    }

}
