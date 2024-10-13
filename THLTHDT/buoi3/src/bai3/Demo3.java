package bai3;

import java.util.Scanner;

import bai1.hangDienMay;
import bai1.hangHoa;
import bai1.hangThucPham;

public class Demo3 {
    public static void main(String[] args) {
        Byte chon, loai;
        Scanner sc = new Scanner(System.in);
        DSHangHoa dshh = new DSHangHoa();
        hangHoa h;
        do {
            System.out.println("1. Them mot mat hang vao danh sach");
            System.out.println("2. Xuat danh sach mat hang theo loai");
            System.out.println("0. Thoat");
            System.out.println("Chon chuc nang: ");
            chon = sc.nextByte();

            switch (chon) {
                case 1:
                    System.out.println("1. Hang Dien May");
                    System.out.println("2. Hang Thuc Pham");
                    System.out.println("Hay chon loai mat hang");
                    loai = sc.nextByte();
                    if(loai == 1) {
                        h = new hangDienMay();
                    } else if(loai == 2) {
                        h = new hangThucPham();
                    } else{
                        System.out.println("Loai mat hang khong hop le!");
                        continue;
                    }
                    h.input();
                    dshh.themHangHoa(h);
                    break;
            
                case 2:
                    System.out.print("Nhap loai mat hang muon xem thong tin: ");
                    System.out.println("1. Hang Dien May");
                    System.out.println("2. Hang Thuc Pham");
                    Byte loaimh = sc.nextByte();
                    dshh.xuatDanhSachTheoLoaiHang(loaimh);
                    break;
                default:
                    chon = 0;
                    break;
            }
        }while(chon != 0);
        sc.close();
    }
}
