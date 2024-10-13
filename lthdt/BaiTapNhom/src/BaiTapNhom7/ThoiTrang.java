/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapNhom7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThoiTrang extends SanPham{
    private int thoigianBH;

    public ThoiTrang(){
        super();
    }

    public ThoiTrang(String maSP, String tenSP, double dongiaSP,int thoigianBH) {
        super(maSP,tenSP,dongiaSP);
        this.thoigianBH = thoigianBH;
    }
    
    
    public int getThoigianBH() {
        return thoigianBH;
    }

    public void setThoigianBH(int thoigianBH) {
        this.thoigianBH = thoigianBH;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
    
//        super.Input();
        
        System.out.println("Nhap thoi gian bao hanh");
        thoigianBH = sc.nextInt();
    }
//    public void Output(){
//        super.Output();
//        System.out.printf("|%15s|\n","Thoi gian bao hanh");
//        System.out.printf("|%15d|\n",thoigianBH);
//    }
    @Override
    public String toString() {
        return super.toString() + String.format("|%-5d|", getThoigianBH()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
} 
    
