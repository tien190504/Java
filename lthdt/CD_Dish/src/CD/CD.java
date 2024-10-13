package CD;

import java.util.Scanner;

public class CD {
    private int maCD;
    private String tenCD;
    private String CaSy;
    private int SoBaiHat;
    private float giaThanh;

    public CD() {
    }

    public CD(int maCD, String tenCD, String caSy, int soBaiHat, float giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        CaSy = caSy;
        SoBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCaSy() {
        return CaSy;
    }

    public void setCaSy(String caSy) {
        CaSy = caSy;
    }

    public int getSoBaiHat() {
        return SoBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        SoBaiHat = soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Nhap ma cd:");
        setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten cd:");
        setTenCD(sc.nextLine());
        System.out.println("Nhap ca sy");
        setCaSy(sc.nextLine());
        System.out.println("Nhap so bai hat");
        setSoBaiHat(sc.nextInt());
        System.out.println("Nhap gia thanh");
        setGiaThanh(sc.nextFloat());
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (this == obj)
            return true;
        if (obj == null || getClass() != null)
            return false;
        CD cd = (CD) obj;
        return maCD == cd.maCD;
    }

    @Override
    public String toString() {
        return String.format("|%-10d|%-10s|%-10s|%-10d|%-10.0f|", getMaCD(), getTenCD(), getCaSy(), getSoBaiHat(), getGiaThanh());
    }
}
