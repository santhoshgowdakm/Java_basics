package com.basics.demoException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionExample {
    public static void main(String[] args) {
        String dateString = "2023/07/24"; // Correct format: yyyy-MM-dd

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Incorrect format

        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
