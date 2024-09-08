package pkg1_array.array_1d;

import java.util.Arrays;
import java.util.Random;

public class P14_ShuffleArrEle {
    public static void main(String[] args) {
        int[]arr = {12, 121, 13, 151, 97};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Shuffled Array: " + Arrays.toString(shuffle(arr)));
    }

    private static int[] shuffle(int[] arr) {
        Random random = new Random();
        int randomIdx = random.nextInt(arr.length);
        //System.out.println(randomIdx);

        for (int i=0; i< arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[randomIdx];
            arr[randomIdx] = temp;
        }

        return arr;
    }
}
