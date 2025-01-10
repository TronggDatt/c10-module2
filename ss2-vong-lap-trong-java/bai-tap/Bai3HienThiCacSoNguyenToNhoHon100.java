public class Bai3HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố từ 2 đến 100 là:");
        for (int A = 2; A <= 100; A++) {
            if (soNguyenTo(A)) {
                System.out.print(A + " ");
            }
        }
    }
    public static boolean soNguyenTo(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
