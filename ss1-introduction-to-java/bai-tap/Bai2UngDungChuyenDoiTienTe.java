import java.util.Scanner;

public class Bai2UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mou ban nhap so tien USD: ");
        usd = scanner.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println("Gia tri VND: " + quyDoi);
    }
}
