package com.basics.basic_programs;
import java.util.Scanner;
public class Assignment7 {
    //Write a program to convert from upper case to lower case and vice versa of an alphabet
    //and print the old character and new character as shown in example (Ex: a->A, M->m).
    //If Statement
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read a character from the user.
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);

            char convertedChar;

            // Check if it's an uppercase letter using ASCII values.
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase by adding 32 to the ASCII value.
                convertedChar = (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') { // Check if it is a lowercase letter using ASCII values.
                // Convert lowercase to uppercase by subtracting 32 from the ASCII value.
                convertedChar = (char) (ch - 32);
            } else {
                // If it's not an alphabet keep the character unchanged.
                convertedChar = ch;
            }

            System.out.println("Old character: " + ch);
            System.out.println("New character: " + convertedChar);

            scanner.close();
        }
    }





