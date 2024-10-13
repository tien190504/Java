/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapNhom7;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class DemoQuanLyBanHang {
    public static void main(String[] args) {
        int chon,loai;
        SanPham sp; 
        QuanLyKhachHang danhsachKH = new QuanLyKhachHang();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int dem = 0;
        do{
            System.out.println("1: Them khach hang: ");
            System.out.println("2: Xuat danh sach khach hang: ");
            System.out.println("3: Xuat ra khach hang mua nhieu nhat: ");
            System.out.println("4: Tim san pham theo ma san pham: ");
            System.out.println("5: Doi don gia san pham: ");
            System.out.println("0. Thoat");
            System.out.println("Moi chon chuc nang: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    if(dem == 0){
                        SanPham sp1 = new SanPham("SP01", "Sua", 100000);
                        ThucPham sp2 = new ThucPham("tp01", "Banh mi", 10000, new Date(22, 12, 2023), new Date(22, 1, 2024));
                        ThoiTrang sp3 = new ThoiTrang("tt01", "Ao thun", 120000, 12);
                        SanPham sp4 = new SanPham("SP02", "Xe may", 30000000);
                        ThucPham sp5 = new ThucPham("tp02", "Banh xeo", 15000, new Date(11, 11, 2022), new Date(19, 4, 2024));
                        KhachHang kh1 = new KhachHang("KH01", "Nguyen Van A");
                        kh1.themDS(sp1);;
                        kh1.themDS(sp2);
                        kh1.themDS(sp3);
                        kh1.themDS(sp4);
                        kh1.themDS(sp5);
                        danhsachKH.Them1KH(kh1);
                        dem++;
                        break;
                    }else if (dem == 1){
                        SanPham sp6 = new SanPham("SP03", "Xoong", 100000);
                        ThucPham sp7 = new ThucPham("tp03", "Keo mut", 1500, new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2022 - 2020 + 1) + 2020), new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2024 - 2022 + 1) + 2022));
                        ThoiTrang sp8 = new ThoiTrang("tt02", "Ao khoac", 230000, random.nextInt(24)+1);
                        ThucPham sp9 = new ThucPham("tp04", "Keo deo", 15000, new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2022 - 2020 + 1) + 2020), new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2024 - 2022 + 1) + 2022));
                        ThoiTrang sp10 = new ThoiTrang("tt03", "Quan kaki", 270000, random.nextInt(24)+1);
                        KhachHang kh2 = new KhachHang("KH02", "Nguyen Van B");
                        kh2.themDS(sp6);;
                        kh2.themDS(sp7);
                        kh2.themDS(sp8);
                        kh2.themDS(sp9);
                        kh2.themDS(sp10);
                        danhsachKH.Them1KH(kh2);
                        dem++;
                        break;
                    }else if (dem == 2){
                        SanPham sp11 = new SanPham("SP04", "Combo muong dua", 500000);
                        ThucPham sp12 = new ThucPham("tp05", "Thach dua", 12000, new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2022 - 2020 + 1) + 2020), new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2024 - 2022 + 1) + 2022));
                        ThoiTrang sp13 = new ThoiTrang("tt04", "Day chuyen", 350000, random.nextInt(24)+1);
                        SanPham sp14 = new SanPham("SP05", "Khan tam", 20000);
                        ThoiTrang sp15 = new ThoiTrang("tt05", "Quan jean", 400000, random.nextInt(24)+1);
                        KhachHang kh3 = new KhachHang("KH03", "Nguyen Van C");
                        kh3.themDS(sp11);
                        kh3.themDS(sp12);
                        kh3.themDS(sp13);
                        kh3.themDS(sp14);
                        kh3.themDS(sp15);
                        danhsachKH.Them1KH(kh3);
                        dem++;
                        break;
                    }else if (dem == 3){
                        SanPham sp16 = new SanPham("SP06", "Thau nhua", 30000);
                        ThucPham sp17 = new ThucPham("tp06", "Trai cay say", 200000, new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2022 - 2020 + 1) + 2020), new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2024 - 2022 + 1) + 2022));
                        ThoiTrang sp18 = new ThoiTrang("tt06", "Ao somi", 300000, random.nextInt(24)+1);
                        ThoiTrang sp19 = new ThoiTrang("tt07", "Quan tay", 420000, random.nextInt(24)+1);
                        ThoiTrang sp20 = new ThoiTrang("tt08", "Giay au", 600000, random.nextInt(24)+1);
                        KhachHang kh4 = new KhachHang("KH04", "Nguyen Van D");
                        kh4.themDS(sp16);
                        kh4.themDS(sp17);
                        kh4.themDS(sp18);
                        kh4.themDS(sp19);
                        kh4.themDS(sp20);
                        danhsachKH.Them1KH(kh4);
                        dem++;
                        break;
                    }else if (dem == 4){
                        SanPham sp21 = new SanPham("SP07", "Combo gia vi", 50000);
                        ThucPham sp22 = new ThucPham("tp07", "Ca", 12000, new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2022 - 2020 + 1) + 2020), new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2024 - 2022 + 1) + 2022));
                        ThucPham sp23 = new ThucPham("tp08", "Tom", 12000, new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2022 - 2020 + 1) + 2020), new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2024 - 2022 + 1) + 2022));
                        ThucPham sp24 = new ThucPham("tp09", "Muc", 12000, new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2022 - 2020 + 1) + 2020), new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2024 - 2022 + 1) + 2022));
                        ThucPham sp25 = new ThucPham("tp10", "Thit bo", 12000, new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2022 - 2020 + 1) + 2020), new Date(random.nextInt(31)+1, random.nextInt(12)+1, random.nextInt(2024 - 2022 + 1) + 2022));
                        SanPham sp26 = new SanPham("SP08", "Combo ", 50000);
                        KhachHang kh5 = new KhachHang("KH05", "Nguyen Thi A");
                        kh5.themDS(sp21);
                        kh5.themDS(sp22);
                        kh5.themDS(sp23);
                        kh5.themDS(sp24);
                        kh5.themDS(sp25);
                        kh5.themDS(sp26);
                        danhsachKH.Them1KH(kh5);
                        dem++;
                        break;
                    }
                    break;
                case 2:
                    danhsachKH.xuatDanhSachKH();
                    break;
                case 3:
                    System.out.println("Khach hang mua nhieu san pham nhat la: ");
                    danhsachKH.KhachHangMax();
                    break;
                case 4: 
                    String macantim;
                    System.out.println("Nhap ma san pham can tim: ");
                    sc.nextLine();
                    macantim = sc.nextLine();
                    System.out.println("San pham can tim la: \n" + danhsachKH.timSanPham(macantim));
                    break;
                case 5:
                    String macandoi;
                    System.out.println("Nhap ma san pham can doi don gia: ");
                    sc.nextLine();
                    macandoi = sc.nextLine();
                    System.out.println("Nhap don gia can cap nhat: ");
                    double donGiaCapNhat;
                    donGiaCapNhat = sc.nextDouble();
                    danhsachKH.capNhatDonGiaSP(macandoi, donGiaCapNhat);
                    break;
                case 6:
                    System.out.println("Tong doanh thu cua cua hang la: " + danhsachKH.tongDoanhThu());
                    break;
                default: chon = 0;
                break;
            }
        }while(chon != 0);
    }
}
