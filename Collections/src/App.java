import java.util.*;

public class App {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Collections.sort(arr);
        for (int i : arr) {
            System.out.println(arr);
        }
    }
}