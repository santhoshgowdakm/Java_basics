package com.basics.demoException;

public class IllegalArgumentExceptionExample {
    // Unchecked Exception
    public static void main(String[] args) {
        printAge(-5); // This will throw an IllegalArgumentException
    }

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Age: " + age);
    }
}
