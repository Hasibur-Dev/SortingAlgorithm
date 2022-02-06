package com.company;

import java.util.Arrays;

public class BubbleSortMain {
        public static void main(String[] args) {
            int[] numbers = {7,4,5,2,3,1,3};
            BubbleSort he = new BubbleSort();
            he.sort(numbers);
            System.out.println(Arrays.toString(numbers));
        }
    }
