package bai3;

import bai1.HocVien;
import bai2.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo3 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DanhSachHocVien dshv = new DanhSachHocVien();
        ArrayList<GiaoVien> dsGV = new ArrayList<>();
        ArrayList<NVQuanLy> dsnvQL = new ArrayList<>();
        
        int chon;
        do {
            System.out.println("1. Nhap 1 hoc vien");
            System.out.println("2. Nhap 1 nhan vien quan ly");
            System.out.println("3. Nhap 1 giao vien");
            System.out.println("4. Xuat thong tin danh sach hoc vien");
            System.out.println("5. Xuat thong tin danh sach nhan vien quan ly");
            System.out.println("6. Xuat thong tin danh sach giao vien");
            System.out.println("0. Thoat");
            System.out.println("Lua chon cua ban:");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    HocVien hv = new HocVien(); // Ensure proper initialization
                    hv.input();
                    dshv.them1HV(hv);
                    break;
                case 2:
                    NVQuanLy nv = new NVQuanLy();
                    nv.input();
                    dsnvQL.add(nv);
                    break;
                case 3:
                    GiaoVien gv = new GiaoVien();
                    gv.input();
                    dsGV.add(gv);
                    break;
                case 4:
                    dshv.InDSHV();
                    break;
                case 5:
                    for (NVQuanLy nvql : dsnvQL) {
                        System.out.println(nvql);
                    }
                    break;
                case 6:
                    for (GiaoVien giaovien : dsGV) {
                        System.out.println(giaovien);
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            } 
        }while (chon != 0);
    }
}
