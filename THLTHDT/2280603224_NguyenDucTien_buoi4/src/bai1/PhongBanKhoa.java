/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Nitro 5
 */
public class PhongBanKhoa {
    public String maPBK;
    public String tenPBK;

    public PhongBanKhoa() {
    }

    public PhongBanKhoa(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }

    public String getMaPBK() {
        return maPBK;
    }

    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }
    
    private Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Nhap ma phong ban: ");
        setMaPBK(sc.nextLine());
        System.out.println("Nhap ten phong ban: ");
        setTenPBK(sc.nextLine());
    }

    @Override
    public String toString() {
        return String.format("|%-10s|%-10s", this.maPBK, this.tenPBK); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
