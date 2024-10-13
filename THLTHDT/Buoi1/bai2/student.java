import java.util.*;
public class student {
    private 
    String id;
    String name;
    int age;
    int birth;
    float gpa;
    //Contructor
    public student() {
        super();
    }
    public student(String id, String name,int age ,int birth ,float gpa){
        super();
        this.id = id;
        this.name= name;    
        this.age = age;  
        this.birth = birth ;
        this.gpa = gpa;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student ID : ");
        this.id = sc.nextLine();
        System.out.println("Enter the Name of the student:");
        this.name = sc.nextLine();
        System.out.print("Enter the Age of the student : ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Year of birth: ");
        this.birth = sc.nextInt();
        System.out.println("Enter the GPA of the student : ");
        this.gpa = sc.nextFloat();
        sc.close();
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setBirth(int birth) {
        if (birth < 0 || birth > 2019 ) {
            System.out.println("Invalid year of Birth");
        } else {
            this.birth = birth;
        }
    }

    public int getBirth() {
        return birth;
    }
    public void setGpa(float gpa) {
        if (gpa < 0.0f || gpa > 10.0f) {
            System.out.println("Invalid GPA, it should be between 0 and 10.");
        } else {
            this.gpa = gpa;
        }
    }
    public float getGpa(){
        return gpa;
    }
    public void getInfo() {
        System.out.println("student ID: " + this.id);
        System.out.println( "Name: " + this.name);
        System.out.print("Age: " + this.age );
        System.out.println(", Birth Year: " + this.birth);
        System.out.printf("GPA: %.1f\n",this.gpa);
    }
}
