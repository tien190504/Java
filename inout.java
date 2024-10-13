package JAVA;

import java.util.Scanner;

public class inout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.println("Hello! I'm " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("This is my first java programing");
        sc.close();
    }
}
