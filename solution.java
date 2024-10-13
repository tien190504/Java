package JAVA;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int query = sc.nextInt();
        for (int i = 0; i < query; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int result = a;
                result += (int) Math.pow(2, j) * b;
                System.out.println(result + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
