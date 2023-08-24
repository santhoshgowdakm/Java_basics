package com.basics.demoException;

public class NullPointerExceptionExample {
    //This exception is thrown when a program attempts to access or call a method on an object reference that is currently set to null.
    // Unchecked Exception
    public static void main(String[] args) {
        String str = null;
        try{
            int length = str.length(); // This will throw a NullPointerException
            System.out.println("Length: " + length);
        }
        catch(NullPointerException n){
            System.out.println("Str doesn't have any value");
        }

    }
}
