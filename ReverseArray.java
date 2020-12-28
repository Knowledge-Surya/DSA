package com.dsa.array;

public class ReverseArray {
    //recursive approach
    static void reverseArray(int arr[], int start, int end) {
        int temp = 0;
        if (start >= end) {
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        //  reverseArray(arr,start+1,end-1);
        start++;
        end--;
    }

    // printArray
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "");
            System.out.print("");
        }

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.println("Reversed Array  is :");
        printArray(arr, 6);
    }
}
   /* static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
    }

    *//* Utility that prints out an array on a line *//*
    static void printArray(int arr[], int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    *//*Driver function to check for above functions*//*
    public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.println("Reversed array is ");
        printArray(arr, 6);
    }*/