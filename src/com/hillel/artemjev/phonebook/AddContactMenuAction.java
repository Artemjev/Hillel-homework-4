package com.hillel.artemjev.phonebook;

import java.util.Scanner;


public class AddContactMenuAction implements MenuAction {

    private ContactsService contactsService;
    private Scanner sc;

    public AddContactMenuAction(ContactsService contactsService, Scanner sc) {
        this.contactsService = contactsService;
        this.sc = sc;
    }

    @Override
    public void doAction() {
        System.out.println("\n*********************************");
        System.out.println("Добавление контакта");
        System.out.print("Введите имя: ");
        String name = sc.nextLine();

        System.out.print("Введите телефон: ");
        String phone = sc.nextLine();

        if (!phone.matches("[0-9]+")) {
            System.out.println("Некорректно введен телефонный номер (вообще то он состоит из цифр!)");
            System.out.println("Контакт не добавлен.");
            System.out.println("*********************************");
            return;
        }

        contactsService.add(name, phone);
        System.out.println("Контакт добавлен");
        System.out.println("*********************************");
    }

    @Override
    public String getName() {
        return "Добавить контакт";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }

}


