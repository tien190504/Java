package JAVA;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Lớp chính phải đặt public class Main
public class Main {
    public static void main(String[] args) {
        // Đọc đầu vào từ Scanner();
        Scanner sc = new Scanner(System.in);
        // Tiếp tục hoàn thiện mã nguồn
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = i + i; j < row; j++) {
                if (compareRow(matrix[i], matrix[j]) < 0) {
                    int[] temp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = temp;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int compareRow(int[] row1, int[] row2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < row1.length; i++) {
            sum1 += row1[i];
        }

        for (int i = 0; i < row2.length; i++) {
            sum2 += row2[i];
        }

        return sum2 - sum1;
    }
}