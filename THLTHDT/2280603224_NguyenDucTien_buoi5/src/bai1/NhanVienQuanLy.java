/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Nitro 5
 */
public class NhanVienQuanLy extends NhanVien{
    private String chuyenMon;
    private double phuCapChucVu;

    public NhanVienQuanLy() {
        super(null, null, null, 0);
        this.chuyenMon = null;
        this.phuCapChucVu = 0;
    }
    
    public NhanVienQuanLy(String maNV, String tenNV, String trinhDo, String chuyenMon, double luongCoBan, double phuCapChucVu) {
        super(maNV, tenNV, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapChucVu = phuCapChucVu;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
    
    

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }
    
    public void input() {
        super.input();
        System.out.println("Nhap chuyen mon:");
        this.chuyenMon = sc.nextLine();
        System.out.println("Nhap phu cap chuc vu:");
        this.phuCapChucVu = sc.nextDouble();
    }
    @Override
    public double tinhLuong() {
        return getLuongCoBan() + getPhuCapChucVu();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("|%-10s|%-10.1f|%-10.1f",getChuyenMon(), getPhuCapChucVu(), tinhLuong()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
