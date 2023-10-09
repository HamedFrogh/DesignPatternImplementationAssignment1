package com.interview.questions;

public class Employee {
    private String name;
    private String id;
    private String city;
    private int age;
    private String modeOfContact;
    private String email;
    private String phoneNumber;

    public Employee (String name, String id, String city, int age, String modeOfContact, String email,String phoneNumber) {
        super ();
        this.name = name;
        this.id = id;
        this.city = city;
        this.age = age;
        this.modeOfContact = modeOfContact;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getModeOfContact () {
        return this.modeOfContact;
    }

    public String getName () {
        return this.name;
    }

    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public String getEmail () {
        return this.email;
    }
}
