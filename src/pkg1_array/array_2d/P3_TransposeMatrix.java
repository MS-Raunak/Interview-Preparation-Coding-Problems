package pkg1_array.array_2d;

public class P3_TransposeMatrix {
    public static void main(String[] args) {
        int[][]matrix = {
                {11,22,33,44},
                {55,66,77,88},
                {99,10,11,12}
        };
        display(matrix);
        transpose(matrix);
    }

    //transpose matrix: converting col to row & vice versa
    private static void transpose(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        System.out.println("\nTranspose Matrix:\n=================");

        for (int i=0; i<colSize; i++){
            for (int j=0; j<rowSize; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }

    //display matrix
    private static void display(int[][] matrix) {
        System.out.println("2D Matrix:\n=============");
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



}
