package pkg9_pattern_numbers.number_program;

import java.util.Scanner;

/**
 * LCM (least common factor):
 * The least(smallest) number which is divisible by both given number
 * LCM of 2 & 4 = 4(smallest num which is divisible by both 2 & 4)
 *
 */
public class P18_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();

        lcm(num1, num2);
    }

    //Calculate LCM(least common factor)
    private static void lcm(int num1, int num2) {
        int maxNum = Math.max(num1, num2);
        int minNum = Math.min(num1, num2);

        for (int i=minNum; ; i++){
            if (i%minNum==0 && i%maxNum==0){
                System.out.println("LCM of " + num1 + " & " + num2 + " = " + i);
                break;
            }
        }
    }
}
