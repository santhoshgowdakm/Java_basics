package com.basics.demoException;

public class DemoArrayIndex {
    // ArrayIndexOutOfBoundsException--- Unchecked Exception
    // Arithmetic Exception--- Checked Exception

    public static void main(String[] args) {
        int b,c,d=0;
        b=10;
        c=0;
        int num[]=new int [4];
        try{
            d=b/c;

            for (int i = 0; i <=4; i++){

                num[i]=num[i]+1;
                System.out.println("The numbers are : "+num[i]);
            }
            for(int value: num){
                System.out.println(num[value]);
            }
        }
        catch (ArithmeticException f){
            System.out.println(f.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println(d);



    }
}
