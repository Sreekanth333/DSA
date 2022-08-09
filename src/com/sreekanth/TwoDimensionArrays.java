package com.sreekanth;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0 ; row < arr.length; row++ ){
            for (int col = 0 ; col < arr.length; col++){
                arr[row][col] = in.nextInt();
            }
        }
       for(int[] el : arr){
           System.out.println(Arrays.toString(el));
       }

    }
}
