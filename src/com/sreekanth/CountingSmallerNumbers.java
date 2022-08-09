package com.sreekanth;

import java.util.Arrays;
/*
    Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
*/
public class CountingSmallerNumbers {
    public static void main(String[] args) {
        int[] num = {8,1,2,2,3};
        int[] arr = smallerNumbersThanCurrent(num);
        System.out.println(Arrays.toString(arr));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int count =0;
            for(int j = 0;j<nums.length;j++){
                if(nums[j]< nums[i] && j != i){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}
