package pkg1_array.array_2d;

public class P4_SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        spiral(matrix);
    }

    private static void spiral(int[][] matrix) {
        int top=0;
        int bottom= matrix.length-1;
        int left=0;
        int right = matrix[0].length-1;

        while (top<=bottom && left<=right){
            //traverse left->right
            for (int i=left; i<=right; i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            //traverse top->bottom
            for (int i=top; i<=bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            //traverse right->left
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            //traverse bottom->top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

    }
}
