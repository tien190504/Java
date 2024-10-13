package bai6;
import java.util.*;
public class Array {
    private int numElements;
    private int[] elements;
    private final int DEFAULT_SIZE = 1000;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public Array() {
        numElements = 0;
        elements = new int[DEFAULT_SIZE];
    }

    public int getNumElements() {
        return numElements;
    }

    public void setNumElements(int numElements) {
        this.numElements = numElements;
    }

    public void input() {
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }
    }

    public void output() {
        for (int i = 0; i < numElements; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public float oddAverage() {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numElements; i++) {
            if (elements[i] % 2 != 0) {
                sum += elements[i];
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return (float) sum / count;
    }

    public int findMax() {
        int max = elements[0];

        for (int i = 1; i < numElements; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }

        return max;
    }

    public void sortAscending() {
        for (int i = 0; i < numElements - 1; i++) {
            for (int j = i + 1; j < numElements; j++) {
                if (elements[i] > elements[j]) {
                    int temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }
}