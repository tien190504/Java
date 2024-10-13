package bai5;
import java.util.*;
public class studentbai5 {
    private String id;
    private String name;
    private float avgScore;

    Scanner scanner = new Scanner(System.in);

    // Constructors, getters, and setters

    public studentbai5(String id, String name, float avgScore) {
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
        System.out.print("Enter student ID: ");
        id = scanner.nextLine();
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student average score: ");
        avgScore = scanner.nextFloat();
        scanner.nextLine(); 
    }

    public void output() {
        System.out.printf("ID: %s\n", id);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Average score: %.2f\n", avgScore);
        System.out.println("Rank: " + rank());
    }

    public String rank() {
        if (avgScore >= 8.0) {
            return "Excellent";
        } else if (avgScore >= 6.5) {
            return "Good";
        } else if (avgScore >= 5.0) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}