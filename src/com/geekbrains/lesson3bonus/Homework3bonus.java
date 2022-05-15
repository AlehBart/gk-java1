package com.geekbrains.lesson3bonus;

import java.util.Arrays;

public class Homework3bonus {
    public static void main(String[] args) {
        arrayTwoDimensional1();
        System.out.println();
        arrayTwoDimensional2();
    }
    public static int[][] arrayTwoDimensional1() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
            if (arr[i] == arr[j]) {
                arr[i][j] = 1;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }
    public static int[][] arrayTwoDimensional2() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if (i == 0 & j == 3) {
                    arr[i][j] = 1;
                }
                if (i == 1 & j == 2) {
                    arr[i][j] = 1;
                }
                if (i == 2 & j == 1) {
                    arr[i][j] = 1;
                }
                if (i == 3 & j == 0) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }
}
