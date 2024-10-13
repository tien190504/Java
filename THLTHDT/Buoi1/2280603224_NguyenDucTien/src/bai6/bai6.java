package bai6;
import java.util.*;
public class bai6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Array arr = new Array();
        System.out.println("Enter the number of elements you want in array:");
        int n = sc.nextInt();
        arr.setNumElements(n);
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