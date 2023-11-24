import java.util.Scanner;

public class AddContact {
    static void AddContacts(AddressBook a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter Phone number");
        String phoneNumber = sc.next();
        sc.nextLine();
        System.out.println("Enter ZipCode");
        int zip = sc.nextInt();
        System.out.println("Enter Relation");
        String relation = sc.next();
        //person constructor
        Person p1 = new Person(fname,lname,phoneNumber,zip,relation);
        a.contacts.add(p1);
    }

    public static void Search(AddressBook a2)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name");
        String names=sc.next();
        boolean find=false;

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
                find = true;
                break;
            }
        }
        if(!find)
        {
            System.out.println("Contact Not Found !");
        }


    }
}
