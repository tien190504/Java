package bai1;

import java.util.Scanner;

public class HinhCN implements Hinh {
    private float dai, rong;

    public HinhCN() {
    }

    public HinhCN(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void Nhap() throws ArithmeticException {
        // TODO Auto-generated method stub
        try {
            System.out.println("Nhap chieu dai:");
            setDai(sc.nextFloat());
            System.out.println("Nhap chieu rong:");
            setRong(sc.nextFloat());
            if(getDai() <= 0 || getRong() <= 0) {
                throw new ArithmeticException("Chieu dai va chieu rong phai lon hon 0");
            } else if(getDai() <= getRong()) {
                throw new ArithmeticException("Chieu dai phai lon hon chieu rong");
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
        return getDai() * getRong();
    }

    @Override
    public void Xuat() {
        // TODO Auto-generated method stub
        System.out.println("Chieu dai hinh chu nhat la: " + getDai());
        System.out.println("Chieu rong hinh chu nhat la: " + getRong());
        System.out.println("Dien tich hinh chu nhat la: " + DienTich());
    }
}
