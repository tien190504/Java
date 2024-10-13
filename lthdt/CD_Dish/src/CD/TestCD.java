package CD;

import java.util.*;
public class TestCD {
    public static void main(String[] args) {
        CDCollecttion cds = new CDCollecttion();
        int chose;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhap thong tin 1 cd");
            System.out.println("2. Xuat thong tin cd");
            System.out.println("3. So Luong ");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon cua ban:");
            chose = sc.nextInt();
            switch (chose) {
                case 1:
                CD cd = new CD();
                cd.input();
                cds.addCD(cd);
                break;
                case 2:
                    cds.output();
                    break;

                default:
                    break;
            }
        } while (chose != 0);
        sc.close();
        
    }
}
