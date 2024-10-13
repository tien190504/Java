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
public class NVQuanLy extends NhanVienCLCao{
    private double PhuCapCV;

    public NVQuanLy() {
        super();
    }

    public NVQuanLy(double PhuCapCV, String trinhDo, String Nganh, String noiDaoTao, float luong, myDate ngayNhanViec, PhongBanKhoa pbk, String hoTen, int namSinh) {
        super(trinhDo, Nganh, noiDaoTao, luong, ngayNhanViec, pbk, hoTen, namSinh);
        this.PhuCapCV = PhuCapCV;
    }

    public double getPhuCapCV() {
        return PhuCapCV;
    }

    public void setPhuCapCV(double PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }
    
    public void input() {
        super.input();
        System.out.println("Nhap phu cap cong viec:");
        Scanner sc = new Scanner(System.in);
        setPhuCapCV(sc.nextDouble());
    }

    @Override
    public String toString() {
        return super.toString() + getPhuCapCV() + "|"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
