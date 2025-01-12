package BTVN;

public class User {
    private int id;
    private String name;
    private String email;
    private int age;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }


    public User(int id, String name, String email, int age) {
        this.id = 0;
        this.name = "Unknown";
        this.email = "Unknown";
        this.age = 0;
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        setAge(age);
    }

    public String getInfo(){
        return "Name: " + name + "\nEmail: " + email + "\nAge: " + age;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nEmail: " + email + "\nAge: " + age;
    }
}
