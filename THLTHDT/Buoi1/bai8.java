public class bai8 {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 7, 9, 11, 65, 20, 92, 100};
        System.out.println("Mang tang dan:");
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
