package pkg1_array.array_1d;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Find the indexes of 2 ele which sum is equal to the target ele
public class P20_TwoSum {
    public static void main(String[] args) {
        int[]arr =  {3,2,4}; //{2,7,11,15};
        int target = 6; //9;

        int[]res = findSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findSum(int[] arr, int target) {
        //Bruteforce  Approach
        /*for (int i=0; i< arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target)
                    return new int[]{i, j};
            }
        }

        //If not found two elements which is sum of target
        return new int[]{0};*/

        //Optimized Approach using HashMap
        Map<Integer, Integer> map = new HashMap<>(); // pair of num, index
        for (int i=0; i<arr.length; i++){
            int remEle = target-arr[i];
            if (map.containsKey(remEle)){
                int idx1 = map.get(remEle);
                int idx2 = i;
                return  new int[]{idx1, idx2};
            }
            map.put(arr[i], i);
        }
        return  new int[]{0};
    }
}
