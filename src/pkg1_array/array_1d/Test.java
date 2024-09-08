package pkg1_array.array_1d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 7};
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] > arr[j]){
                    int tem  =arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

