import java.util.Scanner;

public class Bai2HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int numbers = input.nextInt();
        int count = 0;
        int N = 2;

        System.out.println("Các số nguyên tố là:");
        while (count < numbers) {
            if (soNguyenTo(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean soNguyenTo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
