import java.util.Scanner;

public class TTSV {
    private String name;
    private int toan, ly, hoa;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getToan() {
        return toan;
    }
    public void setToan(int toan) {
        this.toan = toan;
    }
    public int getLy() {
        return ly;
    }
    public void setLy(int ly) {
        this.ly = ly;
    }
    public int getHoa() {
        return hoa;
    }
    public void setHoa(int hoa) {
        this.hoa = hoa;
    }
    public void Nhap() throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Nhap ten: ");
            name = sc.nextLine();
            System.out.println("Nhap diem toan:");
            toan = sc.nextInt();
            System.out.println("Nhap diem Ly:");
            ly = sc.nextInt();
            System.out.println("Nhap diem hoa:");
            hoa = sc.nextInt();
            if (name.isEmpty()) {
                throw new NullPointerException("Ten bi rong");
            }
            if (toan < 0 || toan > 10 || ly < 0 || ly > 10 || hoa < 0 || hoa > 10) {
                throw new ArithmeticException("diem phai nam trong khoang tu 0 den 10");
            }

        } catch (NullPointerException e) {
            // TODO: handle exception
            System.err.println("error " + e.getLocalizedMessage());
            return;
        } catch(ArithmeticException e) {
            System.err.println("error " + e.getLocalizedMessage());
            return;
        } finally {
            sc.close();
        }
        System.out.println("ten sinh vien " + getName());
        System.out.println("DTB cua sinh vien la " + dtb());
        System.out.println("Xep loai cua sinh vien la " + xepLoai());
    }
    public float dtb() {
        return (float)(getToan() + getLy() + getHoa()) / 3;
    }
    public String xepLoai() {
        if(dtb() < 4.0) {
            return "F";
        } else if(dtb() >= 4.0 && dtb() < 5.5) {
            return  "D";
        } else if (dtb() >= 5.5 && dtb() < 7) {
            return "C";
        } else if(dtb() >= 7 && dtb() < 8.5) {
            return "B";
        } else{
            return "A";
        }
    }
    public static void main(String[] args) {
        new TTSV().Nhap();
    }
}
