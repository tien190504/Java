/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
import myDate.myDate;
/**
 *
 * @author Nitro 5
 */
public class NhanVien extends ConNguoi{
    private float luong;
    private myDate ngayNhanViec = new myDate();
    PhongBanKhoa pbk= new PhongBanKhoa();

    public NhanVien() {
        super();
    }

    public NhanVien(float luong, myDate ngayNhanViec, PhongBanKhoa pbk, String hoTen, int namSinh) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.pbk = pbk;
    }

    

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public void setNgayNhanViec(myDate ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public myDate getNgayNhanViec() {
        return ngayNhanViec;
    }

    public PhongBanKhoa getPbk() {
        return pbk;
    }

    public void setPbk(PhongBanKhoa pbk) {
        this.pbk = pbk;
    }
    
    private Scanner sc = new Scanner(System.in);
    public void input() {
        super.input();
        System.out.print("Nhap luong nhan vien: ");
        setLuong(sc.nextInt());
        System.out.println("Nhap ngay nhan viec: ");
        this.ngayNhanViec.Input();
        this.pbk.input();
    }

    @Override
    public String toString() {
        return super.toString() + "|" +  ngayNhanViec + pbk +
                String.format("|%-5.0f|", this.luong); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
