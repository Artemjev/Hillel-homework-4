package com.hillel.artemjev.phonebook;

public class ReadAllContactsMenuAction implements MenuAction {

    private ContactsService contactsService;

    public ReadAllContactsMenuAction(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @Override
    public void doAction() {
        System.out.println("\n*********************************");
        System.out.println("Список контактов:");
        ContactsList contacts = contactsService.getAll();

        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + 1 + ". " + contacts.get(i));
        }
        System.out.println("*********************************");
    }

    @Override
    public String getName() {
        return "Показать список";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
