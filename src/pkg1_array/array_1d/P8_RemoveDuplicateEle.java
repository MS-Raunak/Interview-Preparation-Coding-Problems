package pkg1_array.array_1d;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class P8_RemoveDuplicateEle {
    public static void main(String[] args) {
        int[]arr = {3,0,1,2,1,2,1,0,3,4};
        removeDuplicateFromSortedArr(arr);
        removeDuplicateFromUnortedArr(arr);

    }

    //Remove duplicates from sorted arr
    private static void removeDuplicateFromSortedArr(int[] arr) {
        //Sort Array
        Arrays.sort(arr);

        int idx=0;
        for (int i=0; i< arr.length-1; i++){
            if (arr[i]!=arr[i+1]){
                arr[idx++] = arr[i];
            }
        }
        //Adding last element which was left in looping
        arr[idx++] = arr[arr.length-1];

        //Filter unique elements and add those into new arr
        int[]res = new int[idx];
        for (int i=0; i< res.length; i++){
            res[i] = arr[i];
        }
        System.out.println(Arrays.toString(res));
    }

    //Remove duplicates from unsorted array
    private static void removeDuplicateFromUnortedArr(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        //Add all elements as key and occurrence as a value in a map, since map sorted the keys
        for (int ele : arr){
            if (!map.containsKey(ele)){
                map.put(ele, 1);
            }
            else {
                map.put(ele, map.get(ele)+1);
            }
        }

        //Add all keys which is unique, into a resultant array
        int[]res = new int[map.size()];
        int idx = 0;
        for (Integer key : map.keySet()){
            res[idx++] = key;
        }
        System.out.println(Arrays.toString(res));
    }

}
