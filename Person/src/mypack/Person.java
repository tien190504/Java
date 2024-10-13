package mypack;

public abstract class Person {
    private
    String name;
    int age;
    float height;
    public void eat() {
        System.out.println("Person is eating....");
    }
    //Contructor
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void setAge(int age) {
        if(age >= 0 && age <= 100) {
            this.age = age;
        }  else {
            System.out.println("Invalid Age! Please enter a number between 0 and  100.");
        }
    }
    public void setName(String name){
        this.name = name;
    }

    public void setHeight(float height) {
        if (height > 0.5f) {
            this.height = height;
        } else {
            System.out.println("Invalid Height! It should be greater than 0.5");
        }
    }
    public void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
    }
}

