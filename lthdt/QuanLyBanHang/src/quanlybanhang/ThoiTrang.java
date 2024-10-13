/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang;

import java.util.Scanner;

/**
 *
 * @author Nitro 5
 */
public class ThoiTrang extends SanPham{
    private int thoigianBH;

    public ThoiTrang() {
        super();
    }

    public ThoiTrang(String maSP, String tenSP, float dongiaSP, int thoigianBH) {
        super(maSP, tenSP, dongiaSP);
        this.thoigianBH = thoigianBH;
    }

    public void setThoigianBH(int thoigianBH) {
        this.thoigianBH = thoigianBH;
    }

    public int getThoigianBH() {
        return thoigianBH;
    }
    
    public void input() {
        System.out.println("Nhap thoi han bao hanh");
        Scanner sc = new Scanner(System.in);
        setThoigianBH(sc.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + String.format("|%-5d|", getThoigianBH()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
