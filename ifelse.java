package JAVA;

import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

public class ifelse {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.print("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.print("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.print("Weird");
            } else {
                System.out.print("Not Weird");
            }
        }
        sc.close();
    }
}
