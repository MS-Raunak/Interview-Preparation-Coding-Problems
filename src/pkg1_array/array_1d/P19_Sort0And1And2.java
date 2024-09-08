package pkg1_array.array_1d;

import java.util.Arrays;

public class P19_Sort0And1And2 {
    public static void main(String[] args) {
        int[]arr={2,1,0,2,1,0,0,1,2};
        sort(arr);
    }

    private static void sort(int[] arr) {
        //Bruteforce Solution
        /*
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }*/

        //Best Approach
        int zero=0,one=0,two=0;
        for (int ele: arr){
            if (ele==0) {
                zero++;      //count total zero
            }
            else if (ele==1) {
                one++; //count total one
            }
            else  {
                two++;            // count total two
            }
        }

        int index=0;
        for (int i=0; i<zero; i++) arr[index++] = 0;
        for (int i=0; i<one; i++) arr[index++] = 1;
        for (int i=0; i<two; i++) arr[index++] = 2;

        System.out.println(Arrays.toString(arr));
    }


}
