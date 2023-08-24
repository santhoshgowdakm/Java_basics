package com.basics.basic_programs;

public class Divisible_by2_3_5 {
    //Write a program to print first 5 values which are divisible by 2, 3, and 5.
    public static void main(String[] args) {
        int count=0;
        int num=1;
        while(count<5){
            if((num%2==0) && (num%3==0)&(num%5==0))
            {
                System.out.println(num);
                count++;
            }
            num++;
        }

    }
}
