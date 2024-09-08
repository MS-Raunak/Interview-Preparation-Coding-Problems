package pkg4_comparable_comparator_sorting.comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Mobile> {

    @Override
    public int compare(Mobile m1, Mobile m2) {
        return m1.brand.compareTo(m2.brand);
    }
}
