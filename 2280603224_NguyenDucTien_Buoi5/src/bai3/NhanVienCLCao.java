package bai3;
import java.util.*;
public abstract class NhanVienCLCao extends NhanVien{
    private String trinhDo;
    private String Nganh;
    private String noiDaoTao;
    
    public NhanVienCLCao() {
        super();
    }
    public NhanVienCLCao(float luong, Date ngayNhanViec, PhongBanKhoa pbk, String hoTen, int namSinh, String trinhDo,
            String nganh, String noiDaoTao) {
        super(luong, ngayNhanViec, pbk, hoTen, namSinh);
        this.trinhDo = trinhDo;
        Nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }
    public String getTrinhDo() {
        return trinhDo;
    }
    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
    public String getNganh() {
        return Nganh;
    }
    public void setNganh(String nganh) {
        Nganh = nganh;
    }
    public String getNoiDaoTao() {
        return noiDaoTao;
    }
    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }

    private Scanner sc = new Scanner(System.in);
    public void input() {
        super.input();
        System.out.println("Nhap nganh: ");
        setNganh(sc.nextLine());
        System.out.println("Nhap trinh do:");
        setTrinhDo(sc.nextLine());
        System.out.println("Nhap noi dao tao:");
        setNoiDaoTao(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%-10s|%-10s|%-10s|", getTrinhDo(), getNganh(), getNoiDaoTao()); 
    }

    
}
