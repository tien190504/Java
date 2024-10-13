public class haimang {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }    
    public int[] arrayPlus(int[] arr1, int[] arr2) {
        int[] result = new int[max(arr1, arr2)];
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            result[i] = arr1[i] + arr2[i];
        }
                if (arr1.length > arr2.length) {
            System.arraycopy(arr1, arr2.length, result, arr2.length, arr1.length - arr2.length);
        } else if (arr2.length > arr1.length) {
            System.arraycopy(arr2, arr1.length, result, arr1.length, arr2.length - arr1.length);
        }
        return result;
    }
    public static void main(String[] args) {
        int []a = new int[] {8, 9,7};
        int []b=new int[]{7, 6, 5};
        int []result = new arrayPlus(a, b);
        for (int i : result) {
            System.out.println(i + " ");
        }
    }
}
