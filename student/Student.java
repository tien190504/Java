import java.util.*;

public class Student {/* */
    private String id;
    private String name;
    private float avgScore;

    Scanner scanner = new Scanner(System.in);

    // Constructors, getters, and setters

    public Student() {
        super();
    }
    public Student(String id, String name, float avgScore) {
        super();
        this.id = id;
        this.name = name;
        this.avgScore = avgScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public void input() {
        System.out.print("Nhap ma sinh vien: ");
        id = scanner.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        name = scanner.nextLine();
        System.out.print("Nhap diem trung binh sinh vien: ");
        avgScore = scanner.nextFloat();
        scanner.nextLine(); 
    }

    public void output() {
        System.out.printf("ID: %s\n", id);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Diem Trung Binh: %.2f\n", avgScore);
        System.out.println("Rank: " + rank());
    }

    public String rank() {
        if (avgScore >= 8.0) {
            return "Gioi";
        } else if (avgScore >= 6.5) {
            return "Kha";
        } else if (avgScore >= 5.0) {
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    public boolean checkID(String ID){
        return this.id.equalsIgnoreCase(ID);
    }
}