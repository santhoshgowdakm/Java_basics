package com.basics.basic_programs.basic_assignments;

public class NonrepeatedChar {
    public static void main(String[] args) {
        String word="seemless";
        for(char i: word.toCharArray()){
            if(word.indexOf(i)==word.lastIndexOf(i)){
                System.out.println("First non-repeating character is: "+i);
            }
        }
    }
}
