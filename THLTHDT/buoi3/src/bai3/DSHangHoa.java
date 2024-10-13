package bai3;
import bai1.*;
import java.util.*;
public class DSHangHoa extends hangHoa{
    private ArrayList<hangHoa> dshh;
    
    public DSHangHoa() {
        this.dshh = new ArrayList<hangHoa>();
    }
    public void themHangHoa(hangHoa h) {
        this.dshh.add(h);
    }

    public void xuatDanhSachTheoLoaiHang(int loaiHang) {
        for (hangHoa hanghoa : dshh) {
            if (hanghoa instanceof hangDienMay && loaiHang == 1) {
                System.out.println(((hangDienMay) hanghoa).toString());
                System.out.println();
            } else if (hanghoa instanceof hangThucPham && loaiHang == 2) {
                System.out.println(((hangThucPham) hanghoa).toString());
                System.out.println();
            }
        }
        if (loaiHang != 1 && loaiHang != 2) {
            System.out.println("Loại hàng không hợp lệ!");
        }
    }
}
