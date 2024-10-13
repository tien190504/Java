package bai1;
import java.util.*;
public class ListStudent {
    private Student students[];
    private int size;

    private Scanner sc = new Scanner(System.in);

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return this.size;
    }
    public void InputList() {
        System.out.println("Enter the size of list: ");
        setSize(sc.nextInt());
        students = new Student[size];
        System.out.println("Input list student: ");
        for(int i = 0; i < size; i++) {
            students[i] = new Student();
            students[i].input();
        }
    }

    public void OutputList() {
        System.out.println("List students: ");
        System.out.println("ID\tName\tAge\tGpa");
        for (int i = 0; i < size; i++) {
            students[i].output();
        }
    }

    public void sortGPA() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (students[j].getGPA() < students[j + 1].getGPA()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }   
            }
        }
    }
      
}
