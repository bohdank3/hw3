package company;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String numberPhone;
    private int age;

    public Employee(String name, String position, String email, String numberPhone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.age = age;
    }

    public  void myName() {
        System.out.println("My name is " + name + "\nPosition in work: " + position + "\nemail: " + email + "\nAge: " + age);
    }
}
