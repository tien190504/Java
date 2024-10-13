/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapNhom7;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class KhachHang{
    private String maKH;
    private String tenKH;
    private ArrayList<SanPham> dsSP;
    
    public KhachHang(String maKH, String tenKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.dsSP = new ArrayList<>();
       
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
    public ArrayList<SanPham> getDanhSachSanPham() {
        return dsSP;
    }

    public void setDanhSachSanPham(ArrayList<SanPham> dsSP) {
        this.dsSP = dsSP;
    }
    
    public void themDS(SanPham sp){
        this.dsSP.add(sp);
    }
    
    public int soLuongSanPhamDaMua() {
        return dsSP.size();
    }
    
    private Scanner sc = new Scanner(System.in);
            
    public void input(){
        System.out.println("Nhap ma khach hang: ");
        maKH = sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        tenKH = sc.nextLine();
        
    }
         
    @Override
    public String toString() {
        return String.format("|%s|%s|", getMaKH(), getTenKH()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
