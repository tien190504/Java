package bai5;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        student student1 = new student("", "", 0f);
        System.out.println("Enter information for the first student:");
        student1.input();

        student student2 = new student("", "", 0f);
        System.out.println("\nEnter information for the second student:");
        student2.input();

        System.out.println("\nstudent 1:");
        student1.output();

        System.out.println("\nstudent 2:");
        student2.output();

        System.out.print("\nEnter a new name for student 1: ");
        String newName = scanner.nextLine();
        student1.setName(newName);

        System.out.println("\nUpdated student 1:");
        student1.output();

        if (student2.getAvgScore() > student1.getAvgScore()) {
            System.out.printf("\nstudent 2 has a higher average score than student 1.\n");
        } else {
            System.out.printf("\nstudent 2 does not have a higher average score than student 1.\n");
        }

        scanner.close();
    }
}