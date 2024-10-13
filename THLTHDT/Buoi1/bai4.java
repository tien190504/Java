import java.util.*;
public class bai4 {
    public static void main(String[] agrs) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][];
        a = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(0, 50);
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
        sc.close();
    }   
}
