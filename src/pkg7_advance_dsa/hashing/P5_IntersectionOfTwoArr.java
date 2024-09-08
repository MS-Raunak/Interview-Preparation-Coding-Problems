package pkg7_advance_dsa.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Intersection means matching element in both array
public class P5_IntersectionOfTwoArr {
    public static void main(String[] args) {
        int[]arr1 = {1,2,2,4,5};
        int[]arr2 = {2,2,6,4};
        //expected op: [2,4]

        int[]result = intersection(arr1, arr2);
        System.out.println(Arrays.toString(result));

    }

    private static int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1)  set.add(num);

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr2){
            if (set.contains(num)){
                intersectionSet.add(num);
            }
        }

        //create result array with size of itersectionSet size
        int[]result = new int[intersectionSet.size()];

        //inserting intersectionSet element into result array
        int index=0;
        for (int num : intersectionSet){
            result[index++] = num;
        }

        return  result;
    }
}
