package pkg1_array.array_1d;


//Find Most Consecutive one's in given arr
public class P18_MostConsecutiveOne {
    public static void main(String[] args) {
        int[]arr={1,1,0,1,1,1,0,1,1};
        mostConsecutive(arr);
    }

    private static void mostConsecutive(int[] arr) {
        int count = 0;
        int most=0;

        for (int num : arr){
            if (num==1) {
                count++;
                most = Math.max(count, most);
            }
            else {
                count=0;
            }

        }

        System.out.println(most);
    }
}
