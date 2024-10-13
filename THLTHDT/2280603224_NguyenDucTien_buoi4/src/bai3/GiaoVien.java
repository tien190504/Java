/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import bai1.PhongBanKhoa;
import java.util.Scanner;
import myDate.myDate;

/**
 *
 * @author Nitro 5
 */
public class GiaoVien extends NhanVienCLCao{
    private double thuLaoGD;
    private static final Scanner sc = new Scanner(System.in);

    
    public GiaoVien() {
        super();
    }

    public GiaoVien(double thuLaoGD, String trinhDo, String Nganh, String noiDaoTao, float luong, myDate ngayNhanViec, PhongBanKhoa pbk, String hoTen, int namSinh) {
        super(trinhDo, Nganh, noiDaoTao, luong, ngayNhanViec, pbk, hoTen, namSinh);
        this.thuLaoGD = thuLaoGD;
    }

    public double getThuLaoGD() {
        return thuLaoGD;
    }

    public void setThuLaoGD(double thuLaoGD) {
        if (thuLaoGD < 0) {
            throw new IllegalArgumentException("Thu lao phai duong");
        }
        this.thuLaoGD = thuLaoGD;
    }

    public double getTongThuNhap() {
        return getLuong() + thuLaoGD;
    }


    public void input() {
        super.input();
        System.out.println("Nhap thu lao giang day");
        setThuLaoGD(sc.nextDouble());
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("|%-10.2f|", getThuLaoGD()));
        return sb.toString();
    }

    
    
    
    
}
