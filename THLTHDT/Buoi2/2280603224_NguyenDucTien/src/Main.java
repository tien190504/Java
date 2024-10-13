/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import bai1.*;
import bai2.*;
import bai3.*;
import bai4.*;
import bai5.*;
import bai6.*;

import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            Menu();
            System.out.print("Lua chon cua ban: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    Demo1.main();
                    break;
                case 2:
                    Demo2.main();
                    break;
                case 3:
                    Demo3.main();
                    break;
                case 4:
                    Demo4.main();
                    break;
                case 5:
                    Demo5.main();
                    break;
                case 6:
                    Demo6.main();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Vui long nhap lai!");
            }
        }while(chon != 0);
    }
    public static void Menu() {
        System.out.println("\n-----------MENU----------");
        System.out.println("1: Bai 1");
        System.out.println("2: Bai 2");
        System.out.println("3: Bai 3");
        System.out.println("4: Bai 4");
        System.out.println("5: Bai 5");
        System.out.println("6: Bai 6");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("-----------MENU----------");
    }
}
