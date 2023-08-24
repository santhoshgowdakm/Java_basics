package com.basics.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Students> student = new ArrayList<>();
        Students s1 = new Students(23,"Mike","CS");
        Students s2= new Students(31,"Robert","Electrical");
        Students s3= new Students(19,"James","Electronics");
        Students s4= new Students(91,"Lisa","MIS");
        Students s5= new Students(10,"Tom","Business Analytics");
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);
        
//        for(Students a:student){
//            System.out.println(a);
//        }
            for(int i=0;i<student.size();i++){
                System.out.println(student.get(i));
            }

    }
}
