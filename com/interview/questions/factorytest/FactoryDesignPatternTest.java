package com.interview.questions.factorytest;

import com.interview.questions.Employee;

import java.util.ArrayList;
import java.util.List;

public class FactoryDesignPatternTest {

    public static void main ( String[] args ) {
        List<Employee> empList = createEmployeeList ();
        CommunicationFactory factory = new CommunicationFactory();
        Communication processor;
        for(Employee emp : empList) {
            processor = factory.getProcess(emp.getModeOfContact());
            processor.process (emp);
        }
        System.out.println ();

        empList.forEach (emp -> {
            factory.getProcess (emp.getModeOfContact ()).process (emp);
        });
    }

    private static List<Employee> createEmployeeList () {
        List<Employee> empList = new ArrayList<> ();
        Employee e1 = new Employee ("Angel", "1", "NewYork", 23, "mobile", "123@gmail.com", "+1232343453");
        Employee e2 = new Employee ("John", "2", "Washington DC", 26, "mobile", "43@gmail.com", "+1345343453");
        Employee e3 = new Employee ("Sara", "3", "NewYork", 23, "email", "123@gmail.com", "+1232343453");
        Employee e4 = new Employee ("Cleve", "4", "NewYork", 23, "mobile", "123@gmail.com", "+1232343453");
        Employee e5 = new Employee ("Mexi", "5", "NewYork", 23, "email", "123@gmail.com", "+1232343453");


        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        return empList;
    }
}
