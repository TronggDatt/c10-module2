import java.util.Scanner;

public class Bai5TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int Size = sc.nextInt();
        int[] array = new int[Size];

        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < Size; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        int giaTriNhoNhat = array[0];

        for (int i = 0; i < Size; i++) {
            if (array[i] < giaTriNhoNhat) {
                giaTriNhoNhat = array[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: " + giaTriNhoNhat);
    }
}
