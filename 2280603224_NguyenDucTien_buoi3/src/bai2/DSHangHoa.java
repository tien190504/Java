package bai2;
import bai1.*;


public class DSHangHoa {
    private hangHoa[] danhSach;
    private int soLuonghangHoa;
    private static final int HHMAX = 100;

    public DSHangHoa() {
        this.danhSach = new hangHoa[HHMAX];
        this.soLuonghangHoa = 0;
    }

    public void themhangHoa(hangHoa hangHoa) {
        if (soLuonghangHoa < danhSach.length) {
            danhSach[soLuonghangHoa++] = hangHoa;
        } else {
            System.out.println("Danh sach day!");
        }
    }

    public void xuatDanhSachTheoLoaiHang(int loaiHang) {
        for (int i = 0; i < soLuonghangHoa; i++) {
            if (danhSach[i] instanceof hangDienMay && loaiHang == 1) {
                System.out.println(((hangDienMay) danhSach[i]).toString());
                System.out.println();
            } else if (danhSach[i] instanceof hangThucPham && loaiHang == 2) {
                System.out.println(((hangThucPham) danhSach[i]).toString());
                System.out.println();
            }
        }
        if (loaiHang != 1 && loaiHang != 2) {
            System.out.println("Loại hàng không hợp lệ!");
        }
    }
    

}
