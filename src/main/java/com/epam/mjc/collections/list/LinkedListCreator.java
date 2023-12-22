package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> arr = new LinkedList<>();
        for (Integer number : sourceList) {
            if (number % 2 != 0) {
                arr.addFirst(number);
            } else {
                arr.addLast(number);
            }
        }
        return arr;
    }
}
