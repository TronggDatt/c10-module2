import java.util.Scanner;

public class Bai2TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Dat", "Nam", "Hai", "Trieu", "Dong"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}
