package bai1;
import java.util.*;
public abstract class NhanVien {
    private String maNV;
    private String tenNV;
    private String trinhDo;
    private double luongCB;
    //Contructor
    public NhanVien() {}
    public NhanVien(String maNV, String tenNV, String trinhDo, double luongCB) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.trinhDo = trinhDo;
        this.luongCB = luongCB;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
    

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien:");
        maNV = sc.nextLine();
        System.out.println("Nhap ten nhan vien:");
        tenNV = sc.nextLine();
        System.out.println("Nhap trinh do:");
        trinhDo = sc.nextLine();
        System.out.println("Nhap luong can ban:");
        luongCB = sc.nextDouble();
    }

    public void Xuat() {
        String output = String.format("| %-10s | %-10s | %-10s | %-10.0f", getMaNV(), getTenNV(), getTrinhDo(), getLuongCB());
        System.out.print(output);
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return String.format("| %-10s | %-10s | %-10s | %-10.0f", getMaNV(), getTenNV(), getTrinhDo(), getLuongCB());
    }
}
