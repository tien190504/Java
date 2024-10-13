package bai3;
import java.util.*;
public class HocVien extends ConNguoi {

    private float diem1;
    private float diem2;
    private float diem3;

    public HocVien() {
    }

    public HocVien(String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    private Scanner sc = new Scanner(System.in);
    public void input() {
        super.input();
        System.out.println("Nhap diem 1: ");
        setDiem1(sc.nextFloat());
        System.out.println("Nhap diem 2: ");
        setDiem2(sc.nextFloat());
        System.out.println("Nhap diem 3: ");
        setDiem3(sc.nextFloat());
    }

    @Override
    public String toString() {
        return super.toString() + 
                String.format("|%-5.2f|%-5.2f|%-5.2f|", this.diem1, this.diem2, this.diem3); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
