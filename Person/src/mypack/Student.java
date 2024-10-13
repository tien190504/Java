package mypack;
public class Student extends Person{
    private
    float gpa;
    String className;
    String studentID;
    public static int total = 0;
    // Constructor
    public Student(String name, int age, float height, float gpa, String className, String studentID) {
        super(name, age, height);
        this.gpa = gpa;
        this.className = className;
        this.studentID = studentID;
        total++;
    }
    public void getInfo() {
        super.getInfo();
        System.out.println("GPA: " + this.gpa);
        System.out.println("className " + this.className);
        System.out.println("Student ID: " + this.studentID);
        System.out.println();
    }
}
