package JAVA;

import java.util.Scanner;

public class summatrix {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        int a[][];
        n = sc.nextInt();
        m = sc.nextInt();

        a = new int[n][m];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}