public class bai8 {
    public static void main() {
        int[] a = {56, 5, 7, 4, 9, 100, 11, 65, 20, 92};
        System.out.println("Sorted array:");
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
