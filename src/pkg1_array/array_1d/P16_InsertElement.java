package pkg1_array.array_1d;

import java.util.Arrays;
import java.util.Scanner;

/**
 * add an element in given array at specified index
 * Example:
 * Given Array: [2, 4, 8, 12, 3]
 * enter index: 2
 * enter ele: 200
 * OP: [2, 4, 200, 8, 12, 3]
 */
public class P16_InsertElement {

    public static int[] addAt(int index, int ele, int[]arr) {
        if (index > arr.length){
            System.out.println("Index Out Of Bound");
            return null;
        }

        //take a temp array with length arr.length+1 so that we can add element
        int[]temp = new int[arr.length+1];

        //Copying all elements in temp type array
        for (int i=0; i< arr.length; i++) {
            temp[i] = arr[i];
        }

        //Shift element in right side just before the specified index value
        for (int i= temp.length-1; i>index; i--){
            temp[i] = arr[i-1];
        }
        //after shifting insert element at specified index
        temp[index] = ele;

        //return temp array
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = {2,4,8,12,3};
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.print("enter index: ");
        int index = sc.nextInt();

        System.out.print("enter ele: ");
        int ele = sc.nextInt();
        System.out.println(Arrays.toString(addAt(index, ele, arr)));
    }
}
