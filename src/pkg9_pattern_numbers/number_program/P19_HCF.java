package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * HCF: Highest common factor
 * the highest common number which divide the given both numbers
 * EX: HCF of 4 & 16;
 * factor of 4 = 1,2,4
 * factor of 16 = 1,2,4,16
 * so common number which divides both 4 & 16 = 4
 */
public class P19_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();

        hcf(num1, num2);
    }

    //Calculate hcf
    private static void hcf(int num1, int num2) {
        int maxNum = Math.max(num1, num2);
        int minNum = Math.min(num1, num2);
        int hcf = 0;
        for (int i=1; i<=minNum; i++){
            if (minNum%i==0 && maxNum%i==0)
                hcf=i;
        }
        System.out.println("HCF of " + num1 + " & " + num2 + " = " + hcf);
    }
}
