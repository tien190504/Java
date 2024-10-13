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
public class SanPham {
    protected String maSP;
    protected String tenSP;
    protected double dongiaSP;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double dongiaSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.dongiaSP = dongiaSP;
    }

    public double getDongiaSP() {
        return dongiaSP;
    }

    public void setDongiaSP(double dongiaSP) {
        this.dongiaSP = dongiaSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        maSP = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenSP = sc.nextLine();
        System.out.println("Nhap gia: ");
        dongiaSP = sc.nextDouble();
    }
//    public void Output(){
//        String n = "Ma hang", m = "Ten hang", g = "Gia";
//        System.out.printf("|%20s|%20s|%20s|\n",n,m,g);
//        System.out.printf("|%20s|%20s|%20.2f|\n",this.maSP,this.tenSP,this.dongiaSP);
//        System.out.println();
//
//    }
    @Override
    public String toString() {
		// TODO Auto-generated method stub
		return String.format("|%-10s|%-10s|%-5.2f", getMaSP(), getTenSP(), getDongiaSP());
	}
}
