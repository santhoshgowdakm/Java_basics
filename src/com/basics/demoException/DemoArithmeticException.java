package com.basics.demoException;

public class DemoArithmeticException {
    public static void main(String[] args) {
        int a,b,c = 0;
        a=10;
        b=0;
        try{
            c=a/b;
        }
        catch(ArithmeticException  e){
            e.getMessage();
            //System.out.println("Number can not be divided by zero");
        }
        System.out.println(c);

    }
}
