package com.company;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 4,1,6};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
