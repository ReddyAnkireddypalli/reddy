package com.reddy;

public class ReturnTotalMatches {

    public static void main(String[] args) {
        int[] input = {10, 15, 3, 10};
        int k = 17;

        System.out.print("Total matches: "+returnTotalMatched(input, k));
    }

    private static boolean returnTotalMatched(int[] input, int k) {

        for (int i = 0; i < input.length-1; i++) {
            for (int j = i; j < input.length-1; j++) {
                if (input[i] + input[j + 1] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
