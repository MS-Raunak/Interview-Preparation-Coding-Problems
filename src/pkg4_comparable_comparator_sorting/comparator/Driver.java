package pkg4_comparable_comparator_sorting.comparator;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Mobile m = new Mobile("Realme", 7600.0, 8);
        Mobile m2 = new Mobile("Xiomi", 6000.0, 2);
        Mobile m3 = new Mobile("Samsung", 17600.0, 6);
        Mobile m4 = new Mobile("IPhone", 19600.0, 4);

        //Using Array
        /*
        Mobile[] mobiles = {m, m2, m3, m4};

        //Sort based on mobile brand
        //Arrays.sort(mobiles, new SortByName());

        //Sort based on price
        //Arrays.sort(mobiles, new SortByPrice());

        //Sort based on RAM
        Arrays.sort(mobiles, new SortByRam());

        for (Mobile mobile : mobiles)
            System.out.println(mobile);

         */

        //Using List
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.addAll(List.of(m, m2, m3, m4));

        //Collections.sort(mobileList, new SortByName());
        //Collections.sort(mobileList, new SortByPrice());
        mobileList.sort(new SortByRam());

        mobileList.forEach(System.out::println);

    }
}
