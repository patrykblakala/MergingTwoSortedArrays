package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MergeOfSortedArraysTest {

@Test
@DisplayName("Given 2 sorted arrays of integers with different length method should return a merged sorted array")
public void mergeSortedArraysMethodTest_ShouldReturnMergedSortedArray() {
    int[] a = {-1,0,1,3,7,14,25,37};
    int[] b = {-2,2,5,9,10,17,34,57,89,108};
    int[] expected = {-2,-1,0,1,2,3,5,7,9,10,14,17,25,34,37,57,89,108};
    int[] result = MergeOfSortedArrays.mergeSortedArrays(a,b);
    assertTrue(Arrays.equals(expected, result));
}

    @Test
    @DisplayName("Given 2 empty arrays of integers method should return an empty array")
    public void mergeSortedArraysMethodTest_ShouldReturnEmptyArray() {
        int[] a = {};
        int[] b = {};
        int[] expected = {};
        int[] result = MergeOfSortedArrays.mergeSortedArrays(a,b);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    @DisplayName("Given 2 one element arrays of integers method should return a 2 element array")
    public void mergeSortedArraysMethodTest_ShouldReturnTwoElementArray() {
        int[] a = {7};
        int[] b = {7};
        int[] expected = {7,7};
        int[] result = MergeOfSortedArrays.mergeSortedArrays(a,b);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    @DisplayName("Given 2 arrays of  negative and positive integers method should return a sorted array")
    public void mergeSortedArraysMethodTest_ShouldReturnSortedArrayWithNegativeAndPositiveValues() {
        int[] a = {-7,-5,-3,0};
        int[] b = {-6,-4,-2,-1,1,2,3};
        int[] expected = {-7,-6,-5,-4,-3,-2,-1,0,1,2,3};
        int[] result = MergeOfSortedArrays.mergeSortedArrays(a,b);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    @DisplayName("Given 2 arrays of  same integers method should return a sorted array")
    public void mergeSortedArraysMethodTest_ShouldReturnSortedArrayWithSameValues() {
        int[] a = {8,8,8};
        int[] b = {8,8,8};
        int[] expected = {8,8,8,8,8,8};
        int[] result = MergeOfSortedArrays.mergeSortedArrays(a,b);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    @DisplayName("Given 2 arrays of integers of which 1 is empty method should return the non empty array")
    public void mergeSortedArraysMethodTest_ShouldReturnNonEmptyArray() {
        int[] a = {};
        int[] b = {1,3,5,7,9};
        int[] expected = b;
        int[] result = MergeOfSortedArrays.mergeSortedArrays(a,b);
        assertTrue(Arrays.equals(expected, result));
    }
}