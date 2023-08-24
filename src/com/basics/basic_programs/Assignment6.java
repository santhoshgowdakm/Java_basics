package com.basics.basic_programs;

import java.util.Scanner;

public class Assignment6 {
    //Write a program to accept gender ("Male" or "Female") and age (1-120) from command
    //line arguments and print the percentage of interest based on the given conditions.
    //Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==>
    //Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest ==
    //8.3% Gender ==> Male Age ==>61-120
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Gender");
        String Gender= sc.next();
        String gender=Gender.toLowerCase();
        System.out.println("Enter Age");
        int age= sc.nextInt();
        if((gender.equals("female")) && (age>=1 && age<=58)){
            System.out.println("Interest Rate : 8.2%");
        }
        else if ((gender.equals("female")) && (age>=59 && age<=120)){
            System.out.println("Interest Rate : 7.6%");
        }
        else if ((gender.equals("male")) && (age>=1 && age<=58)){
            System.out.println("Interest Rate : 9.2%");
        }
        else if ((gender.equals("male")) && (age>=61 && age<=120))
        {
            System.out.println("Interest Rate : 8.3%");
        }







    }
}
