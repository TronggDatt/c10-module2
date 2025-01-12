package BTVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager userManager = new UserManager();
        User u1 = new User(1, "Dat1", "dat1@gmail.com", 30);
        User u2 = new User(2, "Dat2", "dat2@gmail.com", 20);
        User u3 = new User(3, "Dat3", "dat3@gmail.com", 40);
        User u4 = new User(4, "Dat4", "dat4@gmail.com", 50);
        userManager.addUser(u1);
        userManager.addUser(u2);
        userManager.addUser(u3);
        userManager.addUser(u4);
        userManager.showListUser();
        System.out.println("Enter user id want to edit: ");
        int id = sc.nextInt();
        System.out.println("Enter new id: ");
        int newId = sc.nextInt();
        System.out.println("Enter new name: ");
        String newName = sc.next();
        System.out.println("Enter new email: ");
        String newEmail = sc.next();
        System.out.println("Enter new age: ");
        int newAge = sc.nextInt();
        userManager.editUser(id, new User(newId, newName, newEmail, newAge));
        userManager.showListUser();
        System.out.println("Enter user id want to remove: ");
        int removeId = sc.nextInt();
        userManager.removeUser(removeId);
        userManager.showListUser();
    }
}
