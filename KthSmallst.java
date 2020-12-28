package com.dsa.array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
//https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
public class KthSmallst {
    // Function to return k'th smallest
    // element in a given array
    public static int kthSmallest(Integer[] arr,
                                  int k)
    {
        // Sort the given array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }

    // driver program
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 2;
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }
}
