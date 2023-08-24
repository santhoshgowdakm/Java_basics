package com.basics.hotel_reservation;
    //welcome to hotel reservation
    //
    //	       please choose
    //
    //	        i) create an account
    //
    //	        ii) display my account details(account already available)
    //
    //	        iii) do hotel reservation
    //
    //	        iv) modify the reservation
    //
    //	        v) cancel reservation
    //
    //	        vi) delete my account
    //
    //	        vii) show details
    public class Account{
    public Account( String person_Name, String person_emailId) {

        this.person_Name = person_Name;
        this.person_emailId = person_emailId;
    }
    public Account()
    {

    }


    @Override
    public String toString() {
        return "Account{" +
                " person_Name='" + person_Name + '\'' +
                ", person_emailId='" + person_emailId + '\'' +
                '}';
    }


    String person_Name;
    String person_emailId;





    public String getPerson_Name() {
        return person_Name;
    }

    public void setPerson_Name(String person_Name) {
        this.person_Name = person_Name;
    }

    public String getPerson_emailId() {
        return person_emailId;
    }

    public void setPerson_emailId(String person_emailId) {
        this.person_emailId = person_emailId;
    }


}
