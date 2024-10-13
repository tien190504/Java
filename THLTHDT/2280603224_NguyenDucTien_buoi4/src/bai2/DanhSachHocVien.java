/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;
import bai1.HocVien;
import java.util.ArrayList;
/**
 *
 * @author Nitro 5
 */
public class DanhSachHocVien{
    private ArrayList<HocVien> dshv;
    
    public DanhSachHocVien() {
        dshv = new ArrayList<>();
    }

    public DanhSachHocVien(ArrayList<HocVien> dshv) {
        this.dshv = dshv;
    }

    public void setDshv(ArrayList<HocVien> dshv) {
        this.dshv = dshv;
    }

    public ArrayList<HocVien> getDshv() {
        return dshv;
    }
    
    public void them1HV(HocVien hv) {
        dshv.add(hv);
    }
    
    
    

    public void InDSHV() {
        System.out.println("Danh sach hoc vien da nhap");
        for(HocVien hv : dshv) {
            System.out.println(hv);
        }
    }
}

