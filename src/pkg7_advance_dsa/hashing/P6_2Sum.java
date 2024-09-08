package pkg7_advance_dsa.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P6_2Sum {
    public static void main(String[] args) {
        int[]arr =  {3,2,4}; //{2,7,11,15};
        int target = 6; //9;

        int[]res = findSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            int required = target - arr[i];
            if (map.containsKey(required)){
                int idx1 = map.get(required);
                int idx2 = i;
                return new int[]{idx1, idx2};
            }
            map.put(arr[i], i);
        }
        return new int[]{0};
    }
}
