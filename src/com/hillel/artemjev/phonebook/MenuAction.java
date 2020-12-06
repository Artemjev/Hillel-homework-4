package com.hillel.artemjev.phonebook;

public interface MenuAction {
    void doAction();

    String getName();

    boolean closeAfter();
}
