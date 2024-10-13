package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    //Nguyễn Đức Tiến - 2280603224
    public static void main(String[] args) {
        ArrayList<Hinh> dsHinh = new ArrayList<>();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=====================");
            System.out.println("Chon loai hinh can nhap");
            System.out.println("1. Hinh vuong");
            System.out.println("2. Hinh chu nhat");
            System.out.println("3. Hinh tron");
            System.out.println("4. Danh sach da nhap");
            System.out.println("0. Thoat");
            System.out.println("=====================");
            System.out.println("Lua chon cua ban la:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Hinh hv = new HinhVuong();
                    hv.Nhap();
                    dsHinh.add(hv);
                    break;
                case 2:
                    Hinh hcn = new HinhCN();
                    hcn.Nhap();
                    dsHinh.add(hcn);
                    break;
                case 3:
                    Hinh ht = new HinhTron();
                    ht.Nhap();
                    dsHinh.add(ht);
                    break;
                case 4:
                    for (Hinh hinh : dsHinh) {
                        hinh.Xuat();
                        System.out.println();
                    }
                    break;
                default:
                    chon = 0;
                    break;
            }
        } while (chon != 0);
        sc.close();
    }
}
