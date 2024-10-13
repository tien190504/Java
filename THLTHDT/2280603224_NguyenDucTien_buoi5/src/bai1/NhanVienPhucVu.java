/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Nitro 5
 */
public class NhanVienPhucVu extends NhanVien {

    public NhanVienPhucVu() {
        super(null, null, null, 0);
        sc.nextLine();
    }
    public NhanVienPhucVu(String maNV, String tenNV, String trinhDo, double luongCoBan) {
        super(maNV, tenNV, trinhDo, luongCoBan);
    }

    public void input() {
        super.input();
    }
    @Override
    public double tinhLuong() {
        return getLuongCoBan();
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
