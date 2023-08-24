package com.basics.demoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//This exception is thrown when we try to access a file that does not exist.
// checked Exception
    public class FileNotFoundExceptionExample {
        public static void main(String[] args) {
            String fileName = "non_existent_file.txt";

            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                // Code that reads from the file
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Error occurred during I/O operation: " + e.getMessage());
            }
        }

    }


