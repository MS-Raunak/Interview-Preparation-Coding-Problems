package pkg3_recursion;

//Find max element of arr
public class P6_FindMaxEleInArr {
    public static void main(String[] args) {
        int[]arr = {1,4,6,7,12,9};
        int maxEle = findMax(arr, 0);
        System.out.println(maxEle);
    }

    private static int findMax(int[] arr, int index) {
        if(index==arr.length-1) return arr[index];
        return Math.max(arr[index], findMax(arr, index+1));
    }
}
