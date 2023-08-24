package com.basics.basic_programs;



public class Prime_10_to_99 {
    //Write a program to print prime numbers between 10 and 99.
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 to 99");
        for(int i=10; i<=99; i++){
            boolean s=true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    s=false;
                }
            }
            if(s==true){
                System.out.println(i);
            }

        }

    }
}
