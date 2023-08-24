package com.basics.basic_programs;

import java.util.Scanner;

public class Assignment2 {
    //Write a program to check if a given number is odd or even.
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        if(number==0){
            System.out.println("Number is zero");
        }
        else if(number%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
