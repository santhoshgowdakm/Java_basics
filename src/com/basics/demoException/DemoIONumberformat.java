package com.basics.demoException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//IOException When dealing with I/O operations
//Reading data from a file or stream that does not exist or is inaccessible.
// Checked Exception
// NumberFormatException-Unchecked Exception
//when a program tries to convert a string to a numeric type (like int, double, etc.), but the string does not have the appropriate format for the conversion.
public class DemoIONumberformat {
    public static void main(String[] args) {
        int i,j=1,k;
        System.out.println("Enter j value");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //creates a BufferedReader object br that wraps an InputStreamReader, which in turn,
        // reads characters from the standard input (keyboard).
        // we can use the br object to read input from the user.
        i=8;

        try{

            j=Integer.parseInt(br.readLine());
            // reads a line of text from the input source,
            // converts it into an int, and stores the resulting integer value in the variable j
            k=i/j;
            System.out.println("i is 8, k is "+k);
        }
        catch (IOException e){
            System.out.println(e.getMessage());

        }
        catch(NumberFormatException f){
            System.out.println("Enter only integer value!!");
        }
        finally{
            // Whether an exception is thrown or not, the finally block is always executed after the try block
            System.out.println("Bye");
        }

    }
}
