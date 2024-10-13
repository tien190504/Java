import java.util.*;
public class bai9 {
    public static void main(String[] agrs) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt() ;
        System.out.println("Nhap m: ");
        int m = sc.nextInt();
        int a[][] = new int [n][m];
        System.out.println("Nhap ma tran a");
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

        System.out.println("\nNhap k");
        int k =  sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(i == k - 1) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
