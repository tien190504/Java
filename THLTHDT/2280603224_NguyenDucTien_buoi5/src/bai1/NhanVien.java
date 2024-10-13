
package bai1;

import java.util.Scanner;


public abstract class NhanVien {
    private String maNV;
    private String tenNV;
    private String trinhDo;
    private double luongCoBan;

    public final static Scanner sc = new Scanner(System.in);
    public NhanVien(String maNV, String tenNV, String trinhDo, double luongCoBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.trinhDo = trinhDo;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getTringDo() {
        return trinhDo;
    }


    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setTringDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }


    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    public void input() {
        System.out.println("Nhap ma nhan vien: ");
        this.maNV = sc.nextLine();
        System.out.println("Nhap ten nhan vien: ");
        this.tenNV = sc.nextLine();
        System.out.println("Nhap trinh do nhan vien: ");
        this.trinhDo = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        this.luongCoBan = sc.nextDouble();
    }
    
    public abstract double tinhLuong();

    @Override
    public String toString() {
        return String.format("|%-10s|%-10s|%-10s|%-10.1f", getMaNV(), getTenNV(), getTringDo(), getLuongCoBan()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
    
}
