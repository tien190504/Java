package bai1;
import java.util.*;
public class NVNC extends NhanVien{
    private String chuyenMon;
    private double phuCapDH;

    //Contructor
    
    public NVNC(String maNV, String tenNV, String trinhDo, double luongCB, String chuyenMon, double phuCapDH) {
        super(maNV, tenNV, trinhDo, luongCB);
        this.chuyenMon = chuyenMon;
        this.phuCapDH = phuCapDH;
    }
    //Getter and setter
    public String getChuyenMon() {
        return chuyenMon;
    }
    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
    public double getPhuCapDH() {
        return phuCapDH;
    }
    public void setPhuCapDH(double phuCapDH) {
        this.phuCapDH = phuCapDH;
    }

    @Override
    public double tinhLuong() {
        // TODO Auto-generated method stub
        return getLuongCB() + getPhuCapDH();
    }
    
    
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuyen mon:");
        this.chuyenMon = sc.nextLine();
        System.out.println("Nhap phu cap doc hai:");
        this.phuCapDH = sc.nextDouble();
    }

    public void Xuat() {
        super.Xuat();
        String output = String.format(" | %-10s | %-10.0f | %-10.0f |", getChuyenMon(), getPhuCapDH(), tinhLuong());
        System.out.println(output);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format(" | %-10s | %-10.0f | %-10.0f |", getChuyenMon(), getPhuCapDH(), tinhLuong());
    }
    
}
