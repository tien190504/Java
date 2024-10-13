package bai4;
import java.util.*;
public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private float heSoLuong;
    private static int soLuongNhanVien = 0;

    private Scanner scanner = new Scanner(System.in);

    public NhanVien() {
        this.maSo = "";
        this.hoTen = "";
        this.luongCoBan = 0;
        this.heSoLuong = 1;
        soLuongNhanVien++;
    }

    public NhanVien(String maSo, String hoTen, double luongCoBan, float heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNhanVien++;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void input() {
        System.out.print("Nhap ma so: ");
        maSo = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap luong co ban: ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = scanner.nextFloat();
    }

    public void output() {
        String output = String.format("| %-5s | %-20s | %10.2f | %5.2f |\n",
        this.maSo, this.hoTen, this.luongCoBan, this.heSoLuong);
        System.out.print(output);  
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public static int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }
    public static void slnv() {
        System.out.println("So luong nhan vien: " + soLuongNhanVien);
    }
}
