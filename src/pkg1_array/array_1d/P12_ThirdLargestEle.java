package pkg1_array.array_1d;

public class P12_ThirdLargestEle {
    public static void main(String[] args) {
        int[]arr = {5,2,7,9,10,12};
        thirdMaxEle(arr);
    }

    private static void thirdMaxEle(int[] arr) {
        int max=0;
        int secMax=0;
        int thrdMax=0;

        for(int ele : arr){
            if (ele > max){
                thrdMax = secMax;
                secMax = max;
                max = ele;
            }
            else if (ele > secMax && ele < max){
                thrdMax = secMax;
                secMax = ele;
            }
            else{  //(ele > thrdMax && ele < secMax)
                thrdMax = ele;
            }
        }

        System.out.println(thrdMax);
    }
}
