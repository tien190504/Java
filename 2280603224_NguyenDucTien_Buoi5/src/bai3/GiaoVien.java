package bai3;
import java.util.*;
public class GiaoVien extends NhanVienCLCao{
    private double thuLaoGD;

    public GiaoVien() {
        super();
    }

    public GiaoVien(float luong, Date ngayNhanViec, PhongBanKhoa pbk, String hoTen, int namSinh, String trinhDo,
            String nganh, String noiDaoTao, double thuLaoGD) {
        super(luong, ngayNhanViec, pbk, hoTen, namSinh, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    public double getThuLaoGD() {
        return thuLaoGD;
    }

    public void setThuLaoGD(double thuLaoGD) {
        this.thuLaoGD = thuLaoGD;
    }
    Scanner sc = new Scanner(System.in);
    public void input() {
        super.input();
        System.out.println("Nhap thu lao giang day");
        setThuLaoGD(sc.nextDouble());
    }
    
    
    @Override
    public String toString() {
        return super.toString() + String.format("|%-10.2f|", getThuLaoGD());
    }
}
