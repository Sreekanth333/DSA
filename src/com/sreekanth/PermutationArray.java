package com.sreekanth;

import java.util.Arrays;

public class PermutationArray {

    public static void main(String[] args) {

        int[] num = {0,2,1,5,3,4};
        int[] ans = new int[num.length];
        for (int i =0 ; i< num.length;i++){
            ans[i] = num[num[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
