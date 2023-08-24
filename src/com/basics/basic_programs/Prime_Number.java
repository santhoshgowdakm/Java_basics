package com.basics.basic_programs;

import java.util.Scanner;

public class Prime_Number {
    //Write a program to check if a given number is prime or not
    //For Loop
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean s= true;
        for(int i=2;i<n; i++){
            if(n%i==0){
                s=false;
                System.out.println(i);
            }

        }
        if(s==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
