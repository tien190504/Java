package JAVA;

import java.util.Scanner;

public class maxarray {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a[];
        n = sc.nextInt();
        a = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
