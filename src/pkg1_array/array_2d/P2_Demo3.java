package pkg1_array.array_2d;

public class P2_Demo3 {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};

        //#### 1.Display Matrix#######
        /*for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/

        for (int[]arr : matrix){
            for (int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();

        //##### 2.Convert Row into Column vice-versa######
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();


        //#### 3.Reverse each element of every row
        for (int i=0; i< matrix.length; i++){
            for (int j=matrix[0].length-1; j>=0; j--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //#### 4.Reverse each row
        for (int i=matrix.length-1; i>=0; i--){
            for (int j=0; j< matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
