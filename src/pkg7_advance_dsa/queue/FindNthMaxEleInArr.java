package pkg7_advance_dsa.queue;

import java.util.PriorityQueue;


//Find nth largest element from an array
public class FindNthMaxEleInArr {
    public static void main(String[] args) {
        int[]arr = {3,5,2,9,7,4}; //sorted: [2,3,4,5,7,9]
        kthMaxEle(arr, 3);
    }

    private static void kthMaxEle(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int ele : arr){
            queue.add(ele);
            if (queue.size() > k){
                queue.poll();
            }
        }
        System.out.println(queue.peek());
    }
}
