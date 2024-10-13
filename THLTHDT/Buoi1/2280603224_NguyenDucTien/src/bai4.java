import java.util.*;
public class bai4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int n = sc.nextInt();
        System.out.print("Enter the column: ");
        int m = sc.nextInt();

        int a[][];
        a = new int[n][m];
        System.out.println("Enter the matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum of matrix: " + sum);
    }   
}
