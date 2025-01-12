import java.util.Scanner;

public class Bai1XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int N = sc.nextInt();
        int[] array = new int[N];

        System.out.print("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Nhap phan tu can xoa: ");
        int X = sc.nextInt();

        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Phan tu " + X + " khong ton tai trong mang");
        } else {
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--;
        }
        System.out.println("Mang sau khi bi xoa phan tu " + X + " la: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
