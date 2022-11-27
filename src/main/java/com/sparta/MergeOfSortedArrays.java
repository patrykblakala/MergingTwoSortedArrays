package com.sparta;

public class MergeOfSortedArrays {
    public static int[] mergeSortedArrays(int[] arrayA, int[] arrayB) {

        if (arrayA.length == 0) {
            return arrayB;
        } else if(arrayB.length == 0) {
            return
                    arrayA;
        }
        int[] mergedArray = new int[arrayA.length + arrayB.length];

        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k] = arrayA[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arrayB[j];
                j++;
                k++;
            }
        }
        while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }
        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
