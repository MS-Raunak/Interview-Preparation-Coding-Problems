package pkg6_java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LogicalJava8 {
    public static void main(String[] args) {
        divisibleBy5OrNot(new int[]{3,5,2,10,4});
        removeDuplicateInArr();
        longestStr("Swami viveka nanda");
        findSpecificMobNums();
        convertListOfStrInUpperCase();
        convertListOfStrInUpperCaseAndJoinByComma();
        sumOfListOfEvenNums();
    }

    private static void divisibleBy5OrNot(int[] arr) {
       int[]resArr = Arrays.stream(arr).filter(e->e%5==0).toArray();
        System.out.println(Arrays.toString(resArr));
    }

    //Remove duplicate ele from int[] or str[]
    private static void removeDuplicateInArr() {
        int[]arr = {3,5,9,3,2,3,5,8};
        int[]uniqueElements = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(uniqueElements));

        //For string
        String[] array = {"apple", "banana", "apple", "orange", "banana"};
        String[] uniqueStr = Arrays.stream(array).distinct().toArray(String[]::new);
        System.out.println(Arrays.toString(uniqueStr));
    }

    //Find longest Substring
    private static void longestStr(String s) {
        String longestString = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(longestString);
    }

    //Find the specific mobile numbers which is started with +91
    private static void findSpecificMobNums() {
        List<String> mobNums = Arrays.asList(
                                "+92-87342432", "+91-7643926709",
                                "+781-67392", "+91-6792992188",
                                 "+871-67342389233", "+781-85765");
        List<String> filteredMobNums = mobNums.stream().filter(e->e.startsWith("+91")).toList();
        System.out.println(filteredMobNums);
    }

    //Convert list of strings into uppercase letter
    private static void convertListOfStrInUpperCase() {
        List<String> strList = Arrays.asList("ram", "krishna", "sita", "radha");
        //Approach-1:
        //List<String> upperCaseStr = strList.stream().map(e->e.toUpperCase()).toList();

        //Approach-2: Using method reference inside map method
        List<String> upperCaseStr = strList.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseStr);
    }

    //Convert list of strings into uppercase and join together into a single string separated by comma
    private static void convertListOfStrInUpperCaseAndJoinByComma() {
        List<String> strList = Arrays.asList("ram", "krishna", "sita", "radha");
        String upperCaseStr = strList.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(upperCaseStr);
    }

    //Find the sum of all even numbers in the list
    private static void sumOfListOfEvenNums() {
        List<Integer> nums = Arrays.asList(2,3,4,5,6);
        //Approach-1: using reduce
        //Integer sumOfEven = nums.stream().filter(e->e%2==0).reduce((a,b)->a+b).get();

        //Approach-2: Integer.sum() inside reduce
        //Integer sumOfEven = nums.stream().filter(e->e%2==0).reduce((a,b) -> Integer.sum(a,b)).get();

        //Approach-3: Using method reference inside reduce
        //Integer sumOfEven = nums.stream().filter(e->e%2==0).reduce(Integer::sum).get();

        //Approach-4: Using mapToInt
        Integer sumOfEven = nums.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfEven);
    }
}
