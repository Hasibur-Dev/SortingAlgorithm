package com.company;

public class InsertionSort {
    public void sort(int[] array){
        for (var i = 1; i<array.length;i++) {  //when we read the first item we'll assyme it is in the correct position so we'll start from the 2nd item
            var current = array[i];

            var j = i-1;
            while(j>=0 && array[j] > current){
                array[j+1] = array[j]; // we copy the item of the index to the right side then we decrement j
                j--;
            }
            array[j+1] = current;

        }
    }
}
