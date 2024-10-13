/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapNhom7;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyKhachHang {
    ArrayList<KhachHang> dsKH;
    private int soKH = 0 ;
    public QuanLyKhachHang() {
        dsKH = new ArrayList<>();
    }
    //Bai 2
    public void Them1KH(KhachHang kh) {
        dsKH.add(kh);
        soKH++;
    }
    //Bai 3
    public void themSanPham(String maKH, SanPham sp) {
        for(KhachHang kh : dsKH) {
            if(kh.getMaKH().equals(maKH)) {
                kh.themDS(sp);
            }
        }
    }
    
    public void xuatDanhSachKH() {
        for(KhachHang kh : dsKH) {
            System.out.println("------"+ kh +"------");
            for(SanPham sp : kh.getDanhSachSanPham()) {
                System.out.println(sp);
            }
        }
    }
    public void KhachHangMax() {
        KhachHang khMuaNhieuNhat = null;
        int soLuongMuaNhieuNhat = 0;
        for (KhachHang kh : dsKH) {
            int soLuongMua = kh.soLuongSanPhamDaMua();
            if (soLuongMua > soLuongMuaNhieuNhat) {
                soLuongMuaNhieuNhat = soLuongMua;
                khMuaNhieuNhat = kh;
            }
        }
        KhachHang ds[] = new KhachHang[soKH];
        int dem = 0;
        for (KhachHang kh : dsKH) {
            if(kh.soLuongSanPhamDaMua() == khMuaNhieuNhat.soLuongSanPhamDaMua()){
                ds[dem] = kh;
                System.out.println(ds[dem]);
                dem++;
            }
        }
    }    
    public SanPham timSanPham(String maSP) {
        for (KhachHang kh : dsKH) {
            for (SanPham sp : kh.getDanhSachSanPham()) {
                if (sp.getMaSP().equals(maSP)) {
                    return sp;
                }
            }
        }
        return null;
    }
    
    public void capNhatDonGiaSP(String maSP, double giaMoi) {
        for (KhachHang kh : dsKH) {
            for (SanPham sp : kh.getDanhSachSanPham()) {
                if (sp.getMaSP().equals(maSP)) {
                    System.out.println("Thong tin san pham truoc khi doi don gia la: ");
                    System.out.println(sp);
                    sp.setDongiaSP(giaMoi);
                    System.out.println("Thong tin san pham sau khi doi don gia la: ");
                    System.out.println(sp);
                }
            }
        }
    }
    public double tongDoanhThu(){
        double sum = 0;
        for (KhachHang khachHang : dsKH) {
            for (SanPham sp : khachHang.getDanhSachSanPham()) {
                sum += sp.getDongiaSP();
            }
        }
        return sum;
    }
}
