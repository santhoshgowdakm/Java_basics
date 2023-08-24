package com.basics.HotelManagement;

import java.util.Arrays;

public class AccountDetails  {
    private String accountNumber;
    public AccountDetails() {
    }
    public AccountDetails(String accountNumber, String address, String phoneNumber, String emailId) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Account2{" +
                "accountNumber='" + accountNumber + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", reservaton=" + Arrays.toString(reservaton) +
                '}';
    }

    private String address;
    private String phoneNumber;
    private String emailId;
    private String reservaton[];
    public String[] getReservaton() {
        return reservaton;
    }

    public void setReservaton(String[] reservaton) {
        this.reservaton = reservaton;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
