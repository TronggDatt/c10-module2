import java.util.Scanner;

public class Bai4TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int rows = sc.nextInt();

        System.out.print("Nhap so cot cua ma tran: ");
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        double giaTriLonNhat = matrix[0][0];
        int maxrow = 0;
        int maxcol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > giaTriLonNhat) {
                    giaTriLonNhat = matrix[i][j];
                    maxrow = i;
                    maxcol = j;
                }
            }
        }
        System.out.println("Nhap cac phan tu cua ma tran: " + giaTriLonNhat);
        System.out.println("Toa do cua phan tu lon nhat la: (" + maxrow + "," + maxcol + ")");
    }
}
