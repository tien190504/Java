/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Nitro 5
 */
public class Demo2 {
    public static void main() {
        PhanSo ps1 = new PhanSo();
        System.out.println("Enter the first faction:");
        ps1.input();
        ps1.output();
        PhanSo ps2 = new PhanSo();
        System.out.println("\nEnter the second fraction:");
        ps2.input();
        ps2.output();
        // PhanSo ps1 = new PhanSo(2, 6);
        // ps1.output();
        // PhanSo ps2 = new PhanSo(4, 8);
        // ps2.output();

        ps1.Tonghaiphanso(ps1, ps2);
        ps1.Hieuhaiphanso(ps1, ps2);
        ps1.Tichhaiphanso(ps1, ps2);
        ps1.Thuonghaiphanso(ps1, ps2);
    }
}
