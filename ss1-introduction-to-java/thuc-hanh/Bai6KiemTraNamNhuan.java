import java.util.Scanner;

public class Bai6KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam muon xem: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " la nam nhuan ");
                } else {
                    System.out.println(year + " khong phai la nam nhuan");
                }
            } else {
                System.out.println(year + " la nam nhuan ");
            }
        } else {
            System.out.println(year + " khong phai la nam nhuan");
        }
    }
}
