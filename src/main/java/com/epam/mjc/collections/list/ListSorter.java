package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int valueA = 5 * numA * numA + 3;
        int valueB = 5 * numB * numB + 3;

        // First compare based on formula result
        int formulaComparison = Integer.compare(valueA, valueB);
        if (formulaComparison != 0) {
            return formulaComparison;
        }

        // If formula results are the same, compare by original values
        return Integer.compare(numA, numB);
    }
}
