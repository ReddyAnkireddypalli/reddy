package com.reddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        out.println(secondHighestNum());
        out.println(contiguosNumbers());

        int[] x = {0,1,2,-2,3};
        int[] y = {0,1,4, 1, 0};
        int count = 0;

       for(int i = 0; i<x.length-1; i++){

           int c = Math.abs(x[i]);
           int d = Math.abs(y[i]);

           if(c >= 1 && d <= 3){
               count++;
           }
       }
        out.println("Count "+count);

    }

    private static int secondHighestNum() {

        int[] arr = {2, 5, 4, 20, 10, 3000, 200, 1000};

        int first = Arrays.stream(arr)
                .max()
                .getAsInt();

        return Arrays.stream(arr)
                .filter(x -> x != first)
                .max()
                .getAsInt();
    }

    private static List<List<Integer>> contiguosNumbers() {
        int[] arr = {2, 5, 4, 20, 10, 3000, 200, 100};

        return  Arrays.stream(arr).sorted().mapToObj(x -> {

             int previous = 0;
             List<Integer> xx = new ArrayList<>();
             if(previous != x){
                 xx.add(x);
                 return xx;
             }
             return null;
         }).collect(Collectors.toList());

    }
}
