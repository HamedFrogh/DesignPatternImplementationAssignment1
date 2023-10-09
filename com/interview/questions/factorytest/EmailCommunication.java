package com.interview.questions.factorytest;

import com.interview.questions.Employee;

public class EmailCommunication implements Communication{
    @Override
    public void process ( Employee emp ) {
        System.out.println (emp.getName() + " communicated via email : " + emp.getEmail());

    }
}
