package bai1;
import java.util.*;

public class Student {
    private String id;
    private String name;
    private int age;
    private float gpa;

    private Scanner sc = new Scanner(System.in);
    // contructor
    public Student() {
        super();
    }
    public Student(String id, String name, int age, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    // getter setter method
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid input! Age cannot be negative.");
        } else {
            this.age = age;
        }
    }

    public float getGPA() {
        return gpa;
    }

    public void setGPA(float gpa) {
        if(gpa < 0 || gpa > 10) {
            System.out.println("Invalid input! Gpa cannot be negative.");  
        } else {
            this.gpa = gpa;
        }
    }

    public void input() {
        System.out.print("Enter student ID: ");
        this.id = sc.nextLine();
        System.out.print("Enter student name: ");
        this.name = sc.nextLine();
        System.out.print("Enter student's age: ");
        this.age = sc.nextInt();
        System.out.print("Enter student average score: ");
        this.gpa = sc.nextFloat();
    }

    public void output() {
        System.out.println(this.id + "\t" + this.name + "\t" + this.age + "\t" + this.gpa);
    }
}
