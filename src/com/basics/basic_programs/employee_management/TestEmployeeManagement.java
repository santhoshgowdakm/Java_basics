package com.basics.basic_programs.employee_management;

import java.util.Iterator;

public class TestEmployeeManagement {
    public static void main(String[] args) {
        EmployeeDB emDB= new EmployeeDB();
        Employee emp1= new Employee(101,"Raj","raj@gmail.com",'M',80000);
        Employee emp2= new Employee(102,"Kumar","Kumar@gmail.com",'M',77000);
        Employee emp3= new Employee(103,"Lisa","lisa@gmail.com",'F',65000);

        emDB.addEmployee(emp1);
        emDB.addEmployee(emp2);
        emDB.addEmployee(emp3);
        System.out.println("Listing all employees using Iterator with ArrayList:");
        Iterator<Employee> arrayListIterator = emDB.getEmployeesIteratorUsingArrayList();
        while (arrayListIterator.hasNext()) {
            Employee e = arrayListIterator.next();
            e.getEmployeeDetails();
            System.out.println();
        }

        // Deleting an employee
        emDB.deleteEmployee(101);

        Employee[] employees_array = emDB.listAll();
        for (Employee e : employees_array) {
            e.getEmployeeDetails();
            System.out.println();
        }
        System.out.println(employees_array);

        // Listing all employees using Iterator with TreeSet (sorted by empId)
        System.out.println("Listing all employees using Iterator with TreeSet:");
        Iterator<Employee> treeSetIterator =emDB.employeesTreeSet.iterator();
       // Iterator<Employee> treeSetIterator = emDB.getEmployeesIteratorUsingTreeSet();
        while (treeSetIterator.hasNext()) {
            Employee e = treeSetIterator.next();
            e.getEmployeeDetails();
            System.out.println();
        }

        // Showing payslip
        System.out.println(emDB.showPaySlip(102));
    }

}
