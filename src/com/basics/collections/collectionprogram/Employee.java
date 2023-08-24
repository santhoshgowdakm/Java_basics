package com.basics.collections.collectionprogram;

public class Employee {

    public Employee(String ename, int eid, String email_id, int salary, String designation) {
        this.ename = ename;
        this.eid = eid;
        this.email_id = email_id;
        this.salary = salary;
        this.designation = designation;
    }


    private String ename;
    private int eid;
    private String email_id;
    private int salary;
    private String designation;

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", eid=" + eid +
                ", email_id='" + email_id + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDesignation() {
        return designation;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
