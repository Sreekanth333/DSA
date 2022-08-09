package com.sreekanth;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for(int i =1;i<arr.length;i++){
            int res =arr[i] =arr[i]+arr[i-1];
            ans[i] = res;
        }
        System.out.println(Arrays.toString(ans));
    }
}
