package ContactManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagementsSystem {
    private static   ArrayList<Contact> contactArrayList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {

                System.out.println("\n *** Contact Managements System ***");
                System.out.println("1. Add Contact ");
                System.out.println("2. Display All Contact ");
                System.out.println("3. Search Contact");
                System.out.println("4. Delete Contact ");
                System.out.println("5. Exit ");
                System.out.println("6. Enter your Choice");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        addContact();
                        break;
                    case 2:
                        displayContact();
                        break;
                    case 3:
                        searchContact();
                        break;

                    case 4:
                        deleteContact();
                        break;

                    case 5:
                        System.out.println("Exiting the System!! Good Bye!!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid user Input!! Please Try Again");


                }
            }
        }
// Add Function

            //addContact
          private static void addContact(){
                System.out.println("Enter Name: ");
                String name = sc.nextLine();

                System.out.println("Enter Phone: ");
                String phoneNumber = sc.nextLine();

                System.out.println("Enter Email: ");
                String email =sc.nextLine();

                Contact contact = new Contact(name,phoneNumber,email);
                contactArrayList.add(contact);
                System.out.println("Contact added Successfully!");



            }
            //displayContact

            private static void displayContact(){
                if(contactArrayList.isEmpty()){
                    System.out.println("ContactList is Empty");
                }else
                    System.out.println("Contact List");
                for(Contact contact:contactArrayList){
                    System.out.println(contact);
                }
            }

            //searchContact by Name
            private static void searchContact(){
                System.out.println("Enter the name to search");
                String name = sc.nextLine();
                boolean found = false;

                for(Contact contact:contactArrayList){
                    if(contact.getName().equalsIgnoreCase(name)){
                        System.out.println("contact found: "+contact);
                        found = true;

                        break;
                    }

                }
                if(!found){
                    System.out.println("Name not in the Contact List"+ name);
                }

            }
            //deleteContact by name
            private static void deleteContact(){
                System.out.println("Enter the name to search");
                String name = sc.nextLine();

               boolean removed = contactArrayList.removeIf(contact -> contact.getName().equalsIgnoreCase(name));

                System.out.println("Successfully Deleted: ");

                if (removed) {
                    System.out.println("Contact deleted successfully.");
                } else {
                    System.out.println("No contact found with the name: " + name);
                }
            }

}
