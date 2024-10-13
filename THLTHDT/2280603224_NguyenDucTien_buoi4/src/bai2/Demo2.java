/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import bai1.HocVien;
import bai1.NhanVien;
import java.util.Scanner;

/**
 *
 * @author Nitro 5
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        DanhSachHocVien dshv = new DanhSachHocVien();
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        do {
            Menu();
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    HocVien hv = new HocVien();
                    hv.input();
                    dshv.them1HV(hv);
                    break;
                case 2:
                    NhanVien nv = new NhanVien();
                    nv.input();
                    dsnv.them1NV(nv);
                    break;
                    
                case 3:
                    System.out.println(String.format("|%-10s|%-10s|%-5s|%-5s|%-5s|", "Ho ten", "Nam sinh", "Diem1", "Diem2", "Diem3"));
                    dshv.InDSHV();
                    break;
                
                case 4:
                    System.out.println(String.format("|%-10s|%-10s|%-9s|%-10s|%-10s|%-10s|", "Ho ten", "Nam sinh", "Ngaynhan viec", "Ma pbk", "Ten pbk", "Luong"));
                    dsnv.InDSNV();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                default:
                    chon = 0;
            }
        }while(chon != 0);
    }
    
    public static void Menu() {
        System.out.println("-----------Menu----------");
        System.out.println("1. Nhap 1 hoc vien");
        System.out.println("2. Nhap 1 nhan vien");
        System.out.println("3. Xuat thong tin danh sach hoc vien");
        System.out.println("4. Xuat thong tin danh sach nhan vien");
        System.out.println("5. Thoat");
        System.out.println("-----------Menu----------");
    }
}
