package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Greeting App!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Greeter greeter = new Greeter(name);
        greeter.greet();

        scanner.close();
    }
}


