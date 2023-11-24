import java.util.Scanner;

public class AddressApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        AddressBook a1=new AddressBook("Book1");
        AddContact add=new AddContact();
        while (true)
        {
            System.out.println("Welcome to Address Book");
            System.out.println("Select the Choice\n 1.For Add Contact \n 2.For Display All the Contact list \n 3.For Search for a contact ");
            System.out.println("4.For Search By Phone Number \n 5.for Update a Phone Number \n 6. for Delete a user \n 0.For Exit");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    add.AddContacts(a1);
                    break;
                case 2:
                    System.out.println(a1.contacts);
                    break;
                case 3:
                    add.Search(a1);
                    break;
                case 4:
                    add.SearchByPhone(a1);
                    break;
                case 5:
                    System.out.println("Enter a Name of a person Update phone number");
                    String name=sc.next();
                    add.UpdatePhoneNo(a1,name);
                    break;
                case 6:
                    add.Delete(a1);
                    break;
                default:
                    System.out.println("Invalid Choice! Choose Correct Option");
            }
        }
    }


}
