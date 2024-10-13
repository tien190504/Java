package bai1;


public class hangThucPham extends hangHoa {
    private myDate ngsx;
    private myDate nghh;

    public hangThucPham() {
        super();
        this.ngsx = new myDate();
        this.nghh = new myDate();
    }

    public hangThucPham(String maHang, String tenHang, float gia, myDate ngsx, myDate nghh) {
        super(maHang, tenHang, gia);
        this.ngsx = ngsx;
        this.nghh = nghh;
    }

    public myDate getNgsx() {
        return ngsx;
    }

    public myDate getNghh() {
        return nghh;
    }

    public void setNgsx(myDate ngsx) {
        this.ngsx = ngsx;
    }

    public void setNghh(myDate nghh) {
        this.nghh = nghh;
    }

    public void input() {
        super.input();
      
        System.out.println("Nhap ngay san xuat (dd/mm/yy): ");
        this.ngsx.input();
      
        System.out.println("Nhap ngay het han (dd/mm/yy): ");
        this.nghh.input();
      }
      

    @Override
    public String toString() {
        return super.toString()
                + String.format(" | %-5s | %-5s |", this.getNgsx().toString(), this.getNghh().toString());
    }

}
