import java.util.Scanner;

public class Bai7MangHaiChieuTinhTongCacSoODuongCheoCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap kich thuong ma tran vuong (n x n): ");
        int n = sc.nextInt();

        double[][] matrix = new double[n][n];

        System.out.print("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tong cac phan tu tren duong cheo la: " + sum);
    }
}
