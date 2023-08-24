package com.basics.basic_programs;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=sc.nextInt();
        int rev=0;
        while(number!=0){
            int a=number%10;
            rev=a+rev*10;
            number=number/10;
        }
        System.out.println(rev);
    }
}
