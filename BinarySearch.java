package com.reddy;

import static java.lang.System.out;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {10,20, 40, 45, 50, 60, 80};

        out.printf("Index Value for Key = %d = %d%n", 40, findIndex(array, 0, array.length, 40));
        out.println("Index Value for Key= "+60+ " = "+ findIndex(array, 0, array.length, 60));
        out.println("Index Value for Key= "+45+ " = "+ findIndex(array, 0, 0, 50));
    }

    private static int findIndex(int[] array, int start, int end, int key) {

        if(start < end){
            int mid = start + (end-start)/2;

            if(key < array[mid]){
                return findIndex(array, start, mid, key);
            }
            if(key > array[mid]){
                return findIndex(array, mid+1, end, key);
            }
            return mid;
        }

        return -(start+1);
    }
}
