package com.basics.HotelManagement;

import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
class PhoneNumberException extends Exception {
    public PhoneNumberException(String message) {
        super(message);
    }
}
public class Account1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Welcome to Hotel Reservation");
            System.out.println("Please Choose from 1 to 7");
            System.out.println("i) create an account");
            System.out.println("ii) display my account details (account already available)");
            System.out.println("iii) do hotel reservation");
            System.out.println(" iv) modify the reservation");
            System.out.println("v) cancel reservation");
            System.out.println("vi) delete my account");
            System.out.println("vii) show details");
            System.out.println("viii) Exit from the application");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()
            switch (choice) {
                case 1:
                    createAccount(sc, rand);
                    break;
                case 2:
                    System.out.println("Enter your account number: ");
                    long accountnumb = sc.nextLong();
                    displayAccountDetails(accountnumb);
                    break;
                case 3:
                    System.out.println("Do hotel reservation");
                    bookreservation(sc,rand);
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
    private static AccountDetails currentAccount;
    private static long generateAccountNumber(Random rand) {
        return 1000000000L + rand.nextInt(900000000);
    }
    private static long createAccount(Scanner sc, Random rand) {
        long accountNumber = 0;
        try {
            accountNumber = generateAccountNumber(rand);
            System.out.println("Your account number is: A" + accountNumber);
            System.out.print("Enter user address: ");
            String address = sc.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = sc.nextLine();
            if (!phoneNumber.matches("\\d{10}")) {
                throw new PhoneNumberException("Invalid phone number. Please enter a 10-digit number.");
            }
            System.out.print("Enter email id: ");
            String emailId = sc.nextLine();
            // Create JSON object and add user data
            JSONObject accountData = new JSONObject();
            // converting Java object into JSON object.
            accountData.put("accountNumber", "A" + accountNumber);
            accountData.put("address", address);
            accountData.put("phoneNumber", phoneNumber);
            accountData.put("emailId", emailId);
            accountData.put("reservation", new JSONArray());
            // Create a folder with the account number as its name
            String folderPath = "C:/Users/santh/Desktop/A" + accountNumber;
            File folder = new File(folderPath);
            folder.mkdirs();
            // Write the data to the JSON file
            String filePath = folderPath + "/A" + accountNumber + ".json";
            try (FileWriter fileWriter = new FileWriter(filePath)) {
                fileWriter.write(accountData.toJSONString());
            } catch (IOException e) {
                System.out.println("An error occurred while writing the data: " + e.getMessage());
            }
            System.out.println("Account created successfully!");
            currentAccount = new AccountDetails("A" + accountNumber, address, phoneNumber, emailId);

        } catch (PhoneNumberException e) {
            System.out.println("Invalid Phone Number, Please enter valid 10 digits phone number ");
            return -1;
        }
        System.out.println("Your account number is: A" + accountNumber);
        // Rest of your method
        return accountNumber;

    }

    private static void displayAccountDetails(long accountnum) {
        String accountNumber = String.valueOf(accountnum);
        String folderPath = "C:/Users/santh/Desktop/A" + accountNumber;
        String filePath = folderPath + "/A" + accountNumber + ".json";

        try {
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(filePath);
            //JSON data to Java objects (deserialization).
            AccountDetails accountDataFromFile = gson.fromJson(fileReader, AccountDetails.class);
            System.out.println("Account Details:");
            System.out.println(accountDataFromFile.getAccountNumber());
            System.out.println(accountDataFromFile.getAddress());
            System.out.println(accountDataFromFile.getPhoneNumber());
            System.out.println(accountDataFromFile.getEmailId());
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the account details: " + e.getMessage());
        }
    }

    public static void bookreservation(Scanner sc, Random rand) {
        System.out.println("Enter your account number");
        String accountNumberForReservation = sc.nextLine();
        long reservationNumber = generateAccountNumber(rand);
        String emailid = currentAccount.getEmailId();
        JSONObject accountData = new JSONObject();

        // Check if the account exists
        String accountFilePath = "C:/Users/santh/Desktop/A" + accountNumberForReservation + "/A" + accountNumberForReservation + ".json";
        File accountFile = new File(accountFilePath);
        if (!accountFile.exists()) {
            System.out.println("Account doesn't exist. Please create an account first.");
            return;
        }
        String reservationType;
        // Get the reservation type from the user
        System.out.println("Select reservation type:");
        System.out.println("1 : book villa");
        System.out.println("2 : book hotel");
        System.out.println("3 : book resort");

        int reservationChoice = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        switch (reservationChoice) {
            case 1:
                reservationType = "V";
                break;
            case 2:
                reservationType = "H";
                break;
            case 3:
                reservationType = "R";
                break;
            default:
                System.out.println("Invalid choice. Reservation not created.");
                return;
        }
        String folderPath = "C:/Users/santh/Desktop/A" + accountNumberForReservation;
        String filePath = folderPath + "/"+reservationType + reservationNumber + ".json";
        String accountfilepath= folderPath+"/A"+accountNumberForReservation+".json";

        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("Empty JSON file created successfully.");
            } else {
                System.out.println("File already exists or couldn't be created.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the empty JSON file: " + e.getMessage());
        }

       // to read the json file
        try {
            File file = new File(accountfilepath);
            if (!file.exists()) {
                System.out.println("Account doesn't exist. Please create an account first.");
                return;
            }

            // Load the existing JSON data from the file
            JSONParser parser = new JSONParser();

            try (FileReader fileReader = new FileReader(accountfilepath)) {
                accountData = (JSONObject) parser.parse(fileReader);
            }

            // Get the existing reservation array or create a new one if it doesn't exist
            JSONArray reservationArray = (JSONArray) accountData.get("reservation");
            if (reservationArray == null) {
                reservationArray = new JSONArray();
                accountData.put("reservation", reservationArray);
            }

            // Add the new reservation number to the array
            reservationArray.add(reservationType + reservationNumber);

            // Write the updated JSON data back to the file
            try (FileWriter fileWriter = new FileWriter(accountfilepath)) {
                fileWriter.write(accountData.toJSONString());
            }

            System.out.println("Reservation number: "+reservationType + reservationNumber);
        } catch (IOException | ParseException e) {
            System.out.println("An error occurred while processing the reservation: " + e.getMessage());
        }
            try {

                System.out.print("Enter the following details: ");
                System.out.print("Your residing town: ");
                String town = sc.next();
                System.out.print("How many rooms do you need: ");
                int room = sc.nextInt();
                System.out.print("starting date: ");
                String sdate = sc.next();
                System.out.print("How many days do you need: ");
                int n_days = sc.nextInt();
                System.out.print("Your email id: ");
                emailid= currentAccount.getEmailId();
                System.out.println(emailid);
                int base_price = 100;
                int tax = 20;
                //total price -- baseprice*noOfday he wants to stay + tax(20)
                int total_price = (base_price * n_days) + tax;
                JSONObject reservation_data = new JSONObject();
                // converting Java object into JSON object.
                reservation_data.put("Residing town ", town);
                reservation_data.put("Number of rooms ", room);
                reservation_data.put("Starting date ", sdate);
                reservation_data.put("Number of days ", n_days);
                reservation_data.put("Total price  ", total_price);
                reservation_data.put("Email id: ", emailid);
                if (reservationType.equals("H")) {
                    System.out.println("Do you have a western bathroom? (true/false)");
                    boolean hasWesternBathroom = sc.nextBoolean();
                    reservation_data.put("Has western bathroom", hasWesternBathroom);

                    System.out.println("Do you have AC? (true/false)");
                    boolean hasAC = sc.nextBoolean();
                    reservation_data.put("Has AC", hasAC);
                } else if (reservationType.equals("V")) {
                    System.out.println("Do you have a swimming pool? (true/false)");
                    boolean hasSwimmingPool = sc.nextBoolean();
                    reservation_data.put("Has swimming pool", hasSwimmingPool);

                    System.out.println("Do you have a room size more than 900? (true/false)");
                    boolean hasLargeRoom = sc.nextBoolean();
                    reservation_data.put("Has large room", hasLargeRoom);
                } else if (reservationType.equals("A")) {
                    System.out.println("Is the apartment above 4th floor? (true/false)");
                    boolean isAbove4thFloor = sc.nextBoolean();
                    reservation_data.put("Is above 4th floor", isAbove4thFloor);
                }


               try(FileWriter fileWriter = new FileWriter(filePath)) {
                   fileWriter.write(reservation_data.toJSONString());
                   System.out.println("Reservation added successfully! ");
               }
                 catch (IOException e) {
                    System.out.println("An error occurred while writing the data: " + e.getMessage());
                }
            }
            catch (InputMismatchException f){
                System.out.println(f.getMessage());
            }




    }

    }

