/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;
import bai1.NhanVien;
import bai1.PhongBanKhoa;
import java.util.Scanner;
import myDate.myDate;
/**
 *
 * @author Nitro 5
 */
public class NhanVienCLCao extends NhanVien{
    private String trinhDo;
    private String Nganh;
    private String noiDaoTao;

    public NhanVienCLCao() {
        super();
    }

    public NhanVienCLCao(String trinhDo, String Nganh, String noiDaoTao, float luong, myDate ngayNhanViec, PhongBanKhoa pbk, String hoTen, int namSinh) {
        super(luong, ngayNhanViec, pbk, hoTen, namSinh);
        this.trinhDo = trinhDo;
        this.Nganh = Nganh;
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

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
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
                String.format("%-10s|%-10s|%-10s|", getTrinhDo(), getNganh(), getNoiDaoTao()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
