import java.util.Scanner;

public class Bai2ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int N = sc.nextInt();
        int[] array = new int[N + 1];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Nhap gia tri can chen: ");
        int X = sc.nextInt();

        System.out.print("Nhap vi tri can chen: ");
        int index = sc.nextInt();

        if (index < 0 || index > N) {
            System.out.println("Khong the chen phan tu vao vi tri nay");
        } else {
            for (int i = N; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;

            System.out.println("mang sau khi chen phan tu: ");
            for (int i = 0; i <= N; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
