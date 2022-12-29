package Lab8;

class Students {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Lab84 {
    public static void main(String[] args) {
        Students s1 = new Students("Long", 24);
        Students s2 = new Students("Kien", 29);
        s1.display();
        s2.display();
    }
}
