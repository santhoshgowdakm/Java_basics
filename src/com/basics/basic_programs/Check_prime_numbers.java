package com.basics.basic_programs;

import java.util.Scanner;

public class Check_prime_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();

        for(int i=2; i<=num; i++){
            boolean prime=true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    prime=false;
                    
                }

            }
            if(prime==true)
            System.out.println("prime "+i);
        }
    }
}
