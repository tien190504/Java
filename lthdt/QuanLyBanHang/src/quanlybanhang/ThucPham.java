package QuanLyBanHang;
public class ThucPham extends SanPham {
    private myDate ngSX;
    private myDate ngHHSD;

    public ThucPham() {
        super();
    }

    public ThucPham(myDate ngSX, myDate ngHHSD, String maSP, String tenSP, float dongiaSP) {
        super(maSP, tenSP, dongiaSP);
        this.ngSX = ngSX;
        this.ngHHSD = ngHHSD;
    }

    public void setNgSX(myDate ngSX) {
        this.ngSX = ngSX;
    }

    public myDate getNgSX() {
        return ngSX;
    }

    public void setNgHHSD(myDate ngHHSD) {
        this.ngHHSD = ngHHSD;
    }

    
    public myDate getNgHHSD() {
        return ngHHSD;
    }

    
    public void input() {
        super.input();
      
        System.out.println("Nhap ngay san xuat (dd/mm/yy): ");
        this.ngSX.input();
      
        System.out.println("Nhap ngay het han (dd/mm/yy): ");
        this.ngHHSD.input();
      }
      

    @Override
    public String toString() {
        return super.toString()
                + String.format(" | %-5s | %-5s |", this.getNgSX().toString(), this.getNgHHSD().toString());
    }

}
