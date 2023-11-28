package com.bridgelabz.addressbookapp;
import java.util.ArrayList;
public class AddressBook {
    String name;
    ArrayList<Person> contacts;
    AddressBook(String name)
    {
        this.name=name;
        this.contacts=new ArrayList<>();
    }

}
