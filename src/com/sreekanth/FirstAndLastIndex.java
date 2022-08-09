package com.sreekanth;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,7,7,8,8,10};
        int target =10;
        int[] array =firstLast(arr,target);
        System.out.println(Arrays.toString(array));
    }
    static int[] firstLast(int[] num,int target){
        int[] numb = {-1,-1};
        int start = search(num,target,true);
        int end = search(num,target,false);
        numb[0] = start;
        numb[1]=end;
        return numb;
    }
    static int search(int[] nums,int target,boolean index){
        int ans =-1;
        int start =0 ;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target > nums[mid])
                start = mid+1;
            else if(target < nums[mid])
                end = mid-1;
            else{
                ans = mid;
                if(index){
                    end =mid-1;
                }
                else
                    start=mid+1;
            }
        }
        return ans;
    }
}
