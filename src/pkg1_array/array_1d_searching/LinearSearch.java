package pkg1_array.array_1d_searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = {12, 121, 13, 151, 97};
        System.out.println("Given Array: " + Arrays.toString(arr));

        System.out.print("enter key(ele): ");
        int key = sc.nextInt();


        int index = search(arr, key);

        if (index==-1)
            System.out.println("Element not found in given array");
        else System.out.println("Given element " + key + " is found at " + index + "th index");
    }

    private static int search(int[] arr, int key) {
        for (int i=0; i< arr.length; i++) {
            if (arr[i]==key)
                return i;
        }

        return -1;
    }
}
