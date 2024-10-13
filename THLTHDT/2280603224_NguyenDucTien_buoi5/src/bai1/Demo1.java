
package bai1;

import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {
        NhanVien nvql = new NhanVienQuanLy();
        NhanVien nvnc = new NhanVienNghienCuu();
        NhanVien nvpv = new NhanVienPhucVu();
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            Menu();
            System.out.println("Nhap lua chon cua ban");
            chon = sc.nextInt();
            switch(chon) {
                case 1:
                    nvql.input();
                    break;
                case 2:
                    nvnc.input();
                    break;
                case 3:
                    nvpv.input();
                    break;
                case 4:
                    System.out.println(nvql);
                    break;
                case 5:
                    System.out.println(nvnc);
                    break;    
                case 6:
                    System.out.println(nvpv);
                    break;    
                
                default:
                    chon = 0;
            }
        }while(chon != 0);
        sc.close();
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
