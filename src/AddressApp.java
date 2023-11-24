import java.util.Scanner;

public class AddressApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        AddressBook a1=new AddressBook("Book1");
        while (true)
        {
            System.out.println("Welcome to Address Book");
            System.out.println("Select the Choice\n 1.For Add Contact \n 2.For Display All the Contact list \n 3.For Search for a contact \n 0.For Exit");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    AddContact.AddContacts(a1);
                    break;
                case 2:
                    System.out.println(a1.contacts);
                    break;
                case 3:
                    AddContact.Search(a1);
                    break;
                default:
                    System.out.println("Invalid Choice! Choose Correct Option");
            }
        }
    }
}
