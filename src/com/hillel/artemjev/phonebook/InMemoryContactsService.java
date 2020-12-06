package com.hillel.artemjev.phonebook;

public class InMemoryContactsService implements ContactsService {

    private ContactsList contacts;

    public InMemoryContactsService() {
        contacts = new ContactsList();

//      **************************************************************
//      Для проверки
//      **************************************************************
        contacts.add(new Contact("aaa", "111"));
        contacts.add(new Contact("bbb", "222"));
        contacts.add(new Contact("ccc", "333"));
        contacts.add(new Contact("ddd", "444"));
        contacts.add(new Contact("eee", "555"));
        contacts.add(new Contact("fff", "777"));
        contacts.add(new Contact("ggg", "777"));
//      **************************************************************
    }

    @Override
    public ContactsList getAll() {
        return contacts;
    }

    @Override
    public void remove(int index) {
        contacts.remove(index);
    }

    @Override
    public void add(String name, String phone) {
        contacts.add(new Contact(name, phone));
    }
}
