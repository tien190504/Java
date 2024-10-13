package JAVA;

import java.util.Scanner;

public class student {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        int age;
        int birth;
        float gpa;
        System.out.println("ID:");
        id = sc.nextLine();
        System.out.println("Name:");
        name = sc.nextLine();
        System.out.println("Age:");
        age = sc.nextInt();
        System.err.println("Birth of day:");
        birth = sc.nextInt();
        System.out.println("average:");
        gpa = sc.nextFloat();

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birth of day: " + birth);
        System.out.println("average point: " + gpa);
        sc.close();
    }
}
