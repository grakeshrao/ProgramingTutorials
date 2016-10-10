package com.general;

import java.util.*;

/**
 * Created by rakeshg on 8/17/16.
 */
public class FindDuplicateFromListOfIntegersUsingSet {

    private static void findDuplicateFrom1toN(List<Integer> numList) {
        Set<Integer> numSet = new TreeSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        // Now add the elements from list to Set. As Set doesn't accept duplicate elements we can determine the duplicates.
        for (Integer i : numList) {
            if (!numSet.add(i)) {
                result.add(i);
            }
        }

        if (result.size() <= 0) {
            System.out.println("There are no duplicates");
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(12);
        list.add(1);
        list.add(123);
        list.add(12);
        list.add(3);

        findDuplicateFrom1toN(list);

    }

}
