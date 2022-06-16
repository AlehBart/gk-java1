package com.geekbrains.lesson6;

public abstract class Animal {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void run (int distance);

    public abstract void swim (int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
