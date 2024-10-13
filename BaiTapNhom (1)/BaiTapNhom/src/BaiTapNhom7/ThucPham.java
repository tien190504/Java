/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapNhom7;

/**
 *
 * @author Admin
 */
public class ThucPham extends SanPham{
    private Date ngaySX;
    private Date ngayHHSD;

    public ThucPham() {
        super();
    }

    public ThucPham(String maSP, String tenSP, double dongiaSP,Date ngaySX, Date ngayHHSD) {
        super(maSP, tenSP, dongiaSP);
        this.ngaySX = ngaySX;
        this.ngayHHSD = ngayHHSD;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getNgayHHSD() {
        return ngayHHSD;
    }

    public void setNgayHHSD(Date ngayHHSD) {
        this.ngayHHSD = ngayHHSD;
    }
    public void Input(){
        super.Input();
        
        System.out.println("Nhap ngay san xuat (day/month/year)");
        this.ngaySX.input();
        System.out.println("Nhap ngay het han (day/month/year)");
        this.ngayHHSD.input();
    }

//    public void Output(){
//        super.Output();
//        System.out.printf("|%15s|%15s|\n","Ngay san xuat","Ngay het han");
//        System.out.print("  " + getNgaySX() + "\t");
//        System.out.println("  " + getNgayHHSD());
//    }
    @Override
    public String toString() {
        return super.toString()
                + String.format(" | %-5s | %-5s |", this.getNgaySX().toString(), this.getNgayHHSD().toString());
    }
    
    
    
}
