/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CD {
    private int maCD;
    private String tenCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

    public CD() {
    }
    
    
    public CD(int maCD, String tenCD, String caSy, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ma CD");
        maCD = sc.nextInt();
        
        System.out.println("Nhap ten CD");
        sc.nextLine();
        tenCD = sc.nextLine();
        System.out.println("Nhap ten ca sy");
        caSy = sc.nextLine();
        System.out.println("Nhap so luong bai hat");
        soBaiHat = sc.nextInt();
        System.out.println("Nhap gia CD");
        giaThanh = sc.nextDouble();
    }
    /**
     *
     * @param o
     * @return
     */
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return maCD == cd.maCD;
    }

    @Override
    public String toString() {
        String format = String.format("|%15s|%15s|%15s|%15s|%15s|\n","Ma CD", "Ten CD", "Ca sy", "So bai hat", "Gia thanh");
        return format + String.format("|%15d|%15s|%15s|%15d|%15.0f|\n", maCD,tenCD,caSy,soBaiHat,giaThanh);
    }
    
    
}
