package com.bridgelabz.addressbookapp;
public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int zipcode;
    private String relation;
    private String city;

    public Person(String f_name, String l_name, String phoneNumber, int zipcode, String relation, String city)
    {
        this.firstName=f_name;
        this.lastName=l_name;
        this.phoneNumber=phoneNumber;
        this.zipcode=zipcode;
        this.relation=relation;
        this.city=city;
    }

    public String getF_name() {
        return firstName;
    }

    public String getL_name() {
        return lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return "com.bridgelabz.addressbookapp.Person{" +
                "first name='" + firstName + '\'' +
                ", last name='" + lastName + '\'' +
                ", phone no='" + phoneNumber + '\'' +
                ", zipcode=" + zipcode +
                ",City=" +city +
                ", relation='" + relation + '\'' +
                '}';
    }

}
