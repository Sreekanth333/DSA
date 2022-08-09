package com.sreekanth;

public class SquareRoot {
    public static void main(String[] args) {
        int ans = mySqrt(9);
        System.out.println(ans);
    }
    static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int l = 1,h=x;
        while(h>=l){
            int mid = l+(h-l)/2;
            if(mid > x/mid){
                h = mid-1;
            }else if(mid < x/mid){
                l = mid + 1;
            }else{
                return mid;
            }
        }
        return l-1;
    }
}
