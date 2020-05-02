package Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author mingyux
 */
public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private static final String modifyName = "name";
    private static final String modifyPhoneNumber = "phoneNumber";
    private static Scanner scanner = new Scanner(System.in);

    public MobilePhone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void store(Contact contact) {
        if (!isExist(contact)) {
            contacts.add(contact);
        }
    }

    private boolean isExist(Contact contact) {
        return contacts.contains(contact);
    }

    public void modify(String name, String newPhoneNumber) {

        int index = queryName(name);
        if (index != -1) {
            contacts.get(index).setPhoneNumber(newPhoneNumber);
        }
    }

    public void remove(String name) {
        int index = queryName(name);
        if (index != -1) {
            contacts.remove(index);
        }
    }

    public int queryName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contacts.indexOf(contact);
            }
        }
        return -1;
    }

    private void processCommand(int choice) {
        switch (choice) {
            //print list
            case 1: {
                contacts.forEach(e -> System.out.println(e.getName() + ", " + e.getPhoneNumber()));
                break;
            }
            //add new contract
            case 2: {
                System.out.print("input name: ");
                String name = scanner.nextLine();
                System.out.print("input phoneNumber: ");
                String phoneNumber = scanner.nextLine();
                contacts.add(new Contact(name, phoneNumber));
                break;
            }
            //update contract
            case 3: {
                System.out.println("input name: ");
                String name = scanner.nextLine();
                System.out.println("input new PhoneNumber: ");
                String phoneNumber = scanner.nextLine();
                modify(name, phoneNumber);
                break;
            }
            //remove contract
            case 4: {
                System.out.println("input name: ");
                String name = scanner.nextLine();
                remove(name);
                break;
            }
            //quit
            case 5:
            default: {
                break;
            }
        }
    }

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone(new ArrayList<>());
        ArrayList<String> menu = new ArrayList<>(5);
        menu.add("1. print list of contracts");
        menu.add("2. add new contract");
        menu.add("3. update contract");
        menu.add("4. remove contract");
        menu.add("5. quit");

        //print menu
        menu.forEach(System.out::println);
        System.out.println("input your choice:");
        //read input from user
        int choice = scanner.nextInt();
        scanner.nextLine();
        while (choice != 5) {
            mobilePhone.processCommand(choice);
            menu.forEach(System.out::println);
            System.out.println("input choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
