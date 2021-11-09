package com.blz.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter \n 1 To add The contact \n 2 To edit the contact \n 3 To delete the contact \n "+
                   "4. To Print the AddressBook\n 5. To Print the contacts in Address Book\n 6. To show search option\n 7.To Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.printContact();
                    break;
                case 5:
                    addressBook.searchByOptions();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the wrong input");
            }

        }
    }
}
