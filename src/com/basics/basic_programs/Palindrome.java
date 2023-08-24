package com.basics.basic_programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int originalnum= num;
        int rev=0;
        while(num!=0) {
            int a = num % 10;
            rev = a+ rev * 10;
            num = num / 10;
        }
        System.out.println(originalnum);
        System.out.println(rev);
        if(originalnum==rev){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }

    }
}
