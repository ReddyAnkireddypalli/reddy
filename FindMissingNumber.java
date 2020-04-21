package com.reddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {
        findMissingNumber(new int[]{1,7,4,5,9,20});
    }

    private static void findMissingNumber(int[] hello) {
        Arrays.sort(hello);
        List<Integer> list = new ArrayList<>();
        for( int i = 0; i < hello.length-1; i++){
            int x = hello[i]+1;
            while(x != hello[i+1]){
                list.add(x);
                x++;
            }
        }
        list.forEach(System.out::println);
    }

}
