package com.basics.collections.collectionprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayEvenNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        List<Integer> obj=saveEvenNumbers(n);
        printEvenNumbers(obj);
        printEvenNumber(n);
       // System.out.println(obj);

    }
    static  List<Integer> saveEvenNumbers(int N){
        List<Integer> obj = new ArrayList<>();
        for(int i=2;i<=N;i++){
            if(i%2==0){
                obj.add(i);
            }
        }
        return obj;
    }
    static  List<Integer> printEvenNumbers( List<Integer> A1){
        List<Integer> A2 = new ArrayList<>();
        for(Integer i: A1){
            A2.add(i*2);
        }
        for(Integer i: A2){
            System.out.println(i);
        }
        return A2;
    }
    static void printEvenNumber(int N){
        List<Integer> obj=saveEvenNumbers(N);
        if(obj.contains(N)){
            System.out.println("Number exits :"+N);
        }
        else{
            System.out.println("Number doesn't exits");
        }
    }
}
