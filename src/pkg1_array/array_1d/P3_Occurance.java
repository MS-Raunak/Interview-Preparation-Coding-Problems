package pkg1_array.array_1d;

import java.util.HashMap;
import java.util.Map;

/**
 * Program to find max repeated element
 * arr = [12,22,35,22,54,12,22]
 * op: 22 is max repeated element(3 times)
 *
 *  * Min Repeated element in given array
 *  *  54 is the min occurrence element in {12,22,22,54,12,22}
 */

public class P3_Occurance {
    public static void main(String[] args) {
        //maxOccurrence();
        //minOccurrence();
        optimizedMaxOccurrence();
        optimizedMinOccurrence();
    }

    //Optimized min occurred element
    private static void optimizedMinOccurrence() {
        int[]arr = {12,22,35,22,54,12,22};

        int minRepeatedTimes=Integer.MAX_VALUE;
        int minRepeatedEle=0;

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer ele : arr){
            if (map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }else {
                map.put(ele,1);
            }
        }

        //Iterate map
        for (Integer ele : map.keySet()){
            if (map.get(ele) < minRepeatedTimes){
                minRepeatedTimes=map.get(ele);
                minRepeatedEle=ele;
            }
        }
        System.out.println("Min occurred ele: " + minRepeatedEle);


    }

    //Optimized max occurred element
    private static void optimizedMaxOccurrence() {
        int[]arr = {12,22,35,22,54,12,22};
        Map<Integer, Integer> map = new HashMap<>();
        int maxRepeatedTimes=0;
        int maxRepeatedEle=0;

        for (Integer ele : arr){
            if (map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else {
                map.put(ele,1);
            }
        }

        for (Integer ele : map.keySet()){
            if (maxRepeatedTimes<map.get(ele)){
                maxRepeatedTimes=map.get(ele);
                maxRepeatedEle=ele;
            }
        }
        System.out.println("Max occured ele: " + maxRepeatedEle);

    }

    //Min occurrence
    private static void maxOccurrence() {
        int[]arr = {12,22,35,22,54,12,22};
        int max = 0;
        int max_occur_ele = arr[0];

        for (int i=0; i< arr.length; i++) {
            int count=1;

            for (int j=i+1; j< arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > max) {
                max = count;
                max_occur_ele = arr[i];
            }

        }
        System.out.println(max_occur_ele + " is the max occured(repeated) element which is occured " + max + " times");
    }

    //Max occurrence
    private static void minOccurrence(){
        int[]arr = {12,22,22,54,12,22};

        int minCount = arr.length;
        int minRepeatedEle = arr[0];

        for (int i=0; i< arr.length; i++) {
            int count = 1;

            for (int j=i+1; j< arr.length; j++ ){
                if (arr[i]==arr[j])
                    count++;
            }

            if (count < minCount) {
                minRepeatedEle = arr[i];
                minCount = count;
            }
        }

        System.out.println(minRepeatedEle + " is the min repeated element, which is repeated " + minCount + " times");
    }
}
