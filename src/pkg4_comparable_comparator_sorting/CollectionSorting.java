package pkg4_comparable_comparator_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
    public static void main(String[] args) {
        int[]arr = {56,12,34,89,51};

        //first approach :  using Arrays utility class sort method
         /*
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); */

        //Second approach : using Collections utility class sort method
        List<Integer> list =  new ArrayList<>();
        list.addAll(Arrays.asList(56,12,34,89,51)); //autoboxing: primitive to non-primitive
        Collections.sort(list);
        System.out.println(list);

        /**
         * Note: above sorting is applicable for only when we have set of elements which is directly
         * related to wrapper class.
         *
         * When we have our custom object like Student, Car then sorting will be done by using
         * Comparator & Comparable
         */
    }
}
