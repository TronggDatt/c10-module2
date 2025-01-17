package Bai2XayDungLopChiGhiTrongJava;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {}

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + classes);
    }
}
