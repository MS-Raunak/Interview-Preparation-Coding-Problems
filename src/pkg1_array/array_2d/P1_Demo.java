package pkg1_array.array_2d;

public class P1_Demo {
    public static void main(String[] args) {
        //create 2d array
        int[][]arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        //print value of 2d array in form of matrix using regular for loop
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===========");
        //print 2d array in form of matrix using forEach loop
        for (int[] elements : arr){
            for (int ele : elements){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }

        

    }
}
