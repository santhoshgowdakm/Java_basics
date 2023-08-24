package com.basics;

public class CopyConst {
    int a;
    int b;
    public CopyConst(int a, int b){
        this.a=a;
        this.b=b;
    }
    public CopyConst(CopyConst obj){
        this.a=obj.a+1;
        this.b=obj.b;
    }

    public static void main(String[] args) {
        CopyConst obj1= new CopyConst(10,20);
        CopyConst obj2= new CopyConst(obj1);
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}
