import java.util.Scanner;

public class Bai6TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua mang: ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot cua mang: ");
        int cols = sc.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.print("Nhap thu tu cot can tinh tong (tu 0 den " + (cols - 1) + "): ");
        int column = sc.nextInt();

        if (column < 0 || column >= cols) {
            System.out.println("Thu tu cot khong hop le");
        } else {
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += array[i][column];
            }
            System.out.println("Tong cac phan tu cua cot " + column + " la " + sum);
        }
    }
}
