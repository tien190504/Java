/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Nitro 5
 */
public class NhanVienNghienCuu extends NhanVien{
    private String chuyenMon;
    private double phuCapDocHai;

    public NhanVienNghienCuu() {
        super(null, null, null, 0);
        this.chuyenMon = null;
        this.phuCapDocHai = 0;
        
    }

    

    
    public NhanVienNghienCuu(double phuCapDocHai, String maNV, String tenNV, String trinhDo, String chuyenMon, double luongCoBan) {
        super(maNV, tenNV, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    
    public void setPhuCapDocHai(double phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }

    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }

    
    public void input() {
        super.input();
        System.out.println("Nhap chuyen mon:");
        this.chuyenMon = sc.nextLine();
        System.out.println("Nhap phu cap doc hai:");
        this.phuCapDocHai = sc.nextDouble();
    }
    @Override
    public double tinhLuong() {
        return getLuongCoBan() + getPhuCapDocHai();
    }

    
    @Override
    public String toString() {
        return super.toString() + 
                String.format("|%-10s|%-10.1f|%-10.1f|", getChuyenMon(), getPhuCapDocHai(), tinhLuong()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
