package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Prime Number: The number which is divisible by either 1 or itself
 * such as: 1,2,3,5,7...
 */
public class P1_PrimeNum {
    public static void main(String[] args) {
        System.out.print("enter number:");
        int num = new Scanner(System.in).nextInt();

        checkPrime(num);
    }

    private static void checkPrime(int num) {
        boolean isPrime = true;

        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)  System.out.println(num + " is a prime number");
        else          System.out.println(num + " is not a prime number");
    }
}
