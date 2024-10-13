/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;

/**
 *
 * @author Nitro 5
 */
public class Demo1 {
    public static void Menu() {
        System.out.println("-----------Menu----------");
        System.out.println("1. Nhap 1 hoc vien");
        System.out.println("2. Nhap 1 nhan vien");
        System.out.println("3. Xuat thong tin 1 hoc vien");
        System.out.println("4. Xuat thong tin 1 nhan vien");
        System.out.println("5. Thoat");
        System.out.println("-----------Menu----------");
    }
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        HocVien hv = new HocVien();
        NhanVien nv = new NhanVien();
        do{
            Menu();
            System.out.println("Nhap lua chon cua ban:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    hv.input();
                    break;
                case 2: 
                    nv.input();
                    break;
                case 3:
                    System.out.println("Thong tin hoc vien");
                    System.out.println(String.format("|%-10s|%-10s|%-5s|%-5s|%-5s|", "Ho ten", "Nam sinh", "Diem1", "Diem2", "Diem3"));
                    System.out.println(hv);
                    break;
                case 4:
                    System.out.println("Thong tin nhan vien");
                    System.out.println(String.format("|%-10s|%-10s|%-9s|%-10s|%-10s|%-10s|", "Ho ten", "Nam sinh", "Ngaynhan viec", "Ma pbk", "Ten pbk", "Luong"));
                    System.out.println(nv);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                default:
                    chon = 0;
            }
            
        }while(chon != 0);
        
    }
    
    
}
