package com.hillel.artemjev.phonebook;

import java.util.Arrays;
import java.util.Scanner;


public class Menu {
    private MenuAction[] actions = new MenuAction[0];
    private Scanner sc;

    public Menu(Scanner scanner) {
        this.sc = scanner;
    }

    public void addAction(MenuAction action) {
        actions = Arrays.copyOf(actions, actions.length + 1);
        actions[actions.length - 1] = action;
    }

    public void run() {
        while (true) {
            System.out.println("\nВыберете пункт меню:");
            for (int i = 0; i < actions.length; i++) {
                System.out.print((i + 1) + " - ");
                System.out.println(actions[i].getName());
            }
            int index = readChoice() - 1;
            actions[index].doAction();
            if (actions[index].closeAfter()) break;
        }
    }

    //-----------------------------------------------------------------------------------------------
    private int readChoice() {
        int choice;
        while (true) {
            System.out.print("\nEnter your choice: ");
            choice = readInteger();
            if (choice > actions.length || choice <= 0)
                System.out.printf("Значение должно быть от 1 до %d.\n", actions.length);
            else break;
        }
        return choice;
    }

    private int readInteger() {
        while (!sc.hasNextInt()) {
            System.out.println("Значение должно быть целым числом.");
            sc.nextLine();
            System.out.print("\nEnter your choice: ");
        }
        int i = sc.nextInt();
        sc.nextLine();
        return i;
    }

}