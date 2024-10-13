package bai1;

import java.util.Scanner;

public class HinhTron implements Hinh {
    private float banKinh;

    public HinhTron() {
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void Nhap() throws ArithmeticException {
        // TODO Auto-generated method stub
        try {
            System.out.println("Nhap ban kinh hinh tron:");
            setBanKinh(sc.nextFloat());
            if(getBanKinh() <= 0) {
                throw new ArithmeticException("Ban kinh phai lon hon 0");
            }
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            return;
        }
    }

    @Override
    public float DienTich() {
        // TODO Auto-generated method stub
        return getBanKinh() * getBanKinh() * PI;
    }

    @Override
    public void Xuat() {
        // TODO Auto-generated method stub
        
        System.out.println("Ban kinh hinh tron la: " + getBanKinh());
        System.out.println("Dien tich hinh tron la: " + DienTich());
    }
}
