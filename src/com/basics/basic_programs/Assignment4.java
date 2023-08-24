package com.basics.basic_programs;

public class Assignment4 {
    //Initialize two character variables in a program and display the characters in alphabetical
    //order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
    //second is e O/P:a,e
    public static void main(String[] args) {
            char first_char='z';
            char second_char='b';
            //boolean ch= first_char>second_char;
        //System.out.println(ch);
            if(second_char<first_char){
                char temp=first_char;
                first_char=second_char;
                second_char=temp;
                System.out.println(first_char+","+second_char);
            }
            else {
                System.out.println(first_char+","+second_char);
            }

    }
}
