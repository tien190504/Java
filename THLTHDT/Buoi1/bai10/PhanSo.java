package bai10;
import java.util.*;

public class PhanSo {
    private int tu;
    private int mau;
    //Contructor
    public PhanSo(){}
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public void settu(int tu) {
        this.tu = tu;
    }
    public int gettu() {
        return this.tu;
    }
    public void setmau(int mau) {
        this.mau = mau;
    }
    public int getmau() {
        return this.mau;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.tu = sc.nextInt();
        System.out.print("Nhap mau so: ");
        this.mau = sc.nextInt();
        sc.close();
    }

    private int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public void phansotoigian() {
        int i = gcd(this.tu, this.mau);
        this.settu(this.gettu() / i);
        this.setmau(this.getmau() / i);
    }

    public void output() {
        phansotoigian();
        System.out.println("Phan so da nhap toi gian la: " + gettu() + "/" + getmau());
    }
    public void Tonghaiphanso(PhanSo ps1, PhanSo ps2) {
        int tuso = ps1.tu * ps2.mau + ps2.tu * ps1.mau;
        int mauso = ps1.mau * ps2.mau;
        PhanSo psTong = new PhanSo(tuso, mauso);
        phansotoigian();
        System.out.println("Tong hai phan so da nhap = " + psTong.tu + "/" + psTong.mau);
    }
    public void Hieuhaiphanso(PhanSo ps1, PhanSo ps2) {
        int tuso = ps1.tu * ps2.mau - ps2.tu * ps1.mau;
        int mauso = ps1.mau * ps2.mau;
        PhanSo psHieu = new PhanSo(tuso, mauso);
        phansotoigian();
        System.out.println("Hieu hai phan so da nhap = " + psHieu.tu + "/" + psHieu.mau);
    }
    public void Tichhaiphanso(PhanSo ps1, PhanSo ps2) {
        int tuso = ps1.tu * ps2.tu;
        int mauso = ps1.mau * ps2.mau;
        PhanSo psTich = new PhanSo(tuso, mauso);
        phansotoigian();
        System.out.println("Tich hai phan so da nhap = " + psTich.tu + "/" + psTich.mau);
    }
    public void Thuonghaiphanso(PhanSo ps1, PhanSo ps2) {
        int tuso = ps1.tu * ps2.mau;
        int mauso = ps1.mau * ps2.tu;
        PhanSo psThuong = new PhanSo(tuso, mauso);
        phansotoigian();
        System.out.println("Thuong hai phan so da nhap = " + psThuong.tu + "/" + psThuong.mau);
    }
}
