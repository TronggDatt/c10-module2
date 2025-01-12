package BTVN;

public class UserManager {
    User[] list;
    private final int limit;

    public UserManager() {
        limit = 0;
        list = new User[limit];
    }

    public UserManager(int limit) {
        this.limit = limit;
        list = new User[limit];
    }

    public void showListUser() {
        System.out.println("List of users: ");
        for (User user1 : list) {
            System.out.println(user1.toString());
        }
    }

    public void addUser(User user) {
        User[] newList = new User[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[list.length] = user;
        list = newList;
    }

    public void editUser(int id, User newUser) {
        boolean check = false;
        for (User user2 : list) {
            if (user2.getId() == id) {
                check = true;
                break;
            }
        }

        if (check) {
            for (int i = 0; i < list.length; i++) {
                if (list[i].getId() == id) {
                    list[i] = newUser;
                }
            }
        } else {
            System.out.println("User not found");
        }
    }

    public void removeUser(int id) {
        int removeIndex = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                removeIndex = i;
                break;
            }
        }

        if (removeIndex != -1) {
            System.out.println("Invalid user id: " + id);
        } else {
            for (int i = 0; i < list.length; i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
            System.out.println("User removed with id: " + id + " successfully");
        }
    }
}
