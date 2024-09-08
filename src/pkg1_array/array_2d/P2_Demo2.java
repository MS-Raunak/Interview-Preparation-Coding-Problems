package pkg1_array.array_2d;

import java.util.Scanner;

public class P2_Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 2d array row size: ");
        int sizeRow = sc.nextInt();
        System.out.print("enter 2d array column size: ");
        int sizeCol = sc.nextInt();

        create2DArr(sizeRow, sizeCol);
    }

    private static void create2DArr(int rowSize, int colSize) {
        int[][]arr = new int[rowSize][colSize];

        System.out.println("\nenter " + rowSize*colSize + " elements:\n=================");
        for (int i=0; i< rowSize; i++){
            for (int j=0; j<colSize; j++){
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }

        display(arr);
        reverseByRow(arr);
        reverseByCol(arr);
    }

    private static void display(int[][] arr) {
        System.out.println("Displaying 2D array in Matrix:\n=============================");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void reverseByRow(int[][] arr) {
        System.out.println("Displaying 2D array in in reverse row wise:\n===============================");
        for (int i= arr.length-1; i>=0; i--){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void reverseByCol(int[][] arr) {
        System.out.println("Displaying 2D array in in reverse col wise:\n===============================");
        for (int i=0; i< arr.length; i++){
            for (int j=arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
