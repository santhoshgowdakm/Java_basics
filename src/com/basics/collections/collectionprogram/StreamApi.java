package com.basics.collections.collectionprogram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add( new Employee("Raj",101,"raj@gmail.com", 7000000,"Team Lead"));
        employeeList.add(new Employee("Kumar",102,"kumar@gmail.com",9000000,"Developer"));
        employeeList.add(new Employee("Puneeth",103,"appu@gmail.com", 5000000,"Team Lead"));
        employeeList.add(new Employee("Tom",104,"tom@gmail.com",3000000,"Business Analyst"));
        employeeList.add( new Employee("Lisa",105,"lisa@gmail.com", 6500000,"Devops Engineer"));
        employeeList.add(new Employee("Jane",106,"jane@gmail.com",2500000,"Team Lead"));
        // write a program to print employee emailid whose salary is less than 45l and they should hold teamlead designation
        employeeList.stream().
                filter(s->s.getSalary()>4500000)
                .filter(s -> s.getDesignation().equals("Team Lead"))
                .forEach(employee -> System.out.println(employee.getEmail_id()));

       // employeeList.stream().filter(em->em.getEname().startsWith("R")).forEach(e-> System.out.println(e.getEname()));
        // write a program to print employee name only from employee object
//        List<String>l1=employeeList.stream().map(f->f.getEname()).collect(Collectors.toList());
//        System.out.println(l1);
        // write a program  to print employee who is getting min salary
        Employee e=employeeList.stream().min((i1,i2)-> i1.getSalary()- i2.getSalary()).get();
        System.out.println("Employee who is getting min salary is: "+e.getEname()+" salary is "+e.getSalary());
        Employee e1=employeeList.stream().max((i1,i2)-> i1.getSalary()- i2.getSalary()).get();
        System.out.println("Employee who is getting max salary is: "+e1.getEname()+" salary is "+e1.getSalary());
        System.out.println("-----------------------------------------");
        Optional<Employee> myresult= employeeList.stream().sorted(Comparator.comparingInt(Employee::getEid)).findFirst();
        System.out.println(myresult);
        System.out.println("-----------------------------------------");
        List<Employee> employee = employeeList.stream()
                .sorted((o1, o2) -> o1.getEname().compareTo(o2.getEname()))
                .collect(Collectors.toList());
        System.out.println(employee);
        System.out.println("-----------------------------------------");
        Optional<Employee> myresult2 =employeeList.stream()
                .sorted(((o1, o2) -> Integer.compare(o2.getEid(), o1.getEid())))
                .findFirst();
        System.out.println(myresult2);
        System.out.println("-----------------------------------------");
        Employee myresult3 = employeeList.stream()
                .sorted(((o1, o2) -> Integer.compare(o2.getEid(), o1.getEid())))
                .collect(Collectors.toList())
                .get(employeeList.size()-2);
        System.out.println(myresult3);
        System.out.println("-----------------------------------------");
        boolean result=  employeeList.stream().anyMatch(f->f.getEname().startsWith("J"));
        System.out.println(result);

    }
}
