package pkg1_array.array_1d;

public class P6_MissingEle {
    public static void main(String[] args) {
        int[]arr = {1,2,3,5,6};
        missingEle(arr);
    }

    private static void missingEle(int[] arr) {
       int n = arr.length+1; //actual length including missing number
        int totalSum = (n*(n+1))/2;//sum of all natural number from 1 to n
        int arraySum = 0;
        int missing_element=0;

        for (int ele : arr){
            arraySum+=ele;
        }

        missing_element = totalSum-arraySum; //missing element

        System.out.println("Missing element: " + missing_element);

        /* Another Approach
         for (int i=0; i< arr.length-1; i++){
            if (arr[i+1] != arr[i]+1){
                System.out.println(arr[i]+1 +" is the missing element");
            }
        }
         */
    }
}
