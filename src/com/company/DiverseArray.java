package com.company;

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int out = 0;
        for (int i = 0; i < arr.length; i ++) {
            out += arr[i];
        }
        return out;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] out = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i ++) {
            int x = 0;
            for (int j = 0; j < arr2D[i].length; j ++) {
                x += arr2D[i][j];
            }
            out[i] = x;
        }
        return out;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] x = rowSums(arr2D);
        for (int i = 0; i < x.length - 1; i ++) {
            for (int j = i + 1; j < x.length; j ++) {
                if (x[i] == x[j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
