package com.sreekanth;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayDuplicateItemsCount {
    public static void main(String[] args) {
        int[] arr = {1,6,2,1,3,2,4,1,3};
        TreeSet<Integer>  s = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        System.out.println(s);
        int[] arr2 = new int[s.size()];
        Iterator itr = s.iterator();
        int j = 0;
        while (itr.hasNext()){
            arr2[j] = (Integer)itr.next();
            j++;
        }
        //System.out.println(Arrays.toString(arr2));
        int[] countArray = new int[arr2.length];
        //int count;
        for (int i = 0; i < arr2.length; i++) {
            int count =0;
            for (int k = 0; k < arr.length; k++) {
                if (arr2[i] == arr[k]){
                    count++;
                }
            }
            countArray[i] = count;
        }
        //System.out.println("count"+Arrays.toString(countArray));
//        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
//        for (int i = 0; i < countArray.length; i++) {
//            treeMap.put(arr2[i],countArray[i] );
//        }
        for (int i = 0; i < countArray.length; i++) {
            System.out.println("Element "+arr2[i]+" duplicated by "+countArray[i]+" times");
        }
    }
}
