import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {
    String name;
    ArrayList<Person> contacts;
    AddressBook(String name)
    {
        this.name=name;
        this.contacts=new ArrayList<>();
    }

}
