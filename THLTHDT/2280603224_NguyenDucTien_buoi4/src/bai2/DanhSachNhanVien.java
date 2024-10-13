/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;
import bai1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author Nitro 5
 */
public class DanhSachNhanVien {
    ArrayList<NhanVien> dsnv;
    
    public DanhSachNhanVien() {
        dsnv = new ArrayList<>();
    }

    public DanhSachNhanVien(ArrayList<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }

    public void setDsnv(ArrayList<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }

    public ArrayList<NhanVien> getDsnv() {
        return dsnv;
    }
    
    public void them1NV(NhanVien nv) {
        dsnv.add(nv);
    }
    
    public void InDSNV() {
        for(NhanVien nv : dsnv) {
            System.out.println(nv);
        }
    }
    
}
