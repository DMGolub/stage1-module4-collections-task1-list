package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {

    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        Integer intA = Integer.parseInt(a);
        Integer intB = Integer.parseInt(b);
        int result = func(intA).compareTo(func(intB));
        if (result == 0) {
            return a.compareTo(b);
        } else {
            return result;
        }
    }

    private Integer func(Integer x) {
        return 5 * x * x + 3;
    }
}