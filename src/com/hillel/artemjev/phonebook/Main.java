package com.hillel.artemjev.phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContactsService contactsService = new InMemoryContactsService();
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu(sc);
        menu.addAction(new ReadAllContactsMenuAction(contactsService));
        menu.addAction(new AddContactMenuAction(contactsService, sc));
        menu.addAction(new RemoveContactMenuAction(contactsService, sc));
        menu.addAction(new ExitMenuAction());
        menu.run();

    }

}
