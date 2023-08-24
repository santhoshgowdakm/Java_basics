package com.basics.basic_programs.employee_management;



public class Employee implements Comparable<Employee> {

    public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empGender = empGender;
        this.empSalary = empSalary;
    }

    private int empId;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empGender=" + empGender +
                ", empSalary=" + empSalary +
                '}';
    }

    private String empName ;
    private String empEmail ;
    char empGender;
    float empSalary;

    public String getEmpName() {
        return empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public char getEmpGender() {
        return empGender;
    }

    public float getEmpSalary() {
        return empSalary;
    }


    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Email: " + empEmail);
        System.out.println("Employee Gender: " + empGender);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println();
    }
    public int getEmpId() {
        return empId;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        if (this.empId == otherEmployee.empId) {
            return this.empName.compareTo(otherEmployee.empName);
        } else {
            return Integer.compare(this.empId, otherEmployee.empId);
        }
    }
}
