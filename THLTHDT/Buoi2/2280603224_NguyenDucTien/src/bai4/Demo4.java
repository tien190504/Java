package bai4;
import java.util.*;

public class Demo4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> dsNV = new ArrayList<>();
        NhanVien nv1 = new NhanVien("007",  "Nguyen Van A", 2500000, 3);
        dsNV.add(nv1);

        NhanVien nv2 = new NhanVien();
        nv2.setMaSo("112");
        nv2.setHoTen("Tran Thi B");
        nv2.setHeSoLuong(2.5f);
        nv2.setLuongCoBan(3000000);
        dsNV.add(nv2);

        NhanVien nv3 = new NhanVien();
        nv3.input();
        dsNV.add(nv3);

        System.out.println("Danh sach nhan vien truoc khi doi ten:");
        for (NhanVien nhanVien : dsNV) {
            nhanVien.output();
        }
        //Doi ten nhan vien theo ma so
        System.out.println("Nhap ma nhan vien can doi ten:");
        String maNVCanDoi = sc.nextLine();
        for (NhanVien nv : dsNV) {
            if(nv.getMaSo().equals(maNVCanDoi)) {
                System.out.print("Nhap ten can doi: ");
                String tenNVmoi = sc.nextLine();
                nv.setHoTen(tenNVmoi);
                break;
            } else {
                System.out.println("Khong tim thay ma nhan vien");
            }
        }

        System.out.println("Danh sach nhan vien sau khi doi ten:");
        for (NhanVien nhanVien : dsNV) {
            nhanVien.output();
        }
        float heSoLuongMax = 0;
        for (NhanVien nhanVien : dsNV) {
            if(nhanVien.getHeSoLuong() > heSoLuongMax) {
                heSoLuongMax = nhanVien.getHeSoLuong();
            }
        }
        System.out.println("Nhan vien co he so luong lon nhat la:");
        for (NhanVien nhanVien : dsNV) {
            if(heSoLuongMax == nhanVien.getHeSoLuong()) {
                System.out.println(nhanVien.getHoTen());
            }
        }
        System.out.printf("%-20s %-20s %-20s\n", "Ma NV", "Ho Ten", "Luong");
        for (NhanVien nv : dsNV) {
            System.out.printf("%-20s %-20s %10.2f\n", nv.getMaSo(), nv.getHoTen(), nv.tinhLuong());
        }
        System.out.println("So luong nhan vien co trong danh sach: " + dsNV.size());
    }
}
