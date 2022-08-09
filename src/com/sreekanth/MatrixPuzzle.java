package com.sreekanth;

import java.util.Arrays;

public class MatrixPuzzle {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matrix[i][j]==0){

                }
                else
                    arr[i][j] = 1;
                /*if(i==1){
                    arr[1][j] =0;
                }
                else if(j == 1){
                    arr[i][1] =0;
                }
                else
                    arr[i][j]=1;*/
            }
        }
        for(int i = 0;i< matrix.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
