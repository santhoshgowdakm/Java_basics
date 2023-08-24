package com.basics.hotel_reservation;

import java.util.ArrayList;
import java.util.List;

public class Hotelreservation {
    public Hotelreservation(int roomNo, String userName) {
        this.roomNo = roomNo;
        this.userName = userName;
    }
    public Hotelreservation(){

    }
    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    private int roomNo;

    @Override
    public String toString() {
        return "Hotelreservation{" +
                "roomNo=" + roomNo +
                ", userName='" + userName + '\'' +
                '}';
    }

    private String userName;


   List<Account>  account = new ArrayList<>();
    List<Hotelreservation>  hotel= new ArrayList<>();

    public void addaccount(Account account){
        this.account.add(account);
    }
    public void display_account(){
      //  this.account(account);
        for(Account a: account){
            System.out.println(a);
        }
    }
   public List<Hotelreservation> addReservation(Account ac, Hotelreservation hr){
       Hotelreservation hotelreservation= new Hotelreservation(hr.getRoomNo(), ac.getPerson_Name());
       hotel.add(hotelreservation);
       for(Hotelreservation i:hotel){
           System.out.println(i);

       }
      // System.out.println(ac);
       return hotel;

   }

   public void modify_reservation(){

   }
    public void cancel_reservation(Hotelreservation hotelreservation){
        hotel.remove(hotelreservation);
        System.out.println(hotelreservation);
    }

    public void delete(Account account){
            this.account.remove(account);
        System.out.println(this.account);
    }
    public void details(){
        for(Account i: account){
            System.out.println(i);
        }
        for(Hotelreservation i: hotel){
            System.out.println(i);
        }

    }
}
