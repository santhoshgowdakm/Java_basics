package com.basics.basic_programs;

public class Assignment3 {
    public static void main(String[] args) {
        String arg[]= new String[]{"Java", "Example","Banglore", "Mysore"};
        System.out.println(arg.length);
        if(arg.length<=1){
            System.out.println("null value");
        }
        else{
           for(int i=0; i<arg.length;i++){
               System.out.print(arg[i]+" ");
           }
        }

    }
}
