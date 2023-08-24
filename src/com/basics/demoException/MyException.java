package com.basics.demoException;

public class MyException {
    public static void main(String[] args) {
        int i=5;
        try{
            if(i<10){
                throw new DemoMyException("Errorr");
            }
        }
        catch (DemoMyException e){
            System.out.println(e);
        }
    }
}
class DemoMyException extends Exception{
    public DemoMyException(String msg){
        super(msg);
    }
}
