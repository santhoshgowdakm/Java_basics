package com.basics.basic_programs;

import java.util.Scanner;

public class Add_sub {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char choice;

            do {
                System.out.println("Menu:");
                System.out.println("1. Add");
                System.out.println("2. Sub");
                System.out.print("Enter your choice (1 or 2): ");
                int option = scanner.nextInt();

                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                switch (option) {
                    case 1:
                        int sum = num1 + num2;
                        System.out.println("Result: " + sum);
                        break;
                    case 2:
                        int difference = num1 - num2;
                        System.out.println("Result: " + difference);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }

                System.out.print("Do you want to continue? (Y/N): ");
                choice = scanner.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');

            System.out.println("Program terminated.");
            scanner.close();
        }
    }
