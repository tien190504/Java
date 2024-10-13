package bai3;
import java.util.*;
public class NhanVienQuanLy extends NhanVienCLCao{
    private double PhuCapCV;

    public NhanVienQuanLy() {
        super();
        
    }

    public NhanVienQuanLy(float luong, Date ngayNhanViec, PhongBanKhoa pbk, String hoTen, int namSinh, String trinhDo,
            String nganh, String noiDaoTao, double phuCapCV) {
        super(luong, ngayNhanViec, pbk, hoTen, namSinh, trinhDo, nganh, noiDaoTao);
        this.PhuCapCV = phuCapCV;
    }

    public double getPhuCapCV() {
        return PhuCapCV;
    }

    public void setPhuCapCV(double phuCapCV) {
        PhuCapCV = phuCapCV;
    }
    private Scanner sc = new Scanner(System.in);
    public void input() {
        super.input();
        System.out.println("Nhap phu cap cong viec:");
        setPhuCapCV(sc.nextDouble());
    }

    @Override
    public String toString() {
        return super.toString() + getPhuCapCV() + "|"; 
    }
}
