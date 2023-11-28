package com.bridgelabz.addressbookapp;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MultipleBook fun=new MultipleBook();
        ArrayList<AddressBook> Abook = new ArrayList<>();
        String menu = "Press \n1:Adding A contact\n2: Displaying All Contact\n3: Search by first name\n4: Search by Phone number\n5: Delete by USer First name\n6: Update phone Number\n 7:For Sort based on Name";
        AddressBook a = new AddressBook("Book1");
        AddressBook b = new AddressBook("Book2");
        AddressBook c = new AddressBook("Book3");
        Abook.add(a);
        Abook.add(b);
        Abook.add(c);
        int S=1;
        do {
            System.out.println("1 : Select Address Book\n2: Display all the address book\n3:Find all contacts of a city\n4.to find how many contact in city \n0.for Exit");
            int inp = sc.nextInt();
            switch (inp)
            {
                case 1:
                    System.out.println("Enter the Name of the Book You Want");
                    String bname=sc.next();
                    for (AddressBook a1: Abook)
                    {
                        if (a1.name.equalsIgnoreCase(bname))
                        {
                            fun.function(a1,menu);
                        }
                    }
                    break;
                case 2: {
                    for (AddressBook a2 : Abook) {
                        System.out.println(a2.name + " " + a2.contacts);
                    }
                }
                break;
                case 3:
                    System.out.println("Enter the city Name");
                    String city=sc.next();
                    for (AddressBook a2:Abook)
                    {
                        fun.cityContact(a2,city);
                    }
                    break;
                case 4:
                    System.out.println("Enter the city Name");
                    String cit=sc.next();
                    for (AddressBook a2:Abook)
                    {
                        int res=fun.countCity(a2,cit);
                        System.out.println(cit+" Found in contacts "+res+ " Times in Book "+c.name );
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Press 0 For EXIT");
            S=sc.nextInt();
        }while (S!=0);
    }
}
