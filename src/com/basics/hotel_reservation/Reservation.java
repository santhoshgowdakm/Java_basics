package com.basics.hotel_reservation;

import java.io.File;
import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        String dir="C:/Users/santh/Desktop/Hello";
        File file=  new File(dir);
        file.mkdirs();

        Hotelreservation hotel= new Hotelreservation();
        Account account=new Account();
        Account ac1 = new Account("John", "john@gmail.com");
        Hotelreservation hotel1= new Hotelreservation(121,"John");
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
        while(true) {

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("i) Your account is created successfully");
                    // Call method addaccount() to add the account details.
//                    account.setPerson_emailId("john@gmail.com");
//                    account.setPerson_Name("John");
//                    System.out.println("Account Created");
                    hotel.addaccount(ac1);
                    break;
                case 2:
                    System.out.println(" ");
                    //display my account details, calling display_account function by passing arguments.
//                    System.out.println(account.getPerson_Name());
//                    System.out.println(account.getPerson_emailId());
                      hotel.display_account();
                    break;
                case 3:
                    System.out.println("Hotel reservation is done successfully");
                    //calling addReservation method by passing ac1 and hotel1
                    hotel.addReservation(ac1, hotel1);


                    break;
                case 4:
                    System.out.println("modify the reservation");
                    break;

                case 5:
                    System.out.println("Reservation cancelled");
                    hotel.cancel_reservation(hotel1);
                    break;
                case 6:
                    System.out.println("delete my account");
                    hotel.delete(ac1);

                    break;
                case 7:
                    System.out.println("show details");
                    hotel.details();
                    break;
                case 8:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println(" Thank you");
            }
        }
    }
}
