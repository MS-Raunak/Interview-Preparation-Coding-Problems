package pkg1_array.array_1d;

import java.util.PriorityQueue;

public class P12_KthMaxEle {
    public static void main(String[] args) {
        int[]arr = {6,2,9,12,45,4};

        kthMax(arr, 3);
    }

    private static void kthMax(int[] arr, int k) {

        /*Arrays.sort(arr);
        int count=0;

        for (int i= arr.length-1; i>=0; i--) {
            count++;

            if (count==k){
                System.out.println(arr[i]); //12
                return;
            }

        }
        */
        /* Using TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        for (int ele : arr){
            set.add(ele);
        }
        int count=1;
        for (int ele : set){
            if (count==3){
                System.out.println(ele);
                return;
            }
            count++;
        }
         */


        //Using PriorityQueue(O(nlogn)
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int ele : arr) {
            queue.add(ele);
            if (queue.size() > k) {
                queue.poll(); // Remove the smallest element, keeping only k elements in the heap
            }
        }
        System.out.println(queue.peek());

        /**
         * The PriorityQueue is a min-heap that keeps the smallest element at the top.
         * Iterate through the array, adding elements to the heap. If the heap size exceeds k, remove the smallest element.
           This ensures only the k largest elements are kept in the heap.
         */

        /**
         * Exp:
         * -Priority queue internally uses heap data structure(min heap) and heap is a binary tree
         * so, whenever we insert data in pq then smallest ele will be root node in heap.
         *
         * -  Create a priority queue (internally uses min-heap-binary tree with root node is smallest ele)
         * - Iterate over each element in the array and add element in the priority queue.
         * - If the size of the priority queue exceeds 3, remove(poll) the smallest element(root of min-heap).
         * - The root of the priority queue is now the 3rd largest element in the original array
         * - Peek returns the smallest element in the priority queue which is 3rd largest element
         *
         * Time complexity with diff approach to find kth max
         * ==================================================
         * Sorting: Simple and straightforward, O(n log n).
         * Max-Heap: Provides flexibility but O(n log n) in practice.
         * Quickselect: Average O(n), good for large datasets.
         * TreeSet: Convenient for maintaining a small set of largest elements, O(n log k).
         */
    }
}
