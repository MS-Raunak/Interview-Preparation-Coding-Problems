package pkg1_array.array_1d;

/**
 * Program to find prime number in given array
 * EX: arr = [10,11,6,19,7]
 * OP: 11,19,7
 */
public class P2_PrimeEleInArr {

    public static void main(String[] args) {
        int[]arr = {10,11,6,19,7,1,2,3};
        for (int i=0; i< arr.length; i++) {
            if (isPrime(arr[i]))
                System.out.print(arr[i] + ", ");
        }
    }

    //Checking whether the element is prime or not
    private static boolean isPrime(int ele) {
        for (int i=2; i<=ele/2; i++) {
            if (ele%i==0)
                return false;
        }

        return true;
    }
}
