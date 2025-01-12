import java.util.Scanner;

public class Bai8DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String chuoi = sc.nextLine();

        System.out.print("Nhap ky tu can dem: ");
        char kyTu = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua ky tu " + kyTu + " trong chuoi la: " + count);
    }
}
