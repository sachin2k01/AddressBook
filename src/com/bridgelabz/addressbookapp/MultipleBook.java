package com.bridgelabz.addressbookapp;
import java.util.Scanner;
public class MultipleBook
{
    ContactBookService add=new ContactBookService();
    public void function(AddressBook a1, String menu)
    {
        Scanner sc=new Scanner(System.in);
        int n=1;
        while (n!=0) {
            System.out.println("Welcome to Address Book");
            System.out.println(menu);
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    add.addContacts(a1, sc);
                    break;
                case 2:
                    System.out.println(a1.contacts);
                    break;
                case 3:
                    add.search(a1, sc);
                    break;
                case 4:
                    add.searchByPhone(a1, sc);
                    break;
                case 5:
                    System.out.println("Enter a Name of a person Update phone number");
                    String name = sc.next();
                    add.updatePhoneNo(a1, name);
                    break;
                case 6:
                    add.delete(a1, sc);
                    break;
                case 7:
                    add.sortName(a1);
                    break;
                default:
                    System.out.println("Invalid Choice! Choose Correct Option");
            }
            System.out.println("Enter 0 To Exit");
            n=sc.nextInt();
        }
    }
    public void cityContact(AddressBook a, String city)
    {
        for (Person p: a.contacts)
        {
            if (city.equalsIgnoreCase(p.getCity()))
            {
                System.out.println(a.name+ " "+p);
            }
        }
    }

    public int countCity(AddressBook a2, String cit)
    {
        int count=0;
        for (Person p: a2.contacts)
        {
            if (cit.equalsIgnoreCase(p.getCity()))
            {
                count++;
            }
        }
        return count;
    }
}
