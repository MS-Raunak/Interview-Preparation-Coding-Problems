package pkg7_advance_dsa.hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Subclass or implementation class of Set.
HashSet used to insert group of objects without following insertion order.
It does not allow duplication.
It allows only one null value.
the underlying data structure is HashTable
Present in java.util package.
Introduced in jdk1.2
 */
public class P0_HashingSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        boolean hsh = set.add(40);
        System.out.println(hsh);//false, bkg id deos not allow duplicates

        //System.out.println(set);

        boolean isContain = set.contains(10);
        if (isContain) System.out.println("Set contains 10");
        else System.out.println("Set does not contain 10");

        //iterate set using iterator
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        boolean isDeleted = set.remove(40);
        if (isDeleted) System.out.println("\n40 deleted");
        else System.out.println("\n40 is not available in set");

    }
}
