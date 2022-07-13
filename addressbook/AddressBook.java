package addressbook;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {

        System.out.println("***** WELCOME TO ADDRESS BOOK *****");
        System.out.println();
        AddressBookService.addContact();
        AddressBookService.display();
        AddressBookService.editContact();
        AddressBookService.deleteContact();
    }
}
