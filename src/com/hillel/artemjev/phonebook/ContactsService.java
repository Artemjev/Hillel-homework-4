package com.hillel.artemjev.phonebook;

public interface ContactsService {

    ContactsList getAll();

    void remove(int index);

    void add(String name, String phone);
}
