import java.util.Scanner;

public class Bai4GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giai Phuong Trinh Bac Nhat");
        System.out.println("ax + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a : ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b : ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c : ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Phuong trinh co nghien la x = %.2f", answer);
        } else {
            if (b == c) {
                System.out.print("Phuong trinh co vo so nghiem");
            } else {
                System.out.print("Phuong trinh khong co nghiem");
            }
        }
    }
}
