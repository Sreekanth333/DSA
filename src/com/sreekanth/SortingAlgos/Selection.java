package com.sreekanth.SortingAlgos;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] array = {5,1,-3,0,-45};
        selectionSorting(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectionSorting(int[] arr){
        int start = 0;
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length-i-1;
            int max = getMax(arr,start,last);
            swapTwo(arr,max,last);
        }
    }

    private static void swapTwo(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

    public static int getMax(int[] arr,int start,int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
