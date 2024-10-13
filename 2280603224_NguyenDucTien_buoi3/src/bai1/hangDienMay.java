package bai1;

import java.util.*;;

public class hangDienMay extends hangHoa {
    private int thoiHanBH;
    private float dienAp;
    private float congSuat;

    public hangDienMay() {
        super();
        this.thoiHanBH = 0;
        this.dienAp = 0;
        this.congSuat = 0;
    }

    public hangDienMay(String maHang, String tenHang, float gia, int thoiHanBH, float dienAp, float congSuat) {
        super(maHang, tenHang, gia);
        this.thoiHanBH = thoiHanBH;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public void setThoiHanBH(int thoiHanBH) {
        this.thoiHanBH = thoiHanBH;
    }

    public float getThoiHanBH() {
        return this.thoiHanBH;
    }

    public void setDienAp(float dienAp) {
        this.dienAp = dienAp;
    }

    public float getDienAp() {
        return this.dienAp;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    public float getCongSuat() {
        return this.congSuat;
    }

    private Scanner sc = new Scanner(System.in);

    public void input() {
        super.input();
        System.out.print("Nhap thoi gian bao hanh: ");
        this.setThoiHanBH(sc.nextInt());
        System.out.print("Nhap dien ap: ");
        this.setDienAp(sc.nextFloat());
        System.out.print("Nhap cong suat: ");
        this.setCongSuat(sc.nextFloat());
    }

    public String toString() {
        return super.toString()
                + String.format(" | %-18d | %-10.2f | %-10.2f |", this.thoiHanBH, this.dienAp, this.congSuat);
    }

}
