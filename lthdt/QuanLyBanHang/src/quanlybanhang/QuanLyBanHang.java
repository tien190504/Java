/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang;

import java.util.ArrayList;
import quanlybanhang.KhachHang;

/**
 *
 * @author Nitro 5
 */
public class QuanLyBanHang {
    private ArrayList<KhachHang> danhSachKH;

    public QuanLyBanHang() {
        danhSachKH = new ArrayList<>();
    }
    
    public void themKhachHang(KhachHang kh) {
        danhSachKH.add(kh);
    }
    
    /**
     *
     * @param maKH
     * @param sp
     */
    public void themSanPham(String maKH, SanPham sp) {
        for(KhachHang kh : danhSachKH) {
            if(kh.getMaKH().equals(maKH)) {
                kh.themSanPham(sp);
            }
        }
    }
    
    public void xuatDanhSachKH() {
        for(KhachHang kh : danhSachKH) {
            System.out.println(kh);
            for(SanPham sp : kh.getDssp()) {
                System.out.println(sp);
            }
        }
    }
    
    public KhachHang KhachHangMax() {
        KhachHang khMuaNhieuNhat = null;
        int soLuongMuaNhieuNhat = 0;
        for (KhachHang kh : danhSachKH) {
            int soLuongMua = kh.soLuongSanPhamDaMua();
            if (soLuongMua > soLuongMuaNhieuNhat) {
                soLuongMuaNhieuNhat = soLuongMua;
                khMuaNhieuNhat = kh;
            }
        }
        return khMuaNhieuNhat;
    }
    
}
