package com.sreekanth;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] ch = {'c','d','e','f','j'};
        char target = 'e';
        System.out.println(smallestLetter(ch,target));
    }
    static char smallestLetter(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        if (start == arr.length)
            return arr[0];
        return arr[start];
    }
}
