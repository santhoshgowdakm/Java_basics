package com.basics.basic_programs;

import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        //Write a program to print * in Floyds format (using for and while loop)
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter a number");
        int count=1;

        while(count<=num){
            for(int i=1;i<=count;i++){
                System.out.print("* ");
            }
            System.out.println();

            count++;
        }
    }
}
