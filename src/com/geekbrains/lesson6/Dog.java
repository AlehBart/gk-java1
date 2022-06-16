package com.geekbrains.lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance < 500)
            System.out.println("Dog is running " + distance + " metters");
            else System.out.println(getName() + "zdoh");
    }

    @Override
    public void swim(int distance) {
        if (distance < 10)
            System.out.println("Dog" + getName() + "is swimming" + distance + "metters");
            else System.out.println(getName() + " zdoh");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
