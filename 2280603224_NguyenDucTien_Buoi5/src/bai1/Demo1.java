package bai1;
import java.util.*;
public class Demo1 {
    

    public static void main(String[] args) {
        NhanVien nvql = new NVQL();
        NhanVien nvnc = new NVNC();
        NhanVien nvpv = new NVPV();

        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            Menu();
            System.out.println("Nhap lua chon cua ban:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nvql.Nhap();
                    break;
                case 2:
                    nvnc.Nhap();
                    break;
                case 3:
                    nvpv.Nhap();
                    break;
                case 4:
                    System.out.println("Thong tin nhan vien  quan ly: ");
                    System.out.println(String.format("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |" 
                                                , "MaNV", "TenNV", "Trinh do", "LuongCB", "Chuyen Mon", "Phu cap", "Tong Luong"));
                    nvql.Xuat();
                    break;
                case 5:
                    System.out.println("thong tin nhan vien nghien cuu: ");
                    System.out.println(String.format("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |" 
                                                , "MaNV", "TenNV", "Trinh do", "LuongCB", "Chuyen Mon", "Phu cap", "Tong Luong"));
                    nvnc.Xuat();
                    break;
                case 6:
                    System.out.println("Thong tin nhan vien phuc vu: ");
                    System.out.println(String.format("| %-10s | %-10s | %-10s | %-10s | %-10s |" 
                                                , "MaNV", "TenNV", "Trinh do", "LuongCB", "Tong Luong"));
                    nvpv.Xuat();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                default:
                    chon = 0;
                    break;
            }
        } while (chon != 0);
    }

    public static void Menu() {
        System.out.println("-----------Menu----------");
        System.out.println("1. Nhap 1 nhan vien quan ly");
        System.out.println("2. Nhap 1 nhan vien nghien cuu");
        System.out.println("3. Nhap 1 nhan vien phuc vu");
        System.out.println("4. Xuat thong tin 1 nhan vien quan ly");
        System.out.println("5. Xuat thong tin 1 nhan vien nghien cuu");
        System.out.println("6. Xuat thong tin 1 nhan vien phuc vu");
        System.out.println("0. Thoat");
        System.out.println("-----------Menu----------");
    }
}
