package BTVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager userManager = new UserManager();
//        User u1 = new User(1, "Dat1", "dat1@gmail.com", 30);
//        User u2 = new User(2, "Dat2", "dat2@gmail.com", 20);
//        User u3 = new User(3, "Dat3", "dat3@gmail.com", 40);
//        User u4 = new User(4, "Dat4", "dat4@gmail.com", 50);
//        userManager.addUser(u1);
//        userManager.addUser(u2);
//        userManager.addUser(u3);
//        userManager.addUser(u4);
//        userManager.showListUser();
        int choice;
        while (true) {
            System.out.println("User Manager");
            System.out.println("1. Add User");
            System.out.println("2. Show list of Users");
            System.out.println("3. Edit User");
            System.out.println("4. Delete User");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            try {
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter user name: ");
                        String name = sc.next();


                        System.out.println("Enter user email: ");
                        String email = sc.next();

                        System.out.println("Enter user age: ");
                        int age = sc.nextInt();

                        User newUser = new User(id, name, email, age);
                        userManager.addUser(newUser);
                        System.out.println("User added successfully!");
                        break;

                    case 2:
                        userManager.showListUser();
                        break;

                    case 3:
                        System.out.println("Enter user id want to edit: ");
                        int editId = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter new id: ");
                        int newId = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter new name: ");
                        String newName = sc.next();

                        System.out.println("Enter new email: ");
                        String newEmail = sc.next();

                        System.out.println("Enter new age: ");
                        int newAge = sc.nextInt();

                        userManager.editUser(editId, new User(newId, newName, newEmail, newAge));
                        System.out.println("User updated successfully!");
                        break;

                    case 4:
                        System.out.println("Enter user id want to remove: ");
                        int removeId = sc.nextInt();
                        userManager.removeUser(removeId);
                        System.out.println("User removed successfully!");
                        break;

                    case 0:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid choice!");
                break;
            }
        }
    }
}
