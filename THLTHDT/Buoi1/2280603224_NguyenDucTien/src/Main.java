import java.util.*;
import bai2.*;
import bai5.*;
import bai6.*;
import bai10.*;
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
                    bai1.main();
                    break;
                case 2:
                    bai2.main();
                    break;
                case 3:
                    bai3.main();
                    break;
                case 4:
                    bai4.main();
                    break;
                case 5:
                    bai5.main();
                    break;
                case 6:
                    bai6.main();
                    break;
                case 7:
                    bai7.main();
                    break;
                case 8:
                    bai8.main();
                    break;
                case 9:
                    bai9.main();
                    break;
                case 10:
                    bai10.main();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Vui long nhap lai!");
            }
        }while(chon != 0);
        sc.close();
    }
    public static void Menu(){ 
        System.out.println("\n-----------MENU----------");
        System.out.println("1: Bai 1");
        System.out.println("2: Bai 2");
        System.out.println("3: Bai 3");
        System.out.println("4: Bai 4");
        System.out.println("5: Bai 5");
        System.out.println("6: Bai 6");
        System.out.println("7: Bai 7");
        System.out.println("8: Bai 8");
        System.out.println("9: Bai 9");
        System.out.println("10: Bai 10");
    }
}
