/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;
/**
 *
 * @author Nitro 5
 */
public class HinhVuong implements Hinh{
    private float canh;

    public HinhVuong() {
    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void Nhap() throws ArithmeticException {
        // TODO Auto-generated method stub
        try {
            System.out.println("Nhap canh hinh vuong:");
            setCanh(sc.nextFloat());
            if (getCanh() <= 0) {
                throw new ArithmeticException("Canh hinh vuong phai lon hon 0");
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
        return getCanh() * getCanh();
    }

    @Override
    public void Xuat() {
        // TODO Auto-generated method stub
        System.out.println("Canh hinh vuong la " + getCanh());
        System.out.println("Dien tich hinh vuong la " + DienTich());
    }

}
