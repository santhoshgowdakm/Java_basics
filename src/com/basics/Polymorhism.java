package com.basics;

class Superclass{

    public int mysupermethod(){
       int  c=30;
        return c+1;

    }
    public void mymethod(){
        System.out.println("in super class");
    }
}

class Childclass extends Superclass{
    public void mymethod(){
        System.out.println("in subclass");
    }
    public int mysupermethod(){
        int z=145;
        return z;
    }
    public void mymethod(Dem obj1){
        System.out.println(obj1.a);
        System.out.println(super.mysupermethod()); // calling method from super class using super method
    }
}
class Dem{
    int a=100;
}
public class Polymorhism {
    static {
        System.out.println("Static block"); //static block which gets executed even if you don't create object
    }
    public static void main(String[] args) {
        Superclass obj = new Childclass(); // reference of superclass and object of child class is created
        //The above code essentially allows you to use the obj reference to access the members (fields and methods) defined in the Superclass
        //  However, if the Childclass overrides any methods from the Superclass, calling those overridden methods via the obj reference will execute the child class's version of those methods.
        obj.mymethod();
        Childclass obj1 = new Childclass();
        Dem obj2= new Dem();
        obj1.mymethod(obj2);

    }

}
