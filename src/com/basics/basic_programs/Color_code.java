package com.basics.basic_programs;

import java.util.Scanner;

public class Color_code {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String options= sc.next();
        switch (options){
            case "R":
                System.out.println("Red");
                break;
            case "B":
                System.out.println("Blue");
                break;
            case "G":
                System.out.println("Green");
                break;

            case "O":
                System.out.println("Orange");
                break;

        }

    }
}
