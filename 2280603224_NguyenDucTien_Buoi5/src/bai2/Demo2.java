package bai2;
import bai1.*;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        HocVien hv = new HocVien("Hutech");
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            Menu();
            System.out.println("Nhap lua chon cua ban");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    NVQL nvql = new NVQL();
                    nvql.Nhap();
                    hv.themNV(nvql);
                    break;
                case 2:
                    NVNC nvnc = new NVNC();
                    nvnc.Nhap();
                    hv.themNV(nvnc);
                    break;
                case 3:
                    NVPV nvpv = new NVPV();
                    nvpv.Nhap();
                    hv.themNV(nvpv);
                    break;
                case 4:
                    hv.hienThiDSNV();
                    break;
                case 5:
                    System.out.println("Tong luong nhan vien: " + hv.tinhTongLuongNV() + " VND");
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                default:
                    chon = 0;
                    break;
            }
        } while (chon != 0);
        sc.close();
    }

    public static void Menu() {
        System.out.println("-----------Menu----------");
        System.out.println("1. Nhap 1 nhan vien quan ly");
        System.out.println("2. Nhap 1 nhan vien nghien cuu");
        System.out.println("3. Nhap 1 nhan vien phuc vu");
        System.out.println("4. Xuat thong tin danh sach nhan vien hoc vien");
        System.out.println("5. Tong luong nhan vien");
        System.out.println("0. Thoat");
        System.out.println("-----------Menu----------");
    }
}
