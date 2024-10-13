package JAVA;

import java.util.Scanner;

public class xepcau {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        String s;
        while (sc.hasNext()) {
            s = sc.nextLine();
            System.out.println(i + ". " + s);
            i++;
        }
        sc.close();
    }
}
