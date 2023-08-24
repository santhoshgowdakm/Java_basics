package com.basics.HotelManagement;

import com.google.gson.Gson;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation");
        System.out.println("Please Choose from 1 to 7");
        System.out.println("i) create an account");
        System.out.println(" ii) display my account details(account already available)");
        System.out.println("iii) do hotel reservation");
        System.out.println(" iv) modify the reservation");
        System.out.println("v) cancel reservation");
        System.out.println("vi) delete my account");
        System.out.println("vii) show details");
        System.out.println("viii) Exit from the application");

        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 999999999;
        int account_number = rand.nextInt(upperbound)+1;
        String folder_path="C:/Users/santh/Desktop/"+account_number;
        File folder=  new File(folder_path);
        folder.mkdirs();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("accountNumber", account_number);
        String address= " Banglore";
        jsonObject.put("address", address);
        Gson gson = new Gson();

        String filePath = folder_path + "/data.json";
        try {
            File file1 = new File(filePath);
            file1.createNewFile();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(jsonObject.toString());
            fileWriter.flush();
            fileWriter.close();
            FileReader fileReader = new FileReader(filePath);
            Account person = gson.fromJson(fileReader, Account.class);


            fileReader.close();
            System.out.println(account_number);
        }
        catch(Exception ex1){

        }
        while(true) {
            Scanner sc1 = new Scanner(System.in);
            int choice = sc1.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your account is created successfully");
                    HotelReservations hotel = new HotelReservations();
                    hotel.addAccount();
                    break;
                case 2:
                    System.out.println(" Display my account details(account already available)");
                    break;
                case 3:
                    System.out.println("Do hotel reservation");
                    break;
                case 4:
                    System.out.println(" modify the reservation");
                    break;
                case 5:
                    System.out.println("cancel reservation");
                    break;
                case 6:
                    System.out.println("delete my account");
                    break;
                case 7:
                    System.out.println("show details");
                    break;
                case 8:
                    System.out.println("Exit from the application");
                    System.exit(0);

            }

        }
    }
}
