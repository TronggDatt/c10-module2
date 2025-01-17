package Bai3LopPointvaMoveablePoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(1, 2, 3, 4);
        System.out.println(point.toString());
        point.move();
        System.out.println(point.toString());
    }
}
