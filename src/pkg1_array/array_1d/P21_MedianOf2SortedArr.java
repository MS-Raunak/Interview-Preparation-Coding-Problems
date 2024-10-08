package pkg1_array.array_1d;

import java.util.Arrays;

public class P21_MedianOf2SortedArr {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3};
        int[]arr2 = {4,5};

        medianApproachFirst(arr1,arr2);//Bruteforce approach
        medianApproachSecond(arr1,arr2);//Bruteforce approach:enhanced
    }

    //Bruteforce Solution
    private static void medianApproachFirst(int[] arr1, int[] arr2) {
        int n1= arr1.length;
        int n2= arr2.length;

        int[]merged = new int[n1+n2];
        int idx=0;

        double median=0.0;

        //copying arr1 elements into merged array
        for (int i=0; i< n1; i++){
            merged[idx++] = arr1[i];
        }

        //copying arr2 elements into merged array
        for (int i=0; i< n2; i++){
            merged[idx++] = arr2[i];
        }

        //sorting elements of merged array
        Arrays.sort(merged);

        if (merged.length%2!=0){//when odd length
            int medianIdx=merged.length/2;
            median = merged[medianIdx];
        }
        else {//even length
            int x = (merged.length/2)-1;
            int y = (merged.length/2);
            median = (merged[x]+merged[y])/2.0;
        }

        System.out.println("Median: " + median);

    }

    //Bruteforce Solution
    private static void medianApproachSecond(int[] arr1, int[] arr2) {
        int i1=0;  //starting index of arr1
        int i2=0;  //starting index of arr2

        int[] merged = new int[arr1.length+ arr2.length];
        int mIdx=0;

        //copying arr1 and arr2 elements into the merged array in sorted order
        while (i1< arr1.length && i2< arr2.length){
            if (arr1[i1]<arr2[i2]){
                merged[mIdx++] = arr1[i1++];
            }
            else {
                merged[mIdx++] = arr2[i2++];
            }
        }
        while (i1< arr1.length) merged[mIdx++] = arr1[i1++];
        while (i2< arr2.length) merged[mIdx++] = arr2[i2++];

        double median=0.0;
        if (merged.length%2==0){//if even length
            int x = (merged.length/2)-1;
            int y = (merged.length/2);
            median = (merged[x]+merged[y])/2.0;
        }
        else {//odd length
            median=merged[merged.length/2];
        }

        System.out.println("Median: " + median);
    }
}
