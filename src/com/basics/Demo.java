package com.basics;
class SuperDemo{
    public void myprint(){
        System.out.println("show");
    }
}
public class Demo extends SuperDemo{

    public static void main(String[] args) {
        int a=8;
        String w="8";
        int b= Integer.parseInt(w);
        float c;
        double x=a;
        System.out.println(x);
        int y= (int)x+a;
        float s= (float)x+a;
        Demo obj=new Demo();
        obj.myprint();
        System.out.println(b);
        System.out.println(s);

    }

}
