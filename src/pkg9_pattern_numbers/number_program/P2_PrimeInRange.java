package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * Prime Number: The number which is divisible by either 1 or itself
 * such as: 1,2,3,5,7...
 */
public class P2_PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range a: ");
        int range_a = sc.nextInt();
        System.out.print("enter range b: ");
        int range_b = sc.nextInt();

        primeInRange(range_a, range_b);
    }

    private static void primeInRange(int rangeA, int rangeB) {
        for (int num=rangeA; num<=rangeB; num++) {
            isPrime(num);
        }
    }

    private static void isPrime(int num) {
        boolean isPrime = true;
        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " is a prime number");
        }
    }
}
