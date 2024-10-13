package bai1;
import java.util.*;
public class NVQL extends NhanVien{
    private String chuyenMon;
    private double phuCapCV;

    //Contructor
    public NVQL() {
        super();
    }
    public NVQL(String maNV, String tenNV, String trinhDo, double luongCB, String chuyenMon, double phuCapCV) {
        super(maNV, tenNV, trinhDo, luongCB);
        this.chuyenMon = chuyenMon;
        this.phuCapCV = phuCapCV;
    }

    //Getter and setter
    public String getChuyenMon() {
        return chuyenMon;
    }
    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
    public double getPhuCapCV() {
        return phuCapCV;
    }
    public void setPhuCapCV(double phuCapCV) {
        this.phuCapCV = phuCapCV;
    }

    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuyen mon:");
        this.chuyenMon = sc.nextLine();
        System.out.println("Nhap phu cap cong viec:");
        this.phuCapCV = sc.nextDouble();
    }

    public void Xuat() {
        super.Xuat();
        String output = String.format(" | %-10s | %-10.0f | %-10.0f", getChuyenMon(), getPhuCapCV(), tinhLuong());
        System.out.println(output);
    }



    @Override
    public double tinhLuong() {
        return getLuongCB() + getPhuCapCV();
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("| %-10s | %-10.0f | %-10.0f |", getChuyenMon(), getPhuCapCV(), tinhLuong());
    }
}
