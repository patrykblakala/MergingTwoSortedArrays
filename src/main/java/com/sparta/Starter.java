package com.sparta;

import java.util.Arrays;

public class Starter {

    public static void main(String[] args) {

        int[] a = {1, 3, 5};
        int[] b = {2,4,6,7};

        int[] c = {-7,-5,-3,-1,0};
        int[] d = {-6,-4,-2,1};

        int[] e = {-1,0,1,3,7,14,25,37};
        int[] f = {-2,2,5,9,10,17,34,57,89,108};

        System.out.println(Arrays.toString(MergeOfSortedArrays.mergeSortedArrays(a, b)));
        System.out.println(Arrays.toString(MergeOfSortedArrays.mergeSortedArrays(c, d)));
        System.out.println(Arrays.toString(MergeOfSortedArrays.mergeSortedArrays(e, f)));
    }
}
