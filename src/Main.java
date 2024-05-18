import services.PhoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPhone Book Application");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter contact phone number: ");
                    String addPhoneNumber = scanner.nextLine();
                    phoneBook.addContact(addName, addPhoneNumber);
                    break;
                case 2:
                    System.out.print("Enter contact name to remove: ");
                    String removeName = scanner.nextLine();
                    phoneBook.removeContact(removeName);
                    break;
                case 3:
                    System.out.print("Enter contact name to search: ");
                    String searchName = scanner.nextLine();
                    phoneBook.searchContact(searchName);
                    break;
                case 4:
                    System.out.println("Exiting Phone Book Application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
