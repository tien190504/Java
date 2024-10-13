import mypack.*;

public class App {

    public static void main(String[] args) {
        Student[] student = new Student[2];
        student[0] = new Student("Tien", 20, 1.76f, 3.5f, "22DTHE7", "SV02");
        
        student[1] = new Student("Tilo", 20, 1.94f, 4.0f,  "22DTHE7", "SV03");

        for (Student person : student) {
            person.getInfo();
        }
    }
}
