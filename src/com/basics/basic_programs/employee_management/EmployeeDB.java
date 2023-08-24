package com.basics.basic_programs.employee_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeDB {
    public List<Employee> employeeArrayList = new ArrayList<>();
    public TreeSet<Employee> employeesTreeSet = new TreeSet<>();

    public boolean addEmployee(Employee e) {
        employeeArrayList.add(e);
        employeesTreeSet.add(e);
        return true;

    }

    public boolean deleteEmployee(int empId) {
        Iterator<Employee> iterator = employeeArrayList.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getEmpId() == empId) {
                iterator.remove();
                employeesTreeSet.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        Iterator<Employee> iterator = employeeArrayList.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getEmpId() == empId) {
                return "pay slip of " + e.getEmpId() + " is " + e.getEmpSalary();
            }

        }
        return "Employee not found.";
    }

    public Employee[] listAll() {
        Employee[] emp = new Employee[employeeArrayList.size()];
        employeeArrayList.toArray(emp);
        return emp;

    }


    public Iterator<Employee> getEmployeesIteratorUsingArrayList() {
        return employeeArrayList.iterator();
    }

    public Iterator<Employee> getEmployeesIteratorUsingTreeSet() {
        return employeesTreeSet.iterator();

    }
}
