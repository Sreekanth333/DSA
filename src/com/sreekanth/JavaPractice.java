package com.sreekanth;

import java.util.Scanner;

public class JavaPractice {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter string: ");
        String words = s.nextLine();
        String result = rotatedString(words);
        System.out.println(result);
    }
    static String rotatedString(String str){
        String[] arr = str.split(" ");

        for (int i = 0;i<2;i++){
            String temp = arr[i];
            for(int j =0;j< arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            int last= arr.length-1;
            arr[last]=temp;
            last--;

        }
        String op = "";
        for(int k =0 ;k< arr.length;k++){
            op+=arr[k]+" ";
        }
        return op;
    }
}
