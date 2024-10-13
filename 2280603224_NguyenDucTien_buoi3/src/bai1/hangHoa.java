package bai1;

import java.util.*;

public class hangHoa {
    private String maHang;
    private String tenHang;
    private float gia;

    public hangHoa() {
        this.maHang = "";
        this.tenHang = "";
        this.gia = 0;
    }

    public hangHoa(String maHang, String tenHang, float gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setGia(float gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Gia hang phai lon hon 0");
        }
    }

    public float getGia() {
        return gia;
    }

    private Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Nhap ma hang: ");
        this.setMaHang(sc.nextLine());
        System.out.print("Nhap ten hang: ");
        this.setTenHang(sc.nextLine());
        System.out.print("Nhap gia hang: ");
        this.setGia(sc.nextFloat());
    }

    public String toString() {
        return String.format("| %-10s | %-10s | %-10.0f", this.maHang, this.tenHang, this.gia);
    }

}
