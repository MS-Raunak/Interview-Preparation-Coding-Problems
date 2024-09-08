package pkg7_advance_dsa.hashing;

import java.util.HashMap;

//Find the majority fequency of elements which is greater than arr.length/3
public class P3_MajorityEle {
    public static void main(String[] args) {
        int []nums = {1,3,2,5,1,3,1,5,1};//{1,2};

        findMajority(nums);

    }

    private static void findMajority(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (Integer e : nums){
            if (map.containsKey(e)){
                map.put(e, map.get(e)+1);
            }
            else
                map.put(e,1);
        }

        for (Integer key: map.keySet()){
            if (map.get(key) > n/3)
                System.out.println(key);
        }


    }
}
