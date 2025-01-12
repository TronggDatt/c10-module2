package BTVN;

public class UserManager {
    User[] list;
    private final int limit;
    private int currentSize;

    public UserManager() {
        limit = 10;
        list = new User[limit];
        currentSize = 0;
    }

    public UserManager(int limit) {
        this.limit = limit;
        list = new User[limit];
        currentSize = 0;
    }

    public void showListUser() {
        if (currentSize == 0) {
            System.out.println("No users to display.");
            return;
        }
        System.out.println("List of users: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(list[i].toString());
        }
    }

    public void addUser(User user) {
        if (currentSize == list.length) {
            User[] newList = new User[list.length + 1];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[currentSize] = user;
        currentSize++;
    }

    public void editUser(int id, User newUser) {
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (list[i].getId() == id) {
                list[i] = newUser;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("User with id " + id + " not found.");
        }
    }

    public void removeUser(int id) {
        int removeIndex = -1;
        for (int i = 0; i < currentSize; i++) {
            if (list[i].getId() == id) {
                removeIndex = i;
                break;
            }
        }

        if (removeIndex != -1) {
            System.out.println("Invalid user id: " + id);
        } else {
            for (int i = 0; i < currentSize; i++) {
                list[i] = list[i + 1];
            }
            list[currentSize - 1] = null;
            currentSize--;
            System.out.println("User removed with id: " + id + " successfully");
        }
    }
}
