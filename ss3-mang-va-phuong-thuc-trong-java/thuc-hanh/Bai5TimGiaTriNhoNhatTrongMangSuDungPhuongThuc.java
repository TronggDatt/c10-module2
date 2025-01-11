public class Bai5TimGiaTriNhoNhatTrongMangSuDungPhuongThuc {
    public static void main(String[] args) {
        int[] mang = {4, 12, 7, 8, 1, 6, 9};
        int index = giaTriNhoNhat(mang);
        System.out.println("The smallest element in the array is: " + mang[index]);
    }
    public static int giaTriNhoNhat(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
