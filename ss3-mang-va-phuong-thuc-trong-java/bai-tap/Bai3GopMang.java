import java.util.Scanner;

public class Bai3GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang 1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Nhap kich thuoc mang 2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Nhap kich thuoc mang 1: ");
        for (int i = 0; i < size1; i++) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = sc.nextInt();
        }

        System.out.println("Nhap kich thuoc mang 2: ");
        for (int i = 0; i < size2; i++) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = sc.nextInt();
        }

        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }
        System.out.println("Mang sau khi gop: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
