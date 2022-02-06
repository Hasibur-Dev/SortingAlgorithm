package com.company;

import java.util.Arrays;

public class MergeSortMain {
    public static void main(String[] args) {
        int[] array = {5,1,7,3,3,6,32,54};
        MergeSort mergSort = new MergeSort();
        mergSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
