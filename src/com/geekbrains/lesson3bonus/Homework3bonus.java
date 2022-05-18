package com.geekbrains.lesson3bonus;

import java.util.Arrays;

public class Homework3bonus {
    public static void main(String[] args) {
        int[][] arr = new int[4][4]; //сам массив лучше создавать тут и передавать его в методы как параметр
        arrayTwoDimensional1(arr);
        System.out.println();
        arrayTwoDimensional2(arr);
    }

    public static int[][] arrayTwoDimensional1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (i == j) { //тут надо сравнивать номера индексов, а не ячейки массива
                    arr[i][j] = 1;
                }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }

    public static int[][] arrayTwoDimensional2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j + 1 == arr.length) { //заполнить вторую диагонало можно при помощи вот такого элегантного условия
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }
}
