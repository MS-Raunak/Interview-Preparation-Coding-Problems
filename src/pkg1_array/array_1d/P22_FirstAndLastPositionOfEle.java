package pkg1_array.array_1d;

import java.util.Arrays;

//ex: arr{1,2,7,4,2,11}; target=2 => op: [1,4], if 2 is not present in arr, return arr[-1,-1]
public class P22_FirstAndLastPositionOfEle {
    public static void main(String[] args) {
        int[]arr = {1,2,7,4,2,11,1};

        int[]ans = findFirstAndLastPos(arr, 2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findFirstAndLastPos(int[] arr, int target) {
        int[]ans = {-1,-1};

        for (int i=0; i<arr.length; i++){
            if (arr[i]==target){
                if (ans[0]==-1)
                    ans[0] = i;

                else ans[1] = i;
            }
        }
        return ans;
    }
}
