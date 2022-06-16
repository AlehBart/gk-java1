package com.geekbrains.lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance < 200)
        System.out.println("Cat is running " + distance + " metters");
        else System.out.println(getName() +  " zdoh");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can't swimming");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
