package pkg4_comparable_comparator_sorting.comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator<Mobile> {
    @Override
    public int compare(Mobile m1, Mobile m2){
        return (int) (m1.price - m2.price);
    }
}
