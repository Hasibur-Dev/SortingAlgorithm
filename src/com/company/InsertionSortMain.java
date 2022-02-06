package com.company;

import java.util.Arrays;

public class InsertionSortMain {

    public static void main(String[] args) {
        int[] numbers = {3, 1, 6, 8, 5};
        var sorter = new InsertionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}