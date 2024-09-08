package pkg1_array.array_1d;

//Create custom array's length method
public class P5_CustomArrLengthMethod {
    public static void main(String[] args) {
        int[]arr = {12, 121, 13, 151, 97};

        int len = length(arr);
        System.out.println("Length of array: " + len);
    }

    private static int length(int[] arr) {
        int lenght=0;
        for (int ele : arr) lenght++;

        return lenght;
    }
}
