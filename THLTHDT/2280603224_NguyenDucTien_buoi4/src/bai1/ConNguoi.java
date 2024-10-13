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
public class ConNguoi {
    private String hoTen;
    private int namSinh;
    
    public ConNguoi() {}
    public ConNguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    private Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.print("Nhap ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap nam sinh: ");
        setNamSinh(sc.nextInt());
    }
    @Override
    public String toString() {
        return String.format("|%-10s|%-10d", this.hoTen, this.namSinh);
    }
}
