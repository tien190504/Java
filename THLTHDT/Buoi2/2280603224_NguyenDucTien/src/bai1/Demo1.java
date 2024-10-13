package bai1;

public class Demo1 {
    public static void main() {
        ListStudent students = new ListStudent();
        students.InputList();
        if (students != null) {
            students.OutputList();
        }
        students.sortGPA();
        System.out.println("Sort list student  by GPA");
        students.OutputList();
    }
}
