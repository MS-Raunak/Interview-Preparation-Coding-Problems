package pkg1_array.array_1d;

public class P1_LeastAndGreaterElement {
    public static void main(String[] args) {
        int[]arr = {30,6,11,7,99,12,76};

        minMax(arr);
    }

    private static void minMax(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=0;

        for (int i=0; i< arr.length; i++){
            if (arr[i] < min) min=arr[i];
            if (arr[i] > max) max=arr[i];
        }

        System.out.println("MIN= " + min);
        System.out.println("MAX= " + max);
    }
}
