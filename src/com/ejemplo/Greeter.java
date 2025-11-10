package com.example;

public class Greeter {
    private final String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, " + name + "! Hope you're having a great day.");
    }
}
