import java.util.*;
public class bai9 {
    public static void main() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int n = sc.nextInt() ;
        System.out.println("Enter the column: ");
        int m = sc.nextInt();
        int a[][] = new int [n][m];
        System.out.println("Enter the matrix: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print("a[" + i  + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("\nEnter the k row: ");
        int k =  sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(i == k - 1) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println("The sum of rows k is " + sum);

    }
}
