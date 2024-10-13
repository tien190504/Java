package bai1;

public class NVPV extends NhanVien{

    //Contructor
    public NVPV() {
        super();
    }
    public NVPV(String maNV, String tenNV, String trinhDo, double luongCoBan) {
        super(maNV, tenNV, trinhDo, luongCoBan);
    }

    public void Nhap() {
        super.Nhap();
    }
    public void Xuat() {
        super.Xuat();
        String output = String.format("| %-10.0f |", tinhLuong());
        System.out.println(output);
    }
    @Override
    public double tinhLuong() {
        // TODO Auto-generated method stub
        return getLuongCB();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format(" |%-10.0f", tinhLuong());
    }
}
