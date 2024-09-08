package pkg1_array.array_1d;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Remove element
 * 1.Remove element from given index
 * 2.Remove specified element of an array
 */

public class P9_RemoveElement {

    //1.Remove element from given index
    public static int[] removeAt(int index, int[]arr) {

        //If provided index is greater than array length
        if (index >= arr.length){
            System.out.println("Array Index out of bound");
            return null;
        }

        //Shift element left side from given index to remove element
        for (int i=index; i< arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        //Since last element will be same as second last, so replace it from zero
        arr[arr.length-1] = 0;

        return arr;
    }

    //2.Remove element from given array
    public static int[] remove(int ele, int[]arr) {
        //take one temp array
        int[]temp = new int[arr.length];
        int idx=0;

        //To checking whether the ele is present in given array or not
        boolean flag = false;

        //Copy all elements in temp array except matched element
        for (int i=0; i< arr.length; i++) {
            if (arr[i]==ele) {
                flag=true;
                continue;
            }
            temp[idx++] = arr[i];
        }

        //Validate whether the element present in given array or not
        if (!flag) {
            System.out.println("Element not found in given array");
            return null;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = {2,4,8,12,3};
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.print("enter index/ele: ");
        int index = sc.nextInt();

        //System.out.println(Arrays.toString(removeAt(index, arr)));

        System.out.println(Arrays.toString(remove(index, arr)));
    }
}
