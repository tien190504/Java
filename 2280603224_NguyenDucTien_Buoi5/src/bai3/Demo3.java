package bai3;
import java.util.*;
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<HocVien> dshv = new ArrayList<>();
        ArrayList<NhanVienQuanLy> dsNVQL = new ArrayList<>();
        ArrayList<GiaoVien> dsGV = new ArrayList<>();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            Menu();
            System.out.println("Nhap lua chon cua ban:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    HocVien hv = new HocVien(); // Ensure proper initialization
                    hv.input();
                    dshv.add(hv);
                    break;
                case 2:
                    NhanVienQuanLy nv = new NhanVienQuanLy();
                    nv.input();
                    dsNVQL.add(nv);
                    break;
                case 3:
                    GiaoVien gv = new GiaoVien();
                    gv.input();
                    dsGV.add(gv);
                    break;
                case 4:
                    System.out.println("Danh sach hoc vien da nhap");
                    for(HocVien hocvien : dshv) {
                        System.out.println(hocvien);
                    }
                    break;
                case 5:
                    for (NhanVienQuanLy nvql : dsNVQL) {
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
        } while (chon != 0);
        sc.close();
    }

    public static void Menu() {
        System.out.println("-----------Menu----------");
        System.out.println("1. Nhap 1 hoc vien");
        System.out.println("2. Nhap 1 nhan vien quan ly");
        System.out.println("3. Nhap 1 giao vien");
        System.out.println("4. Xuat thong tin danh sach hoc vien");
        System.out.println("5. Xuat thong tin danh sach nhan vien quan ly");
        System.out.println("6. Xuat thong tin danh sach giao vien");
        System.out.println("0. Thoat");
        System.out.println("-----------Menu----------");
    }
}
