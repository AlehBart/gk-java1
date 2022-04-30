package com.geekbrains.lesson1;

public class HomeWorkApp1 {
    public static void main(String[] args) {
       printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a + b >= 0) {
            System.out.println("Cумма положительная");
        }
        else
            System.out.println("Сумма отрицательная");
                ;
        }

    private static void printColor(){
        int value = 44;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int a = 2;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    }




