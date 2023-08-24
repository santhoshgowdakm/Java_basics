package com.basics.basic_programs;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        //Write a program to check if a given number is Positive, Negative, or Zero.
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0){
            System.out.println("Positive Number");
        }
        else if(number<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Number is Zero");
        }
    }
}
