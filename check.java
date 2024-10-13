package JAVA;

import java.util.Scanner;

public class check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int b = sc.nextInt();

        if(n % f == 0) {
            System.out.print("F");
        }
        if(n % b == 0) {
            System.out.print("B");
        }
        else if(n % f  == 0 && n % b == 0) {
            System.out.println("FB");
        }
        else if(n % f  != 0 && n % b != 0) {
            System.out.println("NONE");
        }
        sc.close();
    }
}