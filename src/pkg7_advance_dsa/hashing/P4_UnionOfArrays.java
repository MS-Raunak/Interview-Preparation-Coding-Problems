package pkg7_advance_dsa.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Do union of two arrays
public class P4_UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        //Expected union: [1,2,3,4,5,6,7,8,9]
        doUnion(arr1, arr2);
    }

    private static void doUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);

        System.out.println(Arrays.toString(set.toArray()));//[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
