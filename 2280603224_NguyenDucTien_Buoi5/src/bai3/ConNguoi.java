package bai3;
import java.util.*;
public abstract class ConNguoi {

    private String hoTen;
    private int namSinh;

    public ConNguoi() {
    }

    public ConNguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    private Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.print("Nhap ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Nhap nam sinh: ");
        setNamSinh(sc.nextInt());
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-10d ", getHoTen(), getNamSinh());
    }
}
