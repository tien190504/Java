import java.util.*;
public class bai3 {
    public static void main(String[] agrs) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();
        Random ran = new Random();
        int a[];
        int n = ran.nextInt(1, 10);
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = ran.nextInt(0, 100);
        }
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int max = 0;
        for(int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max element is " + max);   
    }
}