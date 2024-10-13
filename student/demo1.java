import java.util.*;

public class demo1 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Student> List = new ArrayList<> ();

    public static void main(String[] agrs) {
        int chon;
        do {
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Doi ten sinh vien");
            System.out.println("4. Sinh vien co diem trung binh cao nhat");
            System.out.println("0. Thoat!");
            System.out.println("Lua chon cua ban ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("\n--------Them sinh vien------");
                    Student s = new Student();
                    s.input();
                    List.add(s);
                    System.out.println("Them sinh vien thanh cong!");
                    break;
                case 2:
                    System.out.println("----Danh sach sinh vien------");
                    if(List.isEmpty()) {
                        System.out.println("Danh sach sinh vien rong!");
                    } else {
                        for(Student student : List) {
                            student.output();
                            System.out.println("-----------------");
                        }
                    }
                    break;
                case 3:
                    rename();
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    
            }
        } while(chon != 0);
        sc.close();
    } 
    public static void rename() {
        sc.nextLine();
        System.out.println("Nhap ma sinh vien can doi: ");
        String id = sc.nextLine();
        for (Student student : List) {
            if(student.checkID(id)) {
                System.out.println("Nhap ten moi: ");
                String newName = sc.nextLine();
                student.setName(newName);
            } else {
                System.out.println("Ma sinh vien khong ton tai!");
            }
        }
    }
    public static void studentMaxAvg() {
        Student max = ();
        for(Student student : List) {
            if(student.getAvgScore() > max.getAvgScore()) {

            }
        }
    }
}
