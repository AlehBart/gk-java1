package com.geekbrains.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("1.");
        sumAB(7, 5);
        System.out.println("2.");
        int c = 1;
        numberPositive(c);
        System.out.println("3.");
        int d = -5;
        checkNumber(d);
        System.out.println("4.");
        loopUA("Слава Украї́ні!", 5);
    }

    public static int sumAB(int a, int b) {
        if (a + b > 10 && a + b <= 20)
            System.out.println("true");
        else {
            System.out.println("false");
        }
        return a + b;
    }

    public static void numberPositive(int c) {
        if (c >= 0) System.out.println("Число положительное");
        else if (c < 0) System.out.println("Число отрицательное");
    }

    public static void checkNumber(int d) {
        if (d < 0)
            System.out.println("true");
        else if (d >= 0)
            System.out.println("false");
    }

    public static void loopUA(String word, int times) {
        for (int i = 0; i <= 4; i++) System.out.println(word);
    }
}

