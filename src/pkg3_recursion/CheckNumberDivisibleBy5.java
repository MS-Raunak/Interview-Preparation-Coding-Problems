package pkg3_recursion;

public class CheckNumberDivisibleBy5 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,8,9,10};
        divisible(arr, 0);
    }

    private static void divisible(int[] arr, int index) {
        if (index >= arr.length) return;

        if (arr[index]%5==0){
            System.out.println(arr[index] + " is divisible by 5");
        }

        divisible(arr, index+1);
    }
}
