package com.company;

public class MergeSort {
    public void sort(int[] array){
        int size = array.length;
        if (size <2)
            return;
        int midSize = size/2;
        int[] leftHalf = new int[midSize];
        int[] rightHalf = new int[size-midSize];

        for (int i = 0; i< midSize ; i++){
            leftHalf[i] = array[i];
        }
        for (int i = midSize; i<size ; i++) {
            rightHalf[i - midSize] = array[i];
        }
        sort(leftHalf);
        sort(rightHalf);
        merge(array, leftHalf, rightHalf);
    }
    public void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while ( i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }
            else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j<rightSize){
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}

