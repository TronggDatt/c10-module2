package Bai2LopPoint2DVaLopPoint3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5.0f, 7.0f);
        System.out.println("Point2D: " + point2D.toString());

        float[] coordinates2D = new float[2];
        point2D.getXY(coordinates2D);
        System.out.println("Coordinates: " + coordinates2D[0] + ", " + coordinates2D[1]);

        Point3D point3D = new Point3D(3.0f, 4.0f, 6.0f);
        System.out.println("Point3D: " + point3D.toString());

        float[] coordinates3D = new float[3];
        point3D.getXYZ(coordinates3D);
        System.out.println("Coordinates from getXYZ: x = " + coordinates3D[0] + ", y = " + coordinates3D[1] + ", z = " + coordinates3D[2]);

        point3D.setXYZ(3.0f, 4.0f, 6.0f);
        System.out.println("Point3D: " + point3D.toString());

        point2D.setXY(3.0f, 4.0f);
        System.out.println("Point2D: " + point2D.toString());
    }
}
