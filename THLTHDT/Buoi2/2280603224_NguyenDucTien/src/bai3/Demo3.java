/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Nitro 5
 */
public class Demo3 {
    public static void main() {
        Codinate a = new Codinate();
        a.input();
        System.out.print("Toa do diem A: ");
        a.print();
        System.out.print("Diem doi xung qua truc hoanh diem A: ");
        Codinate a_dx = a.DXtrucHoanh();
        a_dx.print();
        Codinate b = new Codinate();
        b.input();
        System.out.print("Toa do diem B: ");
        b.print();
        System.out.print("Diem doi xung qua truc hoanh diem B: ");
        Codinate b_dx = b.DXtrucHoanh();
        b_dx.print();
        Codinate sum = a.Sum(b);
        System.out.print("Tong toa do hai diem: ");
        sum.print();
    }
}
