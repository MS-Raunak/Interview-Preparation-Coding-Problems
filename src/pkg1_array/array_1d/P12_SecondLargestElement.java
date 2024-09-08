package pkg1_array.array_1d;

/**
 * Find Second Largest Element in given array
 */

public class P12_SecondLargestElement {
    public static void main(String[] args) {
        int[]arr = {12,4,23,65,21, 48};

        int max = 0;
        int secMAx = 0;

        for (int i=0; i< arr.length; i++) {
            if (arr[i] > max) {
                secMAx = max;
                max = arr[i];
            }

            if (arr[i] < max && arr[i] > secMAx )
                secMAx = arr[i];

        }
            System.out.println(secMAx + " is the second max element");
            //System.out.println(max + " is the first max element");

    }
}
