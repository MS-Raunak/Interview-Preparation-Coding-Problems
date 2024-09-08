package pkg1_array.array_2d;

public class P4_RotateMatrix90Deg {
    public static void main(String[] args) {
        int[][]matrix = {
                {11,22,33,44},
                {55,66,77,88},
                {99,10,11,12}
        };
        display(matrix);
        rotateMatrix(matrix);
        /*
        First Step:- Transpose the Matrix
        Second Step :- Reverse each array inside matrix
         */
    }

    //Rotate Matrix 90 deg
    private static void rotateMatrix(int[][] matrix) {
        matrix = transpose(matrix);
        System.out.println("\nRotated(90deg) Matrix:\n======================");
        for (int i=0; i<matrix.length; i++){
            for (int j=matrix[i].length-1; j>=0; j--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int rowSize= matrix.length;
        int colSize = matrix[0].length;
        int[][]transposeMatrix = new int[colSize][rowSize];

        for (int i=0; i< transposeMatrix.length; i++){
            for (int j=0; j<transposeMatrix[i].length; j++){
                transposeMatrix[i][j] = matrix[j][i] ;
            }
        }
        return transposeMatrix;
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
