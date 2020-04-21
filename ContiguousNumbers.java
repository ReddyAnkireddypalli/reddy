package com.reddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContiguousNumbers {
    public static void main(String[] args) {
        findContiguousNumbers(new int[]{1,3,2,6,5,9,20});
    }

    private static void findContiguousNumbers(int[] hello) {
        Arrays.sort(hello);
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> contiguousList = new HashSet<>();

        for( int i = 0; i < hello.length-1; i++){

            if((hello[i]+1) == hello[i+1]){
                contiguousList.add(hello[i]);
            }else{
                contiguousList.add(hello[i]);
                list.add(contiguousList);
            }
        }
        list.forEach(System.out::println);
    }
}
