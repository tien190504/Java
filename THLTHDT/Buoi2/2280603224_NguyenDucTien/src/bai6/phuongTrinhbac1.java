package bai6;
import java.util.Scanner;
public class phuongTrinhbac1 {
    private int a, b;

    private Scanner sc = new Scanner(System.in);
    //Contructor
    public phuongTrinhbac1() {
        this.a = 0;
        this.b = 0;
    }
    public phuongTrinhbac1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //Getter and Setter
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return this.a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getB() {
        return this.b;
    }

    public void input() {
        System.out.println("Phuong trinh bac nhat: ax + b = 0");
        System.out.print("Nhap a: ");
        this.a = sc.nextInt();
        System.out.print("Nhap b: ");
        this.b = sc.nextInt();
        
    }
    public void giaiPT() {
        if (a == 0) {
        System.out.println("Phuong trinh vo nghiem");
        } else {
    // Giải phương trình ax + b = 0
        float x = (float)-b / a;
        System.out.println("x = " + String.format("%.2f", x));
        }
    }
}
