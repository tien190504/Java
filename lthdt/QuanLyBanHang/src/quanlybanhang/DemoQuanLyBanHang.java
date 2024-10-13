package QuanLyBanHang;

import java.util.Scanner;
import quanlybanhang.KhachHang;


public class DemoQuanLyBanHang {

    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        do{
            Menu();
            System.out.println("Lua chon cua ban:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    
                    break;
                default:
                    chon = 0;
            }
        }while(chon != 0);

    }
    
    public static void Menu() {
        System.out.println("-----------Menu-----------");
        System.out.println("1. Them khach hang");
        System.out.println("2. Them san pham");
        System.out.println("3. Tim san pham theo ma");
        System.out.println("4. Cap nhat don gia san pham");
        System.out.println("5. Khach hang mua nhieu nhat");
        System.out.println("6. Tong doanh thu cua hang");
        System.out.println("0. Thoat");
        System.out.println("-----------Menu-----------");
    }
    
    
//    public static void tenKH() {
//        
//    }
//    
//    public static void tenSP() {
//        
//    }
}
        