package bai10;

public class Demo1 {
    public  static void main(String[] args) {
        // PhanSo ps1 = new PhanSo();
        // System.out.println("Nhap phan so thu nhat");
        // ps1.input();
        // ps1.output();
        // PhanSo ps2 = new PhanSo();
        // System.out.println("\nNhap phan so thu hai");
        // ps2.input();
        // ps2.output();
        PhanSo ps1 = new PhanSo(2, 6);
        ps1.output();
        PhanSo ps2 = new PhanSo(4, 8);
        ps2.output();

        ps1.Tonghaiphanso(ps1, ps2);
        ps1.Hieuhaiphanso(ps1, ps2);
        ps1.Tichhaiphanso(ps1, ps2);
        ps1.Thuonghaiphanso(ps1, ps2);
    }
}
