public class bai6 {
    public static void main(String[] args) {
        Array arr = new Array();

        arr.setNumElements(5);
        arr.input();

        System.out.println("Elements in the array:");
        arr.output();

        System.out.println("Average of odd numbers: " + arr.oddAverage());

        System.out.println("Largest element: " + arr.findMax());

        arr.sortAscending();
        System.out.println("Sorted array in ascending order:");
        arr.output();
    }
}