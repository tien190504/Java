/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybanhang;
import QuanLyBanHang.SanPham;
import java.util.ArrayList;
/**
 *
 * @author Nitro 5
 */
public class KhachHang{
    private String maKH;
    private String tenKH;
    private ArrayList<SanPham> dssp;

    

    public KhachHang(String maKH, String tenKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.dssp = new ArrayList<>();
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public ArrayList<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }

    
    public void themSanPham(SanPham sp) {
        this.dssp.add(sp);
    }
    
    public int soLuongSanPhamDaMua() {
        return dssp.size();
    }

    @Override
    public String toString() {
        return String.format("|%s|%s|", getMaKH(), getTenKH()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
