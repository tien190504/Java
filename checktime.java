package JAVA;
import java.util.Scanner;

public class checktime {
    public static boolean check (int h, int m) {
        return (h >= 0 && h <= 23 && m >=0 && m <= 59);
    }
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n[];
        n = new int[4];
        for(int i = 0; i < 4; i++) {
            n[i] = sc.nextInt();
        }

        int maxtime = -1;
        int maxhh = -1, maxmm = -1;

        for(int h1 = 0; h1 < 4; h1++) {
            for(int h2 = 0; h2 < 4; h2++) {
                if(h1 == h2) continue;
                for(int m1 = 0; m1 < 4; m1++) {
                    if(m1 == h1 || m1 == h2) continue;
                    int h = n[h1] * 10 + n[h2];
                    int m = n[m1] * 10 + n[6 - h1 - h2 - m1];
                    if(check(h, m) && h * 60 + m > maxtime) {
                        maxtime = h * 60 + m;
                        maxhh = h;
                        maxmm = m;
                    }
                }
            }
        }
        if(maxtime == -1) {
            System.out.println(maxtime);
        }
        else {
            if(maxhh < 10) {
                System.out.print("0" + maxhh + ":");
           } else {
                System.out.print(maxhh + ":");
           }
           if(maxmm < 10) {
            System.out.print("0" + maxmm);
            } else {
            System.out.print(maxmm);
            }
        }
        sc.close();
    }
}