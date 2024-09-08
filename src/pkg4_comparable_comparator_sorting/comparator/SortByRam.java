package pkg4_comparable_comparator_sorting.comparator;

import java.util.Comparator;

public class SortByRam implements Comparator<Mobile> {
    @Override
    public int compare(Mobile m1, Mobile m2){
        return m1.ram - m2.ram;
    }
}
