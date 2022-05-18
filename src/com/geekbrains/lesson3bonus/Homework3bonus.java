package com.geekbrains.lesson3bonus;

import java.util.Arrays;

public class Homework3bonus {

    public static void main(String[] args) {
        int[][] arr = new int[4][4]; //сам массив лучше генерировать вне методов - лучше передавать его в методы как параметр
        arrayTwoDimensional1(arr);
        System.out.println();
        arrayTwoDimensional2(arr);
    }

    public static int[][] arrayTwoDimensional1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                if (i == j) { //в данном случае в условии надо проверять на равенство не элементы массива, а индексы
                    arr[i][j] = 1;
                }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }

    public static int[][] arrayTwoDimensional2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                //все проверки на заполнение второй диагонали можно заменить вот таким элегантым условием
                if (i + j + 1 == arr.length) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }
}
