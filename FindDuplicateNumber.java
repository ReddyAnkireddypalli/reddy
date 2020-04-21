package com.reddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        findDuplicateNumber(new int[]{1,4,3,5,9,4,6,7,4,7});
    }

    private static void findDuplicateNumber(int[] duplicate) {

        Arrays.sort(duplicate);

        Set<Integer> list = new HashSet<>();

        for( int i = 0; i < duplicate.length-1; i++){
            if((duplicate[i])== duplicate[i+1]){
                list.add(duplicate[i+1]);
            }
        }
        list.forEach(System.out::println);
    }
}
