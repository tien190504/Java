package bai1;


public class Demo1 {
    public static void main(String[] args) {
        hangDienMay dienMay = new hangDienMay("HDM01", "May giat", 10000000, 12, 220, 1500);
        hangThucPham thucPham = new hangThucPham("HTP01", "Sua tuoi", 50000f, new myDate(15, 3, 2020),
                new myDate(15, 9, 2024));

        System.out.println("**Hang Dien May");
        System.out.println(String.format("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |", 
                                            "Ma Hang", "Ten Hang", "Gia" , "Thoi Gian Bao Hanh", "Dien Ap", "Cong Suat"));
        System.out.println(dienMay.toString() + "\n");



        System.out.println("**Hang Thuc Pham");
        System.out.println(String.format("| %-10s | %-10s | %-10s | %-5s | %-5s  |", 
                                    "Ma Hang", "Ten Hang", "Gia" , "Ngay san xuat", "Ngay het han"));

        System.out.println(thucPham.toString());
    }
}
