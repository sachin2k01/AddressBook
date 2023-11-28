package com.bridgelabz.addressbookapp;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ContactBookService
{
    public void addContacts(AddressBook a, Scanner sc) {
        System.out.println("Enter first name");
        String firstname = sc.next();
        System.out.println("Enter last name");
        String lastname = sc.next();
        System.out.println("Enter Phone number");
        String phoneNumber = sc.next();
        sc.nextLine();
        System.out.println("Enter ZipCode");
        int zip = sc.nextInt();
        System.out.println("Enter Relation");
        String relation = sc.next();
        System.out.println("Enter City");
        String city=sc.next();
        //person constructor
        Person p1 = new Person(firstname,lastname,phoneNumber,zip,relation,city);
        a.contacts.add(p1);
    }


    public void search(AddressBook a2, Scanner sc)
    {
        System.out.println("Enter First Name");
        String names=sc.next();
        boolean find = false;

        for (int i=0;i<a2.contacts.size();i++)
        {
            Person contact=a2.contacts.get(i);
            if (contact.getF_name().equalsIgnoreCase(names)) {
                System.out.println("Contact details are: ");
                System.out.println("First Name: " + contact.getF_name());
                System.out.println("Second Name: " + contact.getL_name());
                System.out.println("Mobile Number: " + contact.getPhoneNumber());
                System.out.println("Zip Number: " + contact.getZipcode());
                System.out.println("Relation is: " + contact.getRelation());
                System.out.println("City is" +contact.getCity());
                find = true;
                break;
            }
        }
        if(!find)
        {
            System.out.println("Contact Not Found !");
        }
    }

    public void searchByPhone(AddressBook A1, Scanner sc)
    {
        System.out.println("Enter a phone number to Search ");
        String phone=sc.next();
        boolean flag=false;
        for(Person p : A1.contacts)
        {
            if (p.getPhoneNumber().equalsIgnoreCase(phone))
            {
                System.out.println(p);
                flag=true;
            }
        }
        if(!flag)
        {
            System.out.println("Phone No is Not Found");
        }
    }

    public void updatePhoneNo(AddressBook a, String s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Phone Number to Update");
        String phone=sc.next();
        boolean flag=false;
        for (Person p : a.contacts)
        {
            if(p.getF_name().equalsIgnoreCase(s))
            {
                p.setPhoneNumber(phone);
                System.out.println("Phone no is Updated Successfully");
                flag=true;
            }
        }
        if(!flag)
        {
            System.out.println("Phone Number is Not Found");
        }
    }


    public void delete(AddressBook a, Scanner sc)
    {
        System.out.println("Enter a person name to delete:");
        String del = sc.next();
        boolean found = false;

        Iterator<Person> iterator = a.contacts.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getF_name().equalsIgnoreCase(del))
            {
                iterator.remove(); // Remove the current element using the iterator
                System.out.println("User deleted");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("User not found");
        }

    }

    public void sortName(AddressBook a)
    {
        a.contacts.sort(Comparator.comparing(Person::getF_name, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Sorted List Are: ");
        for (Person p: a.contacts)
        {
            System.out.println(p);
        }
    }

}
