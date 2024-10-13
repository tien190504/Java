package bai2;
import bai1.*;
import java.util.*;
public class HocVien {
    private String tenHV;
    private ArrayList<NVQL> dsNVQL;
    private ArrayList<NVNC> dsNVNC;
    private ArrayList<NVPV> dsNVPV;
    
    //Contructor
    public HocVien(String tenHV) {
        this.tenHV = tenHV;
        this.dsNVQL = new ArrayList<>();
        this.dsNVNC = new ArrayList<>();
        this.dsNVPV = new ArrayList<>();
    }
    //Getter and setter
    public ArrayList<NVQL> getDsNVQL() {
        return dsNVQL;
    }

    public void setDsNVQL(ArrayList<NVQL> dsNVQL) {
        this.dsNVQL = dsNVQL;
    }

    public ArrayList<NVNC> getDsNVNC() {
        return dsNVNC;
    }

    public void setDsNVNC(ArrayList<NVNC> dsNVNC) {
        this.dsNVNC = dsNVNC;
    }

    public ArrayList<NVPV> getDsNVPV() {
        return dsNVPV;
    }

    public void setDsNVPV(ArrayList<NVPV> dsNVPV) {
        this.dsNVPV = dsNVPV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }
    
    public void themNV(NhanVien nv) {
        if(nv instanceof NVQL) {
            dsNVQL.add((NVQL)nv);
        } else if(nv instanceof NVNC) {
            dsNVNC.add((NVNC)nv);
        } else if(nv instanceof NVPV) {
            dsNVPV.add((NVPV)nv);
        }
    }

    public void hienThiDSNV() {
        System.out.println("Danh sach nhan vien cua hoc vien " + this.tenHV);
        System.out.println("Nhan vien quan ly");
        System.out.println(String.format("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |" 
        , "MaNV", "TenNV", "Trinh do", "LuongCB", "Chuyen Mon", "Phu cap", "Tong Luong"));
        for (NVQL nv : dsNVQL) {
            System.out.println(nv);
        }        
        System.out.println("Nhan vien nghien cuu");
        System.out.println(String.format("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |" 
                                    , "MaNV", "TenNV", "Trinh do", "LuongCB", "Chuyen Mon", "Phu cap", "Tong Luong"));
        for (NVNC nv : dsNVNC) {
            System.out.println(nv);
        }
        System.out.println("Danh sach nhan vien phuc vu");
        System.out.println(String.format("| %-10s | %-10s | %-10s | %-10s | %-10s |" 
                                    , "MaNV", "TenNV", "Trinh do", "LuongCB", "Tong Luong"));
        for (NVPV nv : dsNVPV) {
            System.out.println(nv);
        }
    }



    public double tinhTongLuongNV() {
        double tongLuong = 0;
        for (NVQL nv : dsNVQL) {
            tongLuong += nv.tinhLuong();
        }
        for (NVNC nv : dsNVNC) {
            tongLuong += nv.tinhLuong();
        }
        for(NVPV nv : dsNVPV) {
            tongLuong += nv.tinhLuong();
        }
        
        return tongLuong;
    }
}
