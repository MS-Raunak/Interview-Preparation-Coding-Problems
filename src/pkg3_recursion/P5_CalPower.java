package pkg3_recursion;

import java.util.Scanner;

//Find power of any given number
/*
EX: 2^2 = 4
    2^3 = 8
 */
public class P5_CalPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num:"); int n = sc.nextInt();
        System.out.print("enter power value:"); int power = sc.nextInt();

        int powerOfN = calPower(n, power);
        System.out.println(powerOfN);
    }

    private static int calPower(int n, int power) {
        if (power==0) return 1;

        return n*calPower(n,power-1);
    }
}
