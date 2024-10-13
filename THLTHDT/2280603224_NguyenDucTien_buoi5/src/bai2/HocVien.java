/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;
import bai1.*;
import java.util.ArrayList;
/**
 *
 * @author Nitro 5
 */
public class HocVien {
    private String tenHocVien;
    private ArrayList<NhanVienQuanLy> dsNVQL;
    private ArrayList<NhanVienNghienCuu> dsNVNC;
    private ArrayList<NhanVienPhucVu> dsNVPV;

    public HocVien() {
    }

    
    public HocVien(String tenHocVien) {
        this.tenHocVien = tenHocVien;
        dsNVQL = new ArrayList<>();
        dsNVNC = new ArrayList<>();
        dsNVPV = new ArrayList<>();
    }

    public String getTenHocVien() {
        return tenHocVien;
    }

    public void setTenHocVien(String tenHocVien) {
        this.tenHocVien = tenHocVien;
    }

    public ArrayList<NhanVienQuanLy> getDsNVQL() {
        return dsNVQL;
    }

    public void setDsNVQL(ArrayList<NhanVienQuanLy> dsNVQL) {
        this.dsNVQL = dsNVQL;
    }

    public ArrayList<NhanVienNghienCuu> getDsNVNC() {
        return dsNVNC;
    }

    public void setDsNVNC(ArrayList<NhanVienNghienCuu> dsNVNC) {
        this.dsNVNC = dsNVNC;
    }

    public ArrayList<NhanVienPhucVu> getDsNVPV() {
        return dsNVPV;
    }

    public void setDsNVPV(ArrayList<NhanVienPhucVu> dsNVPV) {
        this.dsNVPV = dsNVPV;
    }
    
    public void themNV(NhanVien nv) {
        if(nv instanceof NhanVienQuanLy) {
            dsNVQL.add((NhanVienQuanLy)nv);
        } else if(nv instanceof NhanVienNghienCuu) {
            dsNVNC.add((NhanVienNghienCuu)nv);
        } else if(nv instanceof NhanVienPhucVu) {
            dsNVPV.add((NhanVienPhucVu)nv);
        }
    }
    
    public void hienThiDSNV() {
        System.out.println("Danh sach nhan vien cua hoc vien " + this.tenHocVien);
        System.out.println("Nhan vien quan ly");
        for (NhanVienQuanLy nv : dsNVQL) {
            System.out.println(nv);
        }
        System.out.println("Nhan vien nghien cuu");
        for (NhanVienNghienCuu nv : dsNVNC) {
            System.out.println(nv);
        }
        System.out.println("Danh sach nhan vien phuc vu");
        for (NhanVienPhucVu nv : dsNVPV) {
            System.out.println(nv);
        }
    }
    
    public NhanVien timKiemNhanVienTheoMa(String maNV) {
        for (NhanVien nv : dsNVQL) {
            if (nv.getMaNV().equals(maNV)) {
                return nv;
            }
        }
        for (NhanVien nv : dsNVNC) {
            if (nv.getMaNV().equals(maNV)) {
                return nv;
            }
        }
        for (NhanVien nv : dsNVPV) {
            if (nv.getMaNV().equals(maNV)) {
                return nv;
            }
        }
        return null;
    }
    
    public double tinhTongLuongNV() {
        double tongLuong = 0;
        for (NhanVienQuanLy nv : dsNVQL) {
            tongLuong += nv.tinhLuong();
        }
        for (NhanVienNghienCuu nv : dsNVNC) {
            tongLuong += nv.tinhLuong();
        }
        for(NhanVienPhucVu nv : dsNVPV) {
            tongLuong += nv.tinhLuong();
        }
        
        return tongLuong;
    }
}
