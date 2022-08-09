package com.sreekanth;

import java.util.ArrayList;
import java.util.List;

public class CandiesAndKids {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int candies = 3;
        List<Boolean> li = kidsWithCandies(arr,candies);
        System.out.println(li);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int largeNum = candies[0];
        for(int i =1;i<candies.length;i++){
            if(candies[i]>largeNum){
                largeNum = candies[i];
            }
        }
        System.out.println(largeNum);
        for(int i = 0;i<candies.length;i++){
            int sum = candies[i]+extraCandies;
            if(sum > largeNum){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
